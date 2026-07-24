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


#### Step 1: Download IntelliJ IDEA

Visit the official JetBrains website:

- **JetBrains IntelliJ IDEA:** https://www.jetbrains.com/idea/download/

> **Recommended Edition:** IntelliJ IDEA Community Edition (Free)

---

#### Step 2: Install IntelliJ IDEA

1. Run the downloaded installer.
2. Click **Next**.
3. Choose the installation location (or keep the default).
4. Select the following options (recommended):
   - ✅ Create Desktop Shortcut
   - ✅ Add "Open Folder as Project" (optional)
   - ✅ Update PATH Variable (optional)
5. Click **Next**.
6. Click **Install**.
7. After the installation is complete, click **Finish**.

---

#### Step 3: Launch IntelliJ IDEA

1. Open **IntelliJ IDEA** from the Start Menu or Desktop shortcut.
2. Accept the License Agreement (if prompted).
3. Choose your preferred UI theme (Light or Dark).
4. Click **Continue** to open the IDE.

---

#### Step 4: Create a New Java Project

1. Click **New Project**.
2. Select **Java**.
3. Choose the installed **JDK**.
   - If no JDK is detected, click **Add JDK** and select your JDK installation folder.
4. Enter the project name.
5. Click **Create**.

---

#### Step 5: Create Your First Java Program

Create a new Java class named **Hello** and add the following code:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, IntelliJ IDEA!");
    }
}
```

---

#### Step 6: Run the Program

1. Click the **Run (▶)** button or press **Shift + F10**.
2. The output will appear in the **Run** window.

Example Output:

```text
Hello, IntelliJ IDEA!
```

---

#### Installation Checklist

- ✅ IntelliJ IDEA installed successfully
- ✅ JDK configured correctly
- ✅ Java project created
- ✅ First Java program executed successfully

## 3. Differences Between JDK, JRE and JVM
JDK (Java Development Kit) provides tools and libraries to develop Java applications, working with JRE and JVM. JRE (Java Runtime Environment) offers the libraries and JVM needed to run Java programs. JVM (Java Virtual Machine) executes the compiled Java bytecode on the system.

- JDK is mainly used by developers, while JRE is required by end-users to run applications.
- The JVM executes bytecode, making programs platform-independent across systems.
- Java bytecode can run on any machine with a JVM, but JVM implementations are platform-dependent for each operating system.

### `1. JDK (Java Development Kit)`
JDK is a software development kit used to build Java applications. It contains the JRE and a set of development tools.

- Includes compiler (javac), debugger, and utilities like jar and javadoc.
- Provides the JRE, so it also allows running Java programs.
- Required by developers to write, compile, and debug code.

`Contents of JDK :` The JDK has a private Java Virtual Machine (JVM) and a few other resources necessary for the development of a Java Application. 
- Java Runtime Environment (JRE),
- An interpreter/loader (Java),
- A compiler (javac),
- An archiver (jar) and many more.

`Popular JDKs :`
```bash
1. Oracle JDK: the most popular JDK and the main distributor of Java11,
2. OpenJDK: Ready for use: JDK 15, JDK 14, and JMC,
3. Azul Systems Zing: efficient and low latency JDK for Linux os,
4. Azul Systems: based Zulu brand for Linux, Windows, Mac OS X,
5. IBM J9 JDK: for AIX, Linux, Windows, and many other OS,
6. Amazon Corretto: the newest option with the no-cost build of OpenJDK and long-term support.
```

`Working of JDK :`
- Source Code (.java): Developer writes a Java program.
- Compilation: The JDK’s compiler (javac) converts the code into bytecode stored in .class files.
- Execution: The JVM executes the bytecode, translating it into native instructions.
---

### `2. JRE (Java Runtime Environment)`
JRE provides an environment to run Java programs but does not include development tools. It is intended for end-users who only need to execute applications.

- Contains the JVM and standard class libraries.
- Provides all runtime requirements for Java applications.
- Does not support compilation or debugging.
- JRE is only for running applications, not for developing them.
- It is platform-dependent (different builds for different OS).

#### `Components of Java JRE (Java Runtime Environment)`
The **Java Runtime Environment (JRE)** provides the necessary components to run Java applications. It consists of the following components:

`1. Java Virtual Machine (JVM)`
- Executes Java bytecode.
- Converts bytecode into machine code.
- Provides platform independence.

`2. Class Loader`
- Loads Java class files into memory.
- Dynamically loads classes when required.
- Links and initializes classes before execution.

`3. Bytecode Verifier`
- Checks the bytecode for security and correctness.
- Ensures the code does not violate Java language rules.
- Prevents illegal memory access.

`4. Java Class Libraries`
- A collection of pre-built classes and packages.
- Provides APIs for file handling, networking, collections, GUI, database connectivity, and more.
- Reduces development time by offering reusable code.

`5. Runtime Libraries`
- Contains essential libraries required during program execution.
- Includes core Java packages such as `java.lang`, `java.util`, `java.io`, and `java.net`.

`6. Native Libraries`
- Platform-specific libraries used by the JVM.
- Enable Java programs to interact with the operating system.
- Support features such as file systems, networking, and hardware access.

`Working of JRE :`
- Class Loading: Loads compiled .class files into memory.
- Bytecode Verification: Ensures security and validity of bytecode.
- Execution: Uses the JVM (interpreter + JIT compiler) to execute instructions and make system calls.

---

### `3. JVM (Java Virtual Machine)`
JVM is the core execution engine of Java. It is responsible for converting bytecode into machine-specific instructions.

- Part of both JDK and JRE.
- Performs memory management and garbage collection.
- Provides portability by executing the same bytecode on different platforms.

`Note :`
- JVM implementations are platform-dependent.
- Bytecode is platform-independent and can run on any JVM.
- Modern JVMs rely heavily on Just-In-Time (JIT) compilation for performance.

#### `Components of JVM Architecture :` 
The **Java Virtual Machine (JVM)** is the core component of Java that executes bytecode and provides a platform-independent runtime environment. It consists of the following components:

`1. Class Loader`
- Loads `.class` files into memory.
- Dynamically loads classes when required.
- Performs loading, linking, and initialization.

`2. Method Area`
- Stores class metadata, method information, static variables, and runtime constant pool.
- Shared among all threads.

`3. Heap Memory`
- Stores objects and instance variables.
- Shared among all threads.
- Managed by the Garbage Collector.

`4. Java Stack`
- Stores local variables, method calls, and partial results.
- Each thread has its own stack.
- Memory is automatically released after method execution.

`5. Program Counter (PC) Register`
- Keeps track of the address of the current instruction being executed.
- Each thread has its own PC Register.

`6. Native Method Stack`
- Stores information related to native (non-Java) methods.
- Used when Java code interacts with platform-specific libraries.

`7. Execution Engine`
- Executes the bytecode loaded into memory.
- Includes:
  - **Interpreter** – Executes bytecode line by line.
  - **JIT (Just-In-Time) Compiler** – Converts frequently used bytecode into native machine code for better performance.
  - **Garbage Collector (GC)** – Automatically removes unused objects from heap memory.

`8. Native Method Interface (JNI)`
- Allows Java programs to interact with native applications and libraries written in languages such as C and C++.

`9. Native Libraries`
- Platform-specific libraries required by native methods.
- Accessed through the JNI.

---

#### JVM Architecture Diagram

```text
               Java Source Code (.java)
                        │
                        ▼
                  Java Compiler (javac)
                        │
                        ▼
                  Bytecode (.class)
                        │
                        ▼
                  +----------------+
                  |  Class Loader  |
                  +----------------+
                        │
        ┌───────────────┼────────────────┐
        ▼               ▼                ▼
 +---------------+ +-------------+ +----------------+
 | Method Area   | | Heap Memory | | Java Stack     |
 +---------------+ +-------------+ +----------------+
        │                               │
        └───────────────┬───────────────┘
                        ▼
               Program Counter Register
                        │
                        ▼
               +----------------------+
               |   Execution Engine   |
               |----------------------|
               | • Interpreter        |
               | • JIT Compiler       |
               | • Garbage Collector  |
               +----------------------+
                        │
                        ▼
         Native Method Interface (JNI)
                        │
                        ▼
               Native Method Stack
                        │
                        ▼
                Native Libraries
