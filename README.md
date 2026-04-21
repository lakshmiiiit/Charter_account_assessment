# Charter_account_assessment

project structure:

reward-program
 ├── controller
 │    └── RewardController.java
 ├── service
 │    ├── RewardService.java
 │    └── RewardServiceImpl.java
 ├── repository
 │    ├── CustomerRepository.java
 │    └── TransactionRepository.java
 ├── model
 │    ├── Customer.java
 │    └── Transaction.java
 ├── dto
 │    └── RewardResponse.java
 ├── exception
 │    ├── GlobalExceptionHandler.java
 │    └── InvalidTransactionException.java
 ├── RewardProgramApplication.java
 └── resources
      └── application.yml

Overview:
This Spring Boot application calculates reward points for customers based on their purchase transactions over a three‑month period.
The application exposes a REST API to retrieve monthly and total reward points per customer.

Reward Rules
Reward points are calculated per transaction:

No points for purchases below $50
1 point per dollar for amounts between $50 and $100
2 points per dollar for amounts above $100

Example
$120 purchase → 50 + (20 × 2) = 90 points

Sample Data
The application loads sample data at startup:

Multiple customers
Multiple transactions per customer
Transactions across different months
Boundary values like $49, $50, $100, $110, $200


REST API
Get Rewards by Customer ID
GET /api/rewards/{customerId}

Sample Response
JSON{  "2026-01": 115,  "2026-02": 250,  "2026-03": 0}
If the customer does not exist, a 404 Not Found response is returned.

Technology Stack

Java 17
Spring Boot
Spring Data JPA
H2 In‑Memory Database
Maven
JUnit 5


How to Run
Shellmvn spring-boot:run
Access the API:
http://localhost:8080/api/rewards/{customerId}


Testing
Run unit and integration tests using:
Shellmvn test

Notes:

Uses H2 in‑memory database
Sample data is auto‑loaded at application startup
No hard‑coded months are used
Code follows Java and Spring Boot best practices


