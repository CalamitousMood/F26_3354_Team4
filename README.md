# Hospital Bed & Resource Management System
SE 3354 Software Engineering - Team 4

## Project Overview

This repository contains the Project Charter, Deliverable #2, and Project Slides for the Hospital Bed & Resource Management System project. The project focuses on designing a system for managing hospital bed availability, patient admissions, transfers, discharges, and resource allocation.

This repository includes:
- Project Charter
- Final Project Report
- Java sample implementation (Bed.java)
- JUnit unit test code
- Presentation slides

## Team Members

- Harshitha Mahesh
- Tessa John
- McKenna Hunter
- Ashley Marroquin
- Sameer Krishna

## Prerequisites

To run the sample unit test code, install:

- Java JDK 17 or later
- JUnit 5
- An IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code

## Installing Dependencies

If using Maven, install dependencies with:

```bash
mvn clean install
```

If not using Maven, add the JUnit 5 library to your Java project manually.

## Environment Variables

No environment variables are required for the submitted sample code.

## Running the Unit Tests

1. Open the project in your Java IDE.
2. Locate the `Bed.java` class and corresponding JUnit test file.
3. Right-click the test file.
4. Select **Run Tests**.
5. Verify that all test cases pass successfully.

Alternatively, if Maven is configured:

```bash
mvn test
```

## Sample Test Cases

The submitted unit tests verify:

- Bed status = Available → Returns true
- Bed status = Occupied → Returns false
- Bed status = Unavailable → Returns false