```

#### Working of JVM (Java Virtual Machine)

The **Java Virtual Machine (JVM)** is responsible for executing Java bytecode. It loads the compiled class files, verifies them, converts the bytecode into machine code, and executes the program.


`1. Load the Class`
The **Class Loader** loads the compiled `.class` file into the JVM memory.

`2. Verify the Bytecode`
The **Bytecode Verifier** checks the bytecode for security, correctness, and validity before execution.

`3. Store Data in Memory`
The JVM stores the required data in different memory areas:
- **Method Area** – Stores class metadata, methods, and static variables.
- **Heap Memory** – Stores objects and instance variables.
- **Java Stack** – Stores local variables and method calls.
- **PC Register** – Tracks the current instruction being executed.
- **Native Method Stack** – Stores information for native methods.

`4. Execute the Bytecode`
The **Execution Engine** executes the bytecode using:
- **Interpreter** – Executes bytecode line by line.
- **JIT (Just-In-Time) Compiler** – Converts frequently used bytecode into native machine code for faster execution.

`5. Garbage Collection`
The **Garbage Collector (GC)** automatically removes unused objects from the heap memory, freeing memory for future use.

`6. Display the Output`
The JVM executes the program and displays the output.

---

#### Working Flow

```text
Compiled Bytecode (.class)
            │
            ▼
      Class Loader
            │
            ▼
   Bytecode Verifier
            │
            ▼
      JVM Memory
 ┌──────────────────────────┐
 │ • Method Area            │
 │ • Heap Memory            │
 │ • Java Stack             │
 │ • PC Register            │
 │ • Native Method Stack    │
 └──────────────────────────┘
            │
            ▼
     Execution Engine
 ┌───────────────────────┐
 │ • Interpreter         │
 │ • JIT Compiler        │
 │ • Garbage Collector   │
 └───────────────────────┘
            │
            ▼
       Machine Code
            │
            ▼
     Program Execution
            │
            ▼
           Output
```

---

## 4. Variables
In Java, variables are containers used to store data in memory. Variables define how data is stored, accessed, and manipulated. A variable in Java has three components,

- Data Type: Defines the kind of data stored (e.g., int, String, float).
- Variable Name: A unique identifier following Java naming rules.
- Value: The actual data assigned to the variable.

`1. Variable Declaration :` Declaration means specifying the data type and variable name.
```bash
Syntax : dataType variableName;

Example:
int age;
String name;
double salary;
```

`2. Variable Initialization :` Initialization means assigning a value to a variable.
```bash
Syntax : variableName = value;

Example:
age = 22;
name = "Nitish";
salary = 45000.50;
```

### `Naming Rule 's of Java Variables`
```bash
1. Start with a Letter, $, or _ – Variable names must begin with a letter (a–z, A–Z), dollar sign $, or underscore _.

2. No Keywords: Reserved Java keywords (e.g., int, class, if) cannot be used as variable names.

3. Case Sensitive: age and Age are treated as different variables.

4. Use Letters, Digits, $, or _ : After the first character, you can use letters, digits (0–9), $, or _.

5. Meaningful Names: Choose descriptive names that reflect the purpose of the variable (e.g., studentName instead of s).

6. No Spaces: Variable names cannot contain spaces.

7. Follow Naming Conventions: Typically, use camelCase for variable names in Java (e.g., totalMarks).
```

