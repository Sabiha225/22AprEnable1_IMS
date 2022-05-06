Coverage: 53.1%

Inventory Management System (IMS) 

The aim of this project is to build an application that an end user can interact with via a Command-Line Interface (CLI) using CRUD functuality to Creat, Read, Update and Delete data from the different tables: Customers, Orders, Order_Items and Products. The applications used to complete this project are listed below:

• Version Control System: Git

• Source Code Management: GitHub

• Kanban Board: Jira

• Database Management System: MySQL Server 5.7+ (local or GCP instance)

• Back-End Programming Language: Java

• Build Tool: Maven

• Unit Testing: JUnit


## Getting Started

The following is a link to my Jira board used to plan the tasks to be carried out in this project: 

https://sabiha221.atlassian.net/jira/software/projects/IPP/boards/2/backlog

### Prerequisites

The following is a list of applications that need to be installed and where to install them:

IDE - Eclipse (https://www.eclipse.org/downloads/)

JAVA - Java SE Development Kit (//www.oracle.com/uk/java/technologies/javase/javase-jdk8-downloads.html)

Database - MySQL (https://dev.mysql.com/downloads/windows/installer/8.0.html)

Maven - Apache Maven (https://maven.apache.org/)

### Installing

After installing all the software, I created a database in the local mySQL server doing the following steps:

• After opening up the mySQL workbench application, I selected Local instance mySQL under MySQL Connections

• Entered the credentials

• Opened a new file for the IMS Project

• Created a new database called 'ims'

DROP SCHEMA IMS;

CREATE DATABASE IF NOT EXISTS IMS;

USE IMS;

Also opened up the Eclipse IDE for Java, checked that the pom.xml file had the connector dependency and saved the SQL database into the same folder my IMS Project was saved for Eclipse.

However, despite this my database did not successfully connect to Eclipse. 

## Running the tests

To ensure all the code and system is working as it should, a series of tests need to be run. 

### Unit Tests 

Unit testing is a way of testing the smallest piece of code to ensure it is running correctly. To do this:
Go onto the test class you wish to test > right click into it > Run As > 1 JUnit Test 

I ran tests on the following classes:

• CustomerTest

•OrdersTest

•ProductsTest

•CustomerDAOTest

•OrdersDAOTest

•ProductsDAOTest

•CustomerControllerTest

•OrderControllerTest

•ProductConrollerTest

An example of a test is given below: 

![image](https://user-images.githubusercontent.com/103116778/167157841-7c858765-0275-4aaf-bd27-e7bdac773297.png)

Mockito was also used, as shown below, which is used as part of unit testing to allow tests with clean and simple API. 

![image](https://user-images.githubusercontent.com/103116778/167158493-a8f08d02-a480-4eb8-9176-83a963fb316f.png)



## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Sabiha Alam** - *Built upon Chris Perrins work* - [sabiha225]

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Chris Perrins for using his initial starter pack

