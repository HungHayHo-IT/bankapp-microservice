package com.bankapp.accounts.service;

import com.bankapp.accounts.dto.CustomerDetailDto;

public interface ICustomerService {

    CustomerDetailDto fetchCustomerDetails(String number,String correlationId);
}
