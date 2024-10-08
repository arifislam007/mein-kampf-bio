# Mein Kampf Bio Application

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

### 1. Clone the Repository

```bash
git clone https://github.com/arifislam007/mein-kampf-bio.git
cd mein-kampf-bio
```

### 2. Build the Project

Make sure you have Maven installed. Run the following command to build the project and generate the WAR file:

```bash
mvn clean package
```

### 3. Deploy on Tomcat

1. Locate the generated WAR file in the `target` directory (e.g., `target/mein-kampf-bio.war`).
2. Copy the WAR file to the `webapps` directory of your Apache Tomcat installation.
3. Start your Tomcat server.

### 4. Access the Application

Open your web browser and go to:

```
http://localhost:8080/mein-kampf-bio/bio
```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue to discuss changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by M. K. S. Karam's *The Main Kamp Book*.
- Built using Spring Boot and Thymeleaf.
```
