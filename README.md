![image](https://github.com/user-attachments/assets/32a9af6c-67a1-442f-a86d-26d983637472)# Mein Kampf Bio Application

This is a web-based application that provides a biography of the book *The Main Kamp Book* by M. K. S. Karam. The application is built using Spring Boot and Thymeleaf, and it is packaged as a WAR file for deployment on a servlet container like Apache Tomcat.

## Features

- Displays a comprehensive biography of the book.
- Utilizes Thymeleaf for rendering dynamic HTML content.
- Includes an image of Adolf Hitler.

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Apache Maven
- Apache Tomcat (or any compatible servlet container)

## Project Structure

```bash
mein-kampf-bio
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── meinkampfbio
    │   │               ├── MeinKampfBioApplication.java
    │   │               ├── BioController.java
    │   │               └── ServletInitializer.java
    │   └── resources
    │       ├── static
    │       │   └── images
    │       │       └── hitler.jpg
    │       └── templates
    │           └── bio.html
```

## Getting Started

### Requirment to execute this pipeline
- jenkins
- tomcat server with ip address 192.168.207.132 or you need to update Jenkins file for tomcat ip address
- tomcat GUI manager access password store to jenkins credential id name should be **tomcat-access** or you need to update jenkins script.
- you jenkins server has docker package installed and jenkins user has permission to execute docker command
### 1. From you jenkins create a Pipeline Job
![image](https://github.com/user-attachments/assets/598736ae-d406-4e99-88cf-fdd13d69af2e)


### 2. On the **Pipeline** Section Select SCM from **Definition**
- Pest you this git repository link : https://github.com/arifislam007/mein-kampf-bio.git
- branch should be **pipeline**
![image](https://github.com/user-attachments/assets/138a80f5-18af-41ab-a8c5-79ce36ca2767)

### 3. From the Script Path it Should be the path of your Jenkins script in this case it should only Jenkinsfile 
![image](https://github.com/user-attachments/assets/46d417e5-5ce5-4097-8f19-6b80ab99afc1)

- Now save the job








