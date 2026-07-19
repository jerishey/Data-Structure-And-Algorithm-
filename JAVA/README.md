# Java
Java is a high-level, object-oriented programming language used to build web apps, mobile applications, and enterprise software systems.

- Java is a platform-independent language, which means code written in Java can run on any device that supports the Java Virtual Machine (JVM).
- Syntax and structure are similar to C-based languages like C++ and C#.

## Why Learn Java ?
```bash
1. Used to build Android apps, desktop and web apps, enterprise backend systems, and cloud-based software.

2. In high demand with many job opportunities in software development.

3. Has popular frameworks like Spring and Hibernate which makes it powerful for enterprise applications.

4. Supports object-oriented programming for clean, maintainable and reusable code.

5. Top companies like Amazon, Netflix, and LinkedIn use Java.
```

## 1. Introduction to Java
Java is a widely used programming language for building web, desktop, mobile, and enterprise applications. It is known for its simple syntax, portability, and powerful features that make development easier and more secure.

- Supports object-oriented programming concepts like classes, objects, inheritance, and polymorphism
- Platform independent because of JVM support
- Secure and robust with strong memory management

### `Features of Java`
```bash
Features of Java
1. Object-Oriented Programming (OOP) supports modular and reusable code using classes and objects.

2. Platform Independence allows Java programs to run on any operating system with a JVM.

3. Robust and Secure provides strong memory management, exception handling, and built-in security features.

4. Multithreading and Concurrency enables multiple tasks to execute simultaneously for better performance.

5. Rich API and Standard Libraries offer extensive built-in libraries for common programming tasks.

6. Frameworks for Enterprise and Web Development support building enterprise applications, web applications, and REST APIs.
```

### `History of Java` 
Java is one of the most popular and widely used programming languages in the world. It was developed by James Gosling and his team at Sun Microsystems in the early 1990s with the goal of creating a platform-independent programming language. 
<br>
Over the years, Java has evolved significantly and become a major technology for enterprise, web, mobile, and cloud-based applications.

- Follows the principle of Write Once, Run Anywhere (WORA).
- Supports Object-Oriented Programming (OOP) concepts.
- Known for platform independence, security, and robustness.

### `Origin and Naming of Java`
Java was originally developed under the Green Project by Sun Microsystems for consumer electronic devices.
<br>
Before becoming Java, the language went through multiple names and finally received its official identity inspired by coffee beans.

- The language was first called Greentalk, then renamed Oak, inspired by an oak tree outside James Gosling’s office.
- Since the name Oak was already trademarked, the team later selected the name Java after brainstorming names like Silk, Lyric, DNA, and Dynamic.

### `Uses of Java`
```bash
1. Enterprise Applications: Used for developing banking systems, ERP software, and large-scale business applications.

2. Web Applications: Used for creating dynamic and secure web applications with frameworks like Spring and Hibernate.

3. Security Systems: Used in secure applications because of built-in features like bytecode verification and strong memory management.

4. Android Development: Widely used for building Android mobile applications.

5. Cloud Computing: Used in cloud-native applications and microservices architectures.

6. Big Data Technologies: Technologies like Hadoop, Apache Kafka, and Apache Spark are developed using Java.

7. Desktop Applications: Used for developing cross-platform desktop software using JavaFX and Swing.

8. Scientific and Financial Applications: Preferred for high-performance and secure financial systems and scientific computing.

9. IoT and Embedded Systems: Used in Internet of Things (IoT) devices and embedded applications because of its portability and reliability.
```

## 2. Download and Install Java
Installing Java is the first step to start Java development on any system. It allows you to run Java applications and build projects across different operating systems.

- Java can be installed on Windows, Linux, and macOS using platform-specific steps.
- Requires downloading and setting up the JDK (Java Development Kit).
- Proper configuration of environment variables (JAVA_HOME, PATH) is essential.

### Download and Install Java (JDK)

#### Step 1: Download Java

Download the latest **Java Development Kit (JDK)** from one of the following sources:

- **Oracle JDK:** https://www.oracle.com/java/technologies/downloads/
- **Eclipse Temurin (Recommended):** https://adoptium.net/

> **Recommended Version:** JDK 21 (LTS)

---

#### Step 2: Install Java

1. Run the downloaded installer.
2. Click **Next** through the installation wizard.
3. Choose the installation directory (or keep the default location).
4. Click **Install**.
5. Click **Finish** after the installation completes.

---

#### Step 3: Verify the Installation

Open **Command Prompt** and run the following commands:

```bash
java -version
```

Example Output:

```text
openjdk version "21.0.x"
```

Check the Java compiler:

```bash
javac -version
```

Example Output:

```text
javac 21.0.x
```

---

#### Step 4: Test the Installation

Create a file named **Hello.java**.

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Compile the program:

```bash
javac Hello.java
```

Run the program:

```bash
java Hello
```

Output:

```text
Hello, Java!
```

---

#### Installation Checklist

- ✅ JDK installed successfully
- ✅ `java -version` displays the installed version
- ✅ `javac -version` displays the compiler version
- ✅ First Java program runs successfully

### `How to Install IntelliJ IDEA on Windows?`
JetBrains developed IntelliJ IDEA, used for Java and Kotlin development. It provides smart code completion, debugging tools, version control support, and many advanced features that make application development faster and easier.

- Supports Java, Kotlin, Spring Boot, Maven, Gradle, and many other technologies
- Provides intelligent code suggestions and error detection
- Includes built-in debugging, testing, and version control tools
- Available in both Community Edition and Ultimate Edition