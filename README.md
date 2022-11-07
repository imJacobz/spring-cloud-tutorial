# NX-AUTO

A spring cloud example

## Project Structure

app-eureka-server: service discovery and registry server

app-gateway: gateway service

app-model: core entities, models and repositories

ms-*: micro services

## How To Run

1. build app-model 
2. run app-eureka-server, port 8989
3. run ms-customer and ms-shop, port 8081 and 8082
4. run app-gateway, port 8080
5. access http://localhost:8989 to check services are registered in eureka
6. http://localhost:8080/customer/1, customer service.
7. http://localhost:8080/shop/customer/1, shop service.