# bankapp-microservice
 
# Important Links
- Spring Boot - https://spring.io/projects/spring-boot
- Create SpringBoot project - https://start.spring.io
- DTO pattern blog - https://martinfowler.com/eaaCatalog/dataTransferObject.html
- Model Mapper - http://modelmapper.org/
- Map Struct - https://mapstruct.org/
- Spring Doc - https://springdoc.org/
- Open API - https://www.openapis.org/
- Lucidchart Blog - https://www.lucidchart.com/blog/ddd-event-storming
- Docker website - https://www.docker.com
- Docker hub website - https://hub.docker.com
- Buildpacks website - https://buildpacks.io
- Google Jib website - https://github.com/GoogleContainerTools/jib
- Docker compose website - https://docs.docker.com/compose/
- Twelve-Factor methodology - https://12factor.net
- Beyond the Twelve-Factor App book - https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631/
- Spring Cloud website - https://spring.io/projects/spring-cloud
- Spring Cloud Config website - https://spring.io/projects/spring-cloud-config
- Spring Cloud Bus website - https://spring.io/projects/spring-cloud-bus
- RabbitMQ website - https://www.rabbitmq.com
- Hookdeck website- https://hookdeck.com
- Spring Cloud Netflix website - https://spring.io/projects/spring-cloud-netflix
- Spring Cloud OpenFeign - https://spring.io/projects/spring-cloud-openfeign
- Netflix Blog - https://netflixtechblog.com/netflix-oss-and-spring-boot-coming-full-circle-4855947713a0
- Resilience4j website - https://resilience4j.readme.io
- Spring Cloud Gateway website - https://spring.io/projects/spring-cloud-gateway
- Stripe RateLimitter pattern blog - https://stripe.com/blog/rate-limiters
- Apache Benchmark website - https://httpd.apache.org
- Grafana website - https://grafana.com
- Grafana Loki setup - https://grafana.com/docs/loki/latest/get-started/quick-start/
- Micrometer website - https://micrometer.io
- Prometheus website - https://prometheus.io/
- Grafana Dashboards - https://grafana.com/grafana/dashboards/
- OpenTelemetry website - https://opentelemetry.io/
- OpenTelemetry automatic instrumentation - https://opentelemetry.io/docs/instrumentation/java/automatic/
- Keycloak website - https://www.keycloak.org/
- Apache Kafka website - https://kafka.apache.org
- Docker compose file for Kafka - https://github.com/bitnami/containers/blob/main/bitnami/kafka/docker-compose.yml
- Local Kubernetes Cluster with Docker Desktop - https://docs.docker.com/desktop/kubernetes/
- Kubernetes Dashboard - https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/
- Helm website - https://helm.sh
- Chocolatey website - https://chocolatey.org/
- Bitnami Helm charts GitHub repo - https://github.com/bitnami/charts
- Spring Cloud Kubernetes website - https://spring.io/projects/spring-cloud-kubernetes
- Spring Cloud Kubernetes Blog - https://spring.io/blog/2021/10/26/new-features-for-spring-cloud-kubernetes-in-spring-cloud-2021-0-0-m3
- GCP website - https://cloud.google.com
- GCP SDK installation - https://cloud.google.com/sdk/docs/install
- Kubernetes Ingress - https://kubernetes.io/docs/concepts/services-networking/ingress/
- Ingress Controllers - https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/
- Istio (Service mesh) - https://istio.io


## Maven Commands

|     Maven Command       |     Description          |
| ------------- | ------------- |
| "mvn clean install -Dmaven.test.skip=true" | Tạo file jar trong thư mục target |
| "mvn spring-boot:run" | Khởi chạy một project Spring Boot bằng Maven |
| "mvn spring-boot:build-image" | Tạo docker image bằng Buildpacks, không cần Dockerfile |
| "mvn compile jib:dockerBuild" | Tạo docker image bằng Google Jib, không cần Dockerfile |

## Docker Commands

|     Docker Command       |     Description          |
| ------------- | ------------- |
| "docker build . -t eazybytes/accounts:s4" | Tạo docker image dựa trên một Dockerfile |
| "docker run  -p 8080:8080 eazybytes/accounts:s4" | Khởi chạy một docker container dựa trên image đã cho |
| "docker images" | Liệt kê tất cả docker image hiện có trên Docker server |
| "docker image inspect image-id" | Hiển thị thông tin chi tiết của image theo image id |
| "docker image rm image-id" | Xoá một hoặc nhiều image theo image id |
| "docker image push docker.io/eazybytes/accounts:s4" | Đẩy (push) một image hoặc repository lên registry |
| "docker image pull docker.io/eazybytes/accounts:s4" | Kéo (pull) một image hoặc repository từ registry |
| "docker ps" | Hiển thị tất cả container đang chạy |
| "docker ps -a" | Hiển thị tất cả container, bao gồm cả đang chạy và đã dừng |
| "docker container start container-id" | Khởi động lại một hoặc nhiều container đã dừng |
| "docker container pause container-id" | Tạm dừng toàn bộ tiến trình trong một hoặc nhiều container |
| "docker container unpause container-id" | Bỏ tạm dừng một hoặc nhiều container |
| "docker container stop container-id" | Dừng một hoặc nhiều container đang chạy |
| "docker container kill container-id" | Buộc dừng ngay lập tức một hoặc nhiều container |
| "docker container restart container-id" | Khởi động lại một hoặc nhiều container |
| "docker container inspect container-id" | Xem thông tin chi tiết của container theo container id |
| "docker container logs container-id" | Lấy log của container theo container id |
| "docker container logs -f container-id" | Theo dõi log output của container theo container id |
| "docker container rm container-id" | Xoá một hoặc nhiều container theo container id |
| "docker container prune" | Xoá toàn bộ container đã dừng |
| "docker compose up" | Tạo và khởi chạy container dựa trên file Docker Compose đã cho |
| "docker compose down" | Dừng và xoá container, network, volume, image được tạo bởi up |
| "docker compose start" | Khởi chạy lại các container đã có sẵn mà không tạo lại |
| "docker compose stop" | Dừng các container đang chạy mà không xoá chúng |
| "docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql" | Tạo một container MySQL DB |
| "docker run -p 6379:6379 --name eazyredis -d redis" | Tạo một container Redis |
| "docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev" | Tạo một container Keycloak |

## Kubernetes Commands

|     Kubernetes Command       |     Description          |
| ------------- | ------------- |
| "kubectl apply -f filename" | Tạo deployment/service/configmap dựa trên một file YAML đã cho |
| "kubectl get all" | Lấy tất cả thành phần (component) bên trong cluster |
| "kubectl get pods" | Lấy thông tin chi tiết của tất cả pod trong cluster |
| "kubectl get pod pod-id" | Lấy thông tin chi tiết của một pod theo pod id |
| "kubectl describe pod pod-id" | Lấy thông tin chi tiết hơn của một pod theo pod id |
| "kubectl delete pod pod-id" | Xoá một pod khỏi cluster theo pod id |
| "kubectl get services" | Lấy thông tin chi tiết của tất cả service trong cluster |
| "kubectl get service service-id" | Lấy thông tin chi tiết của một service theo service id |
| "kubectl describe service service-id" | Lấy thông tin chi tiết hơn của một service theo service id |
| "kubectl get nodes" | Lấy thông tin chi tiết của tất cả node trong cluster |
| "kubectl get node node-id" | Lấy thông tin chi tiết của một node |
| "kubectl get replicasets" | Lấy thông tin chi tiết của tất cả replica set trong cluster |
| "kubectl get replicaset replicaset-id" | Lấy thông tin chi tiết của một replicaset |
| "kubectl get deployments" | Lấy thông tin chi tiết của tất cả deployment trong cluster |
| "kubectl get deployment deployment-id" | Lấy thông tin chi tiết của một deployment |
| "kubectl get configmaps" | Lấy thông tin chi tiết của tất cả configmap trong cluster |
| "kubectl get configmap configmap-id" | Lấy thông tin chi tiết của một configmap |
| "kubectl get events --sort-by=.metadata.creationTimestamp" | Lấy tất cả event đã xảy ra trong cluster |
| "kubectl scale deployment accounts-deployment --replicas=1" | Đặt số lượng replica cho một deployment trong cluster |
| "kubectl set image deployment gatewayserver-deployment gatewayserver=eazybytes/gatewayserver:s11 --record" | Đặt image mới cho một deployment trong cluster |
| "kubectl rollout history deployment gatewayserver-deployment" | Xem lịch sử rollout của một deployment trong cluster |
| "kubectl rollout undo deployment gatewayserver-deployment --to-revision=1" | Rollback về một revision cụ thể của deployment trong cluster |
| "kubectl get pvc" | Liệt kê các PVC trong cluster |
| "kubectl delete pvc data-happy-panda-mariadb-0" | Xoá một PVC trong cluster |

## Helm Commands

|     Helm Command       |     Description          |
| ------------- | ------------- |
| "helm create [NAME]" | Tạo một chart mặc định với tên đã cho |
| "helm dependencies build" | Build lại các dependency cho helm chart đã cho |
| "helm install [NAME] [CHART]" | Cài đặt helm chart đã cho vào cluster K8s |
| "helm upgrade [NAME] [CHART]" | Nâng cấp một release đã chỉ định lên phiên bản chart mới |
| "helm history [NAME]" | Hiển thị lịch sử các revision của một release |
| "helm rollback [NAME] [REVISION]" | Rollback một release về revision trước đó |
| "helm uninstall [NAME]" | Gỡ bỏ tất cả resource liên quan đến một release đã cho |
| "helm template [NAME] [CHART]" | Render template của chart cục bộ kèm theo values |
| "helm list" | Liệt kê tất cả helm release trong cluster K8s |