### `Types of Java Variables`
Variables in Java are used to store data values during program execution. Each variable is associated with a specific data type that defines the kind of value it can hold. Variables help in performing operations, storing user input, and managing data in a program.

- Java variables must be declared before they are used in a program.
- Variable names should follow Java naming conventions for better readability.
- Different types of variables in Java include local variables, instance variables, and static variables.

`1. Local Variables :`
A variable defined within a block, method, or constructor is referred to as a local variable. 

- The Local variable is created at the time of declaration and destroyed when the function completes its execution.
- The scope of local variables exists only within the block in which they are declared.
- We first need to initialize a local variable before using it within its scope.

`2. Instance Variables :`
Instance variables are known as non-static variables and are declared in a class outside of any method, constructor, or block.
<br>
Instance variables are created when an object is instantiated and destroyed when the object is destroyed.

- Can have access specifiers; default access is used if none is specified.
- Accessed only through objects of the class.
- Instance Variables can be initialized using constructors or instance blocks.

`3. Static Variables`
Static variables in Java are variables declared with the static keyword inside a class but outside any method. They are shared among all objects of the class and exist for the entire lifetime of the program. 

- There is only one copy of a static variable for the entire class, and all objects share it
- Static variable are created at program start and destroyed when the program ends.
- Can be initialized using static blocks.

---

## 5. Data Types
Java data types define the type of data a variable can store in a program. They help the compiler allocate memory efficiently and ensure type safety. Java provides two main categories: primitive and non-primitive data types.

- Memory allocation determines how much memory is required for each variable
- Operations support defines what operations can be performed on data
- Each data type has a default value when not initialized

### `Types of Data Types`
Data types in Java define the kind of data a variable can hold and the memory required to store it. They are broadly divided into two categories:

#### `1. Primitive Data Types :` 
Primitive data types are the basic built-in data types provided by Java. They store simple values directly and have a fixed size.

`Primitive Data Types`

**1. byte :** The `byte` data type is an 8-bit signed integer used to store small whole numbers. It is useful for saving memory when working with large arrays.

**Example:**
```java
byte age = 25;
```

---

**2. short :** The `short` data type is a 16-bit signed integer used to store whole numbers larger than `byte` but smaller than `int`.

**Example:**
```java
short marks = 1500;
```

---

**3. int :** The `int` data type is a 32-bit signed integer used to store whole numbers. It is the most commonly used integer data type in Java.

**Example:**
```java
int salary = 50000;
```

---

**4. long :** The `long` data type is a 64-bit signed integer used to store very large whole numbers. A long literal must end with `L` or `l`.

**Example:**
```java
long population = 8000000000L;
```

---

**5. float :** The `float` data type is a 32-bit floating-point type used to store decimal numbers with single precision. A float literal must end with `f` or `F`.

**Example:**
```java
float price = 99.99f;
```

---

**6. double :** The `double` data type is a 64-bit floating-point type used to store decimal numbers with double precision. It provides greater accuracy than `float`.

**Example:**
```java
double pi = 3.141592653589793;
```

---

**7. char :** The `char` data type is a 16-bit Unicode character type used to store a single character enclosed in single quotes.

**Example:**
```java
char grade = 'A';
```

---

**8. boolean :** The `boolean` data type is used to store logical values. It can have only two possible values: `true` or `false`.

**Example:**
```java
boolean isPassed = true;
```

#### `2. Non-Primitive (Reference) Data Types`  
Non-primitive data types, also known as **reference data types**, are data types that store references (memory addresses) to objects rather than the actual data. They are created by the programmer or provided by Java libraries and can contain methods and properties.

`Types of Non-Primitive (Reference) Data Types`

**1. String :** The `String` data type is used to store a sequence of characters (text). Strings are objects in Java and provide many built-in methods for text manipulation.

**Example:**
```java
String name = "Rakesh";
```

---

**2. Array :** An `Array` is a collection of elements of the same data type stored in contiguous memory locations. Each element is accessed using its index.

**Example:**
```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

**3. Class :** A `Class` is a blueprint or template used to create objects. It defines the properties (fields) and behaviors (methods) of an object.

**Example:**
```java
class Student {
    String name = "Rakesh";
}
```

---

**4. Object :** An `Object` is an instance of a class. It is used to access the properties and methods defined in the class.

**Example:**
```java
Student student = new Student();
```

---

**5. Interface :** An `Interface` is a reference type that defines a set of abstract methods that a class must implement. It is used to achieve abstraction and multiple inheritance.

**Example:**
```java
interface Animal {
    void sound();
}
```

---

**6. Enum :** An `Enum` (Enumeration) is a special data type used to define a fixed set of constant values.

**Example:**
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}
```

## 6. Keywords
Java keywords are reserved words with predefined meanings used by the compiler to perform specific operations. They are part of the language syntax and cannot be modified.

- Keywords cannot be used as identifiers (variable, method, class, or object names).
- Examples include int, class, if, return, etc.

> **Note:** Java 21 has **55 reserved words**, which include **52 keywords** and **3 reserved literals**.

### Hierarchy of Java Reserved Words

```
Reserved Words (55)
│
├── Keywords (52)
│   ├── Used Keywords (50)
│   └── Unused Keywords (2)
│       ├── const
│       └── goto
│
└── Reserved Literals (3)
    ├── true
    ├── false
    └── null
```

#### 1. Used Keywords (50)

| S.No | Keyword | S.No | Keyword | S.No | Keyword | S.No | Keyword | S.No | Keyword |
|:---:|:---------|:---:|:---------|:---:|:---------|:---:|:---------|:---:|:---------|
| 1 | `abstract` | 11 | `default` | 21 | `if` | 31 | `private` | 41 | `this` |
| 2 | `assert` | 12 | `do` | 22 | `implements` | 32 | `protected` | 42 | `throw` |
| 3 | `boolean` | 13 | `double` | 23 | `import` | 33 | `public` | 43 | `throws` |
| 4 | `break` | 14 | `else` | 24 | `instanceof` | 34 | `return` | 44 | `transient` |
| 5 | `byte` | 15 | `enum` | 25 | `int` | 35 | `short` | 45 | `try` |
| 6 | `case` | 16 | `extends` | 26 | `interface` | 36 | `static` | 46 | `void` |
| 7 | `catch` | 17 | `final` | 27 | `long` | 37 | `strictfp` | 47 | `volatile` |
| 8 | `char` | 18 | `finally` | 28 | `native` | 38 | `super` | 48 | `while` |
| 9 | `class` | 19 | `float` | 29 | `new` | 39 | `switch` | 49 | `yield` |
| 10 | `continue` | 20 | `for` | 30 | `package` | 40 | `synchronized` | 50 | `var` |

---

#### 2. Unused Keywords (2)

These keywords are reserved by Java but are **not used** in the language.

- `const`
- `goto`

---

#### 3. Reserved Literals (3)

These are reserved values in Java and cannot be used as identifiers.

- `true`
- `false`
- `null`

---

### Important Points:
```bash
1. The keywords const and goto are reserved, even though they are not currently used in Java.

2. true, false, and null look like keywords, but in actuality they are literals. However, they still can't be used as identifiers in a program.

3. In Java, keywords are case-sensitive, and writing Java keywords in upper case (like IF instead of if) will throw an error.
```
---
### Java Keywords List
Java keywords are reserved words that have predefined meanings in the language. They cannot be used as identifiers (like variable or method names).

`1. Data Type Keywords :` Used to define variable types and specify the kind of data they can hold.
```bash
Keyword	                        Usage
boolean	    ->       Defines a variable that holds true or false.
byte	    ->       Defines an 8-bit signed integer.
char	    ->       Defines a 16-bit Unicode character.
short	    ->       Defines a 16-bit signed integer.
int	        ->       Defines a 32-bit signed integer.
long	    ->       Defines a 64-bit signed integer.
float	    ->       Defines a 32-bit floating-point number.
double	    ->       Defines a 64-bit floating-point number.
void	    ->       Specifies that a method does not return any value.
```

`2. Control Flow Keywords :` Used to control the execution flow of a program, including loops, branching, and jumps.
```bash
Keyword	                            Usage
if	          ->        Executes code when a condition is true.
else	      ->        Defines an alternate block when an if condition is false.
switch	      ->        Selects one block of code among multiple options.
case	      ->        Defines an individual branch in a switch statement.
default	      ->        Defines the block executed if no case matches.
for	          ->        Starts a for loop.
while	      ->        Starts a while loop.
do	          ->        Starts a do-while loop.
break	      ->        Terminates the nearest loop or switch.
continue      ->        Skips to the next iteration of a loop.
return	      ->        Exits from a method and optionally returns a value.
```

`3. Exception Handling Keywords :` Used for handling and managing runtime errors in programs.
```bash
Keyword	                        Usage
try	           ->    Defines a block of code to test for exceptions.
catch	       ->    Defines a block to handle exceptions thrown by try.
finally	       ->    Defines a block that always executes after try and catch.
throw	       ->    Used to manually throw an exception.
throws	       ->    Declares the exceptions a method can throw.
assert	       ->    Tests assumptions during program execution for debugging.
```

`4. Object-Oriented Keywords :` Used to define classes, interfaces, and objects, as well as inheritance and encapsulation properties.
```bash
Keyword	                    Usage
class	      ->      Declares a class.
interface	  ->      Declares an interface.
extends	      ->      Indicates inheritance from a superclass.
implements	  ->      Indicates that a class implements an interface.
new	          ->      Creates new objects.
this	      ->      Refers to the current object.
super	      ->      Refers to the superclass of the current object.
abstract	  ->      Declares a class or method that must be implemented in a subclass.  
final	      ->      Prevents inheritance, overriding, or modification.
static	      ->      Declares class-level variables or methods.
sealed	      ->      Restricts which classes can extend a given class.
permits	      ->      Specifies the subclasses allowed to extend a sealed class.
enum          ->      Declares a fixed set of constants.
record        ->      Declares an immutable data class (Java 16+).
instanceof    ->      Checks whether an object is of a specific type.
```

`5. Access Control Keywords :` Define the visibility or accessibility of classes, methods, and variables.
```bash
Keyword	                    Usage
public	      ->      Accessible from anywhere in the program.
protected	  ->      Accessible within the same package or by subclasses.
private	      ->      Accessible only within the same class.
```

`6. Package and Import Keywords :` Used to organize classes and access external code.
```bash
Keyword	                    Usage
package	     ->       Defines a namespace for classes.
import	     ->       Allows access to classes from other packages.
```

`7. Multithreading and Synchronization Keywords :` Used to handle concurrent execution of code and ensure thread safety.
```bash
Keyword	                        Usage
synchronized	  ->     Defines critical sections that only one thread can access at a time.     
volatile	      ->     Indicates that a variable may change asynchronously.
```

`8. Memory Management and Object Serialization Keywords :` Handle object persistence, garbage collection, and native method calls.
```bash
Keyword	                        Usage
transient	   ->     Excludes a variable from serialization.
native	       ->     Specifies that a method is implemented in native (non-Java) code.
```

`9. Modifier and Utility Keywords :` Define additional behaviors and precision control.
```bash
Keyword	                        Usage
strictfp	     ->       Ensures consistent floating-point calculations across platforms.
```

`10. Reserved (Unused) Keywords :` These keywords are reserved but not currently used by Java.
```bash
Keyword	                        Usage
const	     ->       Reserved for future use; not currently implemented.
goto	     ->       Reserved for future use; not currently implemented.
```

`11. Special Literals :` Special literals represent predefined constant values in Java and cannot be used as identifiers.
```bash
Keyword	                        Usage
true	     ->          Represents the boolean value true.
false	     ->          Represents the boolean value false.
null	     ->          Represents the absence of any reference value.
```

## 7. Identifiers
An identifier in Java is a name given to programming elements such as variables, classes, methods, packages, and interfaces. It is used to uniquely identify these elements in a program.

- Identifiers help in naming and accessing different elements in a Java program
- Each identifier must follow Java naming rules to avoid compilation errors

`Rules For Naming Java Identifiers :`
```bash
1. The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), '$'(dollar sign) and '_' (underscore). 
For example, "geek@" is not a valid Java identifier as it contains a '@', a special character.

2. Identifiers should not start with digits([0-9]). For example, "123geeks" is not a valid Java identifier.

3. Java identifiers are case-sensitive.

4. There is no limit on the length of the identifier, but it is advisable to use an optimum length of 4 - 15 letters only.

5. Reserved Words can't be used as an identifier. For example, "int while = 20;" is an invalid statement as a while is a reserved word.
```

`Examples :`
```bash
For Valid Idenfiers :
MyVariable
MYVARIABLE
myvariable
x
i
x1
i1
_myvariable
$myvariable
sum_of_array

For Invalid Identifiers :
My Variable                         // contains a space
123geeks                            // Begins with a digit
a+c                                 // plus sign is not an alphanumeric character
variable-2                          // hyphen is not an alphanumeric character
sum_&_difference                    // ampersand is not an alphanumeric character
```

## 8. Literals
In Java, a Literal is a value of boolean, numeric, character, or string data. Any constant value that can be assigned to the variable is called a literal. 

```bash
// Here 100 is a constant/literal.
int x = 100; 
```

`Types of Literals in Java :`

`1. Integral Literals :` For Integral data types (byte, short, int, long), we can specify literals in four ways, which are listed below:
```bash
1.1 Decimal literals (Base 10): In this form, the allowed digits are 0-9.

int x = 101;

1.2 Octal literals (Base 8): In this form, the allowed digits are 0-7.

// The octal number should be prefix with 0.

int x = 0146; 

1.3 Hexadecimal literals (Base 16): In this form, the allowed digits are 0-9, and characters are a-f. We can use both uppercase and lowercase characters, as we know that Java is a case-sensitive programming language, but here Java is not case-sensitive.

// The hexa-decimal number should be prefix

// with 0X or 0x.

int x = 0X123Face; 

1.4. Binary literals: From 1.7 onward, we can specify literal value even in binary form also, allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B.

int x = 0b1111;
```

`2. Floating-Point Literals :` For Floating-point data types, Java supports decimal as well as hexadecimal floating-point literals. Octal floating-point literals are not supported.
```bash
2.1 Decimal literals(Base 10): In this form, the allowed digits are 0-9. 

double d = 123.456;
```

`3. Char Literals :` For char data types, we can specify literals in four ways : 
```bash
1 Single quote: We can specify literal to a char data type as a single character within the single quote.

char ch = 'a';

2. Char literal as Integral literal: we can specify char literal as integral literal, which represents the Unicode value of the character, and that integral literal can be specified either in Decimal, Octal, and Hexadecimal forms. But the allowed range is 0 to 65535.

char ch = 062;  // Octal literal representing character with Unicode code 50 (which is '2')

3. Unicode Representation: We can specify char literals in Unicode representation ‘\uxxxx’. Here xxxx represents 4 hexadecimal numbers.

char ch = '\u0061';// Here /u0061 represent a.

4. Escape Sequence: Every escape character can be specified as char literals.

char ch = '\n';
```

`4. String Literals :` Any sequence of characters within double quotes is treated as String literals. 
```bash
String s = "Hello";
```

`5. Boolean Literals :` Only two values are allowed for Boolean literals, i.e., true and false. 
```bash
boolean b = true;

boolean c = false;
```

## 9. Java User Input - Scanner Class
The Scanner class, introduced in Java 5, belongs to the java.util package allows developers to read input from different sources easily.

- The Scanner class can read input from keyboard (console), files, strings, and data streams.
- Beginners prefer it due to its simple syntax and ease of use compared to older approaches like BufferedReader.

### Steps of Using `Scanner` in Java

The `Scanner` class is used to take input from the user through the keyboard. To use it in a Java program, follow these steps:

**Step 1: Import the `Scanner` Class**

Import the `Scanner` class from the `java.util` package.

```java
import java.util.Scanner;
```

---

**Step 2: Create a `Scanner` Object**

Create an object of the `Scanner` class to read input from the keyboard.

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` → Class name.
- `sc` → Object name.
- `new` → Creates a new object.
- `System.in` → Represents the standard input stream (keyboard).

---

**Step 3: Read User Input**

Use the appropriate `Scanner` method to read the required data type.

```java
int age = sc.nextInt();
double salary = sc.nextDouble();
float marks = sc.nextFloat();
String name = sc.nextLine();
char grade = sc.next().charAt(0);
boolean isPassed = sc.nextBoolean();
```

---

**Step 4: Process the Input**

Use the entered values in your program.

```java
int sum = num1 + num2;
System.out.println("Sum = " + sum);
```

---

**Step 5: Close the `Scanner`**

Close the `Scanner` object after use to free system resources.

```java
sc.close();
```

---

**`Complete Example`**

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Step 1 & 2: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 3: Read input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Step 4: Display input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Step 5: Close Scanner
        sc.close();
    }
}
```

**`Key Points`**
- Import the `Scanner` class using `import java.util.Scanner;`.
- Create a `Scanner` object using `new Scanner(System.in)`.
- Use methods like `nextInt()`, `nextDouble()`, `nextLine()`, and `nextBoolean()` to read input.
- Process the input as required.
- Always close the `Scanner` object using `sc.close()` after use.

### `BufferedReader vs Scanner in Java`

| Aspect | BufferedReader | Scanner |
|--------|----------------|----------|
| **Primary Use** | Efficiently reads character streams from an input source. | Reads formatted input such as integers, floating-point numbers, strings, and other data types. |
| **Speed** | Faster because it reads data without parsing. | Slower due to parsing overhead (e.g., `nextInt()`, `nextDouble()`). |
| **Exception Handling** | Requires handling checked exceptions such as `IOException`. | Does not require handling checked exceptions, making it easier to use. |
| **Flexibility** | Better suited for reading large amounts of input efficiently. | Best suited for reading simple, formatted user input. |
| **Thread Safety** | Synchronized, making it thread-safe. | Not synchronized and therefore not thread-safe by default. |
| **Common Use** | Frequently used in competitive programming and applications requiring fast input. | Commonly used in beginner programs and general-purpose applications for user input. |

**`Which One Should You Use?`**

- Use **`Scanner`** when:
  - You are learning Java.
  - You need to read different data types (`int`, `double`, `String`, etc.).
  - Simplicity and readability are more important than speed.

- Use **`BufferedReader`** when:
  - You need faster input performance.
  - You are working with large input files or competitive programming.
  - You don't mind manually converting input using methods like `Integer.parseInt()`.

**`Example`**

**`Using Scanner`**
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
sc.close();
```

**`Using BufferedReader`**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int number = Integer.parseInt(br.readLine());
```

### `Common Scanner Methods in Java`

The `Scanner` class provides various methods to read different types of input from the user.

| Method | Description | Example |
|--------|-------------|---------|
| `nextBoolean()` | Reads a boolean value (`true` or `false`). | `boolean isPassed = sc.nextBoolean();` |
| `nextByte()` | Reads a byte value. | `byte age = sc.nextByte();` |
| `nextDouble()` | Reads a double-precision decimal value. | `double salary = sc.nextDouble();` |
| `nextFloat()` | Reads a float value. | `float marks = sc.nextFloat();` |
| `nextInt()` | Reads an integer value. | `int number = sc.nextInt();` |
| `nextLine()` | Reads an entire line of text (including spaces). | `String name = sc.nextLine();` |
| `nextLong()` | Reads a long integer value. | `long population = sc.nextLong();` |
| `nextShort()` | Reads a short integer value. | `short year = sc.nextShort();` |
| `next()` | Reads a single word (stops at whitespace). | `String firstName = sc.next();` |

**`Example Program`**

```java
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Number: " + number);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);

        sc.close();
    }
}
```

**`Key Points`**
- `next()` reads **only one word**.
- `nextLine()` reads the **entire line**, including spaces.
- `nextInt()`, `nextDouble()`, `nextFloat()`, etc., read specific data types.
- After using methods like `nextInt()` or `nextDouble()`, call `nextLine()` if you plan to read a full line of text next to consume the leftover newline character.

## 10. System.out.println in Java
System.out.println() in Java is one of the most commonly used statements to display output on the console. It prints the given data and then moves the cursor to the next line, making it ideal for readable output.

- Used to display text, variables, and expressions on the console.
- Automatically adds a newline after printing the output.
- Commonly used for debugging, testing, and displaying program results.

**`Syntax`**
```bash
System.out.println(parameter)

- Parameter: The parameter can be a value of any data type such as int, double, char, String, or even no parameter at all.
```

### Understanding `System.out.println()` in Java

The statement **`System.out.println()`** can be understood by breaking it into three parts:


**Breakdown of `System.out.println()`**
```bash
1. System: System is a final class present in the java.lang package. It provides access to system-related resources such as input, output, and error streams.

2. out: out is a public static object of type PrintStream defined inside the System class. It represents the standard output stream, usually the console.

3. println(): println() is a method of the PrintStream class. It prints the specified value and then adds a new line at the end of the output. It is an enhanced version of print().
```

**`Example`**

```java
public class PrintExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java Programming.");
    }
}
```

**`Output`**

```text
Hello, World!
Welcome to Java Programming.
```

### Difference Between `print()` and `println()`

| Feature | `System.out.print()` | `System.out.println()` |
|---------|-----------------------|-------------------------|
| **New line after output** | Prints the output without moving the cursor to the next line. | Prints the output and moves the cursor to the next line. |
| **Cursor position** | Remains at the end of the printed text. | Moves to the beginning of the next line. |
| **Parameter requirement** | Requires at least one argument to print. | Accepts an argument or no argument. Calling `println()` with no argument prints a blank line. |
| **Blank line printing** | Cannot print a blank line directly. | Can print a blank line using `System.out.println();`. |
| **Common usage** | Used when output should continue on the same line. | Used when each output should appear on a separate line. |

**`Example`**

```java
System.out.print("Hello ");
System.out.print("World");
```

**`Output:`**
```text
Hello World
```

```java
System.out.println("Hello");
System.out.println("World");
```

**Output:**
```text
Hello
World
```

**`Key Points`**

- `System` is a predefined class in Java.
- `out` is an object of the `PrintStream` class.
- `println()` is a method used to print output followed by a new line.
- `System.out.println()` is commonly used to display messages, variables, and program results on the console.
- No additional library import is required because `System` belongs to the `java.lang` package, which is imported automatically.


## 11. Operators
Java operators are symbols used to perform operations on variables and values. They play a key role in expressions, calculations, and decision-making in programs. Operators help simplify complex logic into concise statements.

- They follow a defined precedence and associativity to determine execution order.
- Some operators work on a single operand (unary), while others require two or more operands.

**`1. Arithmetic Operators :`** **Arithmetic operators** are used to perform mathematical operations on numeric values. Java provides arithmetic operators to carry out operations such as addition, subtraction, multiplication, division, and finding the remainder.

**`Arithmetic Operators`**

