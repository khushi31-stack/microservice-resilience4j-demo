# Microservices Resilience4j Demo

This project demonstrates **fault tolerance and resilience** in a microservices architecture using **Resilience4j** and **Spring Boot**. It consists of two independent services:

- **Service A** – acts as the client service
- **Service B** – provides data and simulates occasional failures

The goal is to ensure **Service A remains resilient** by using a **circuit breaker** and **fallback mechanism** when Service B is down or unresponsive.

---

##  Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Boot Actuator
- Spring Cloud Circuit Breaker with Resilience4j
- Maven

---

##  How to Run

### ▶️ Prerequisites

- Java 21 or later
- Maven installed

---

###  Step 1: Run Services A and B 

```bash
cd service-b
mvn spring-boot:run
cd service-a
mvn spring-boot:run

Step 2: Check Services A and B on postman
Test:
GET http://localhost:8081/api/data
You will receive either:
* A valid response, or
* A simulated error

GET http://localhost:8080/api/fetch-data
You will receive either:
* A valid forwarded response from Service B, or
* A fallback message if Service B is unavailable

Key Concepts Demonstrated
* Independent microservices communication
* Fault tolerance with Resilience4j
* Circuit Breaker pattern
* Fallback mechanism
* Improved reliability in distributed systems

Project Structure

microservices-resilience4j-demo/
├── service-a/
│   ├── src/main/java/
│   │   ├── config/
│   │   └── controller/
│   ├── pom.xml
│   └── application.properties
├── service-b/
│   ├── src/main/java/
│   │   └── controller/
│   ├── pom.xml
│   └── application.properties
└── README.md

Project Deliverables:
[demo video](https://drive.google.com/file/d/1Sh-EXeQ_1t4hRpxUVVZ19db23l--8q8-/view?usp=sharing)
[presentation](https://docs.google.com/presentation/d/1Jyl__WafFAa7EgXYkRIB_cIxnrMdJVW1/edit?usp=share_link&ouid=110946249228515755175&rtpof=true&sd=true)
[Zip file](https://drive.google.com/file/d/1T_Nj0ST5SXP46MF8n4S3Af92Gbk781cg/view?usp=sharing)
[summary report](https://drive.google.com/file/d/1VStucVCEdDuu45gAyiVyrAwYhuPmInHg/view?usp=sharing)

