package com.bankapp.accounts.service.impl;


import com.bankapp.accounts.dto.AccountsDto;
import com.bankapp.accounts.dto.CardsDto;
import com.bankapp.accounts.dto.CustomerDetailDto;
import com.bankapp.accounts.dto.LoansDto;
import com.bankapp.accounts.entity.Accounts;
import com.bankapp.accounts.entity.Customer;
import com.bankapp.accounts.exception.ResourceNotFoundException;
import com.bankapp.accounts.mapper.AccountsMapper;
import com.bankapp.accounts.mapper.CustomerMapper;
import com.bankapp.accounts.repository.AccountsRepository;
import com.bankapp.accounts.repository.CustomerRepository;
import com.bankapp.accounts.service.ICustomerService;
import com.bankapp.accounts.service.client.CardsFeignClient;
import com.bankapp.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;

@Service
@AllArgsConstructor
public class CustomerServiceImpl  implements ICustomerService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    @Override
    public CustomerDetailDto fetchCustomerDetails(String number ,String correlationId) {


        Customer customer = customerRepository.findByMobileNumber(number).orElseThrow(
                ()->new ResourceNotFoundException("Customer" , "mobileNumber" , number)
        );

        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                ()->new ResourceNotFoundException("Accounts" , "customerId" , customer.getCustomerId().toString())
        );

        CustomerDetailDto customerDetailDto = CustomerMapper.mapToCustomerDetailDto(customer , new CustomerDetailDto());
        customerDetailDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts,new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(correlationId,number);
        if(loansDtoResponseEntity!=null){
            customerDetailDto.setLoansDto(loansDtoResponseEntity.getBody());
        }

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(correlationId,number);
        if(cardsDtoResponseEntity!=null){
            customerDetailDto.setCardsDto(cardsDtoResponseEntity.getBody());
        }


        return customerDetailDto;
    }
}