| Operator | Name | Description | Example |
|----------|------|-------------|---------|
| `+` | Addition | Adds two operands. | `10 + 5` → `15` |
| `-` | Subtraction | Subtracts the second operand from the first. | `10 - 5` → `5` |
| `*` | Multiplication | Multiplies two operands. | `10 * 5` → `50` |
| `/` | Division | Divides the first operand by the second operand. | `10 / 5` → `2` |
| `%` | Modulus (Remainder) | Returns the remainder after division. | `10 % 3` → `1` |

**`Example Program`**

```java
public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```

**`Output`**

```text
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Modulus: 0
```

**`Key Points`**

- The `+` operator is used for **addition** and also for **string concatenation**.
- The `/` operator performs **integer division** when both operands are integers.
- The `%` operator returns the **remainder** after division.
- Arithmetic operators can be used with `byte`, `short`, `int`, `long`, `float`, and `double` data types.
- Parentheses `()` can be used to control the order of evaluation in arithmetic expressions.

<br>

**`2. Unary Operators :`** A **Unary Operator** in Java is an operator that performs an operation on **a single operand**. It is commonly used to modify a value, change its sign, invert a boolean value, or manipulate bits.

**`Key Points`**
- Unary operators work on **only one operand**.
- They are used for value modification, logical operations, and bit manipulation.
- They help write concise and readable code.

**`Types of Unary Operators in Java`**

`1. Unary Plus Operator (`+`)`

The **Unary Plus (`+`)** operator indicates that the operand is positive. It does not change the value of the operand but can improve code readability.

**Syntax**
```java
+operand
```

**Example**
```java
int num = 10;
System.out.println(+num); // Output: 10
```

---

`2. Unary Minus Operator (`-`)`

The **Unary Minus (`-`)** operator changes the sign of its operand. It converts a positive value into a negative value and a negative value into a positive value.

**Syntax**
```java
-operand
```

**Example**
```java
int num = 10;
System.out.println(-num); // Output: -10
```

---

`3. Logical NOT Operator (`!`)`

The **Logical NOT (`!`)** operator reverses a boolean value. If the operand is `true`, it becomes `false`, and vice versa.

**Syntax**
```java
!operand
```

**Example**
```java
boolean isPassed = true;
System.out.println(!isPassed); // Output: false
```

---

`4. Increment Operator (`++`)`

The **Increment (`++`)** operator increases the value of a variable by **1**.

**`4.1 Post-Increment (`num++`)`**

The **Post-Increment** operator first uses the current value of the variable and then increases it by **1**.

**Syntax**
```java
num++
```

**Example**
```java
int num = 10;

System.out.println(num++); // Output: 10
System.out.println(num);   // Output: 11
```

---

**`4.2 Pre-Increment (`++num`)`**

The **Pre-Increment** operator increases the value of the variable by **1** before it is used.

**Syntax**
```java
++num
```

**Example**
```java
int num = 10;

System.out.println(++num); // Output: 11
```

---

`5. Decrement Operator (`--`)`

The **Decrement (`--`)** operator decreases the value of a variable by **1**.

**`5.1 Post-Decrement (`num--`)`**

The **Post-Decrement** operator first uses the current value of the variable and then decreases it by **1**.

**Syntax**
```java
num--
```

**Example**
```java
int num = 10;

System.out.println(num--); // Output: 10
System.out.println(num);   // Output: 9
```

---

**`5.2 Pre-Decrement (`--num`)`**

The **Pre-Decrement** operator decreases the value of the variable by **1** before it is used.

**Syntax**
```java
--num
```

**Example**
```java
int num = 10;

System.out.println(--num); // Output: 9
```

---

`6. Bitwise Complement Operator (`~`)`

The **Bitwise Complement (`~`)** operator inverts every bit of an integer value. Every `0` becomes `1`, and every `1` becomes `0`.

**Syntax**
```java
~operand
```

**Example**
```java
int num = 5;

System.out.println(~num); // Output: -6
```

> **Note:** The `~` operator works only with integral data types (`byte`, `short`, `int`, `long`, and `char`). It cannot be used with `float`, `double`, or `boolean`.
---
<br>

`3. Assignment Operators :`

An **Assignment Operator** in Java is used to **assign a value to a variable**. It can also perform an arithmetic or bitwise operation and assign the result back to the same variable.

**`Key Points`**
- Assignment operators assign values to variables.
- They help write shorter and more readable code.
- Compound assignment operators combine an operation with assignment.

**`Types of Assignment Operators in Java`**

`1. Simple Assignment Operator (`=`)`

The **Simple Assignment (`=`)** operator assigns the value on the right-hand side to the variable on the left-hand side.

**Syntax**
```java
variable = value;
```

**Example**
```java
int num = 10;
System.out.println(num); // Output: 10
```

---

`2. Add and Assign Operator (`+=`)`

The **Add and Assign (`+=`)** operator adds the right operand to the left operand and assigns the result to the left operand.

**Syntax**
```java
variable += value;
```

**Example**
```java
int num = 10;
num += 5;

System.out.println(num); // Output: 15
```

---

`3. Subtract and Assign Operator (`-=`)`

The **Subtract and Assign (`-=`)** operator subtracts the right operand from the left operand and assigns the result.

**Syntax**
```java
variable -= value;
```

**Example**
```java
int num = 10;
num -= 3;

System.out.println(num); // Output: 7
```

---

`4. Multiply and Assign Operator (`*=`)`

The **Multiply and Assign (`*=`)** operator multiplies the left operand by the right operand and assigns the result.

**Syntax**
```java
variable *= value;
```

**Example**
```java
int num = 10;
num *= 4;

System.out.println(num); // Output: 40
```

---

`5. Divide and Assign Operator (`/=`)`

The **Divide and Assign (`/=`)** operator divides the left operand by the right operand and assigns the result.

**Syntax**
```java
variable /= value;
```

**Example**
```java
int num = 20;
num /= 4;

System.out.println(num); // Output: 5
```

---

`6. Modulus and Assign Operator (`%=`)`

The **Modulus and Assign (`%=`)** operator finds the remainder after division and assigns it to the variable.

**Syntax**
```java
variable %= value;
```

**Example**
```java
int num = 20;
num %= 6;

System.out.println(num); // Output: 2
```

---

`7. Bitwise AND and Assign Operator (`&=`)`

The **Bitwise AND and Assign (`&=`)** operator performs a bitwise AND operation and assigns the result.

**Syntax**
```java
variable &= value;
```

**Example**
```java
int num = 10; // 1010
num &= 6;     // 0110

System.out.println(num); // Output: 2
```

---

`8. Bitwise OR and Assign Operator (`|=`)`

The **Bitwise OR and Assign (`|=`)** operator performs a bitwise OR operation and assigns the result.

**Syntax**
```java
variable |= value;
```

**Example**
```java
int num = 10; // 1010
num |= 6;     // 0110

System.out.println(num); // Output: 14
```

---

`9. Bitwise XOR and Assign Operator (`^=`)`

The **Bitwise XOR and Assign (`^=`)** operator performs a bitwise XOR operation and assigns the result.

**Syntax**
```java
variable ^= value;
```

**Example**
```java
int num = 10; // 1010
num ^= 6;     // 0110

System.out.println(num); // Output: 12
```

---

`10. Left Shift and Assign Operator (`<<=`)`

The **Left Shift and Assign (`<<=`)** operator shifts the bits of the left operand to the left and assigns the result.

**Syntax**
```java
variable <<= value;
```

**Example**
```java
int num = 5;

num <<= 1;

System.out.println(num); // Output: 10
```

---

`11. Right Shift and Assign Operator (`>>=`)`

The **Right Shift and Assign (`>>=`)** operator shifts the bits of the left operand to the right and assigns the result.

**Syntax**
```java
variable >>= value;
```

**Example**
```java
int num = 20;

num >>= 2;

System.out.println(num); // Output: 5
```

---

`12. Unsigned Right Shift and Assign Operator (`>>>=`)`

The **Unsigned Right Shift and Assign (`>>>=`)** operator shifts the bits to the right without preserving the sign bit and assigns the result.

**Syntax**
```java
variable >>>= value;
```

**Example**
```java
int num = 20;

num >>>= 2;

System.out.println(num); // Output: 5
```

---

<br>

`4. Relational Operators`

A **Relational Operator** in Java is used to **compare two values or expressions**. It returns a **boolean value** (`true` or `false`) based on the result of the comparison. Relational operators are commonly used in decision-making statements such as `if`, `if-else`, `while`, and `for` loops.

**`Key Points`**
- Relational operators compare two operands.
- The result of a relational operation is always a **boolean** value (`true` or `false`).
- They are widely used in conditional and looping statements.

**`Types of Relational Operators in Java`**

`1. Equal To Operator (`==`)`

The **Equal To (`==`)** operator checks whether two operands are equal. It returns true if both operands are equal; otherwise, it returns false.

**Syntax**
```java
operand1 == operand2
```

**Example**
```java
int a = 10;
int b = 10;

System.out.println(a == b); // Output: true
```

---

`2. Not Equal To Operator (`!=`)`

The **Not Equal To (`!=`)** operator checks whether two operands are not equal. It works opposite to the equal-to operator.

**Syntax**
```java
operand1 != operand2
```

**Example**
```java
int a = 10;
int b = 20;

System.out.println(a != b); // Output: true
```

---

`3. Greater Than Operator (`>`)`

The **Greater Than (`>`)** operator checks whether the left operand is greater than the right operand.
- Returns true if the left operand is greater.
- Useful for comparing numeric values.

**Syntax**
```java
operand1 > operand2
```

**Example**
```java
int a = 20;
int b = 10;

System.out.println(a > b); // Output: true
```

---

`4. Less Than Operator (`<`)`

The **Less Than (`<`)** operator checks whether the left operand is less than the right operand.
- Returns true if the left operand is less than the right operand.
- Often used in loops and conditional expressions.

**Syntax**
```java
operand1 < operand2
```

**Example**
```java
int a = 10;
int b = 20;

System.out.println(a < b); // Output: true
```

---

`5. Greater Than or Equal To Operator (`>=`)`

The **Greater Than or Equal To (`>=`)** operator checks whether the left operand is greater than or equal to the right operand.
- Returns true if the left operand is greater than or equal to the right operand.
- Useful when equality should also satisfy the condition.

**Syntax**
```java
operand1 >= operand2
```

**Example**
```java
int a = 20;
int b = 20;

System.out.println(a >= b); // Output: true
```

---

`6. Less Than or Equal To Operator (`<=`)`

The **Less Than or Equal To (`<=`)** operator checks whether the left operand is less than or equal to the right operand.
- Returns true if the left operand is less than or equal to the right operand.
- Commonly used for range checking and loop conditions.

**Syntax**
```java
operand1 <= operand2
```

**Example**
```java
int a = 10;
int b = 20;

System.out.println(a <= b); // Output: true
```

---

**`Summary`**

| Operator | Name | Description | Example |
|----------|------|-------------|---------|
| `==` | Equal To | Checks if two operands are equal. | `a == b` |
| `!=` | Not Equal To | Checks if two operands are not equal. | `a != b` |
| `>` | Greater Than | Checks if the left operand is greater than the right operand. | `a > b` |
| `<` | Less Than | Checks if the left operand is less than the right operand. | `a < b` |
| `>=` | Greater Than or Equal To | Checks if the left operand is greater than or equal to the right operand. | `a >= b` |
| `<=` | Less Than or Equal To | Checks if the left operand is less than or equal to the right operand. | `a <= b` |

**`Example Program`**

```java
public class RelationalOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}
```

**`Output`**

```text
a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false
```