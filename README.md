# Java-Demo

# Module 1 : Introduction to Java
Java is a high-level, object-oriented programming language used to build web applications, mobile apps, enterprise software, and desktop applications.

# Why Java ?
Java is popular because:
1. Platform Independent – runs on any OS using JVM
2. Object-Oriented – supports OOP concepts like class and object
3. Secure – used in banking and enterprise applications
4. Robust – strong memory management
5. Multithreading – multiple tasks can run simultaneously
6. Large Community Support

# Example uses:
Web Applications
Android Applications
Desktop Software
Enterprise Systems
Cloud Applications

# How Java Works?
Java works using the following process:
1. Write code in .java file
2. Compile using javac compiler
3. Compiler converts code to bytecode (.class file)
4. Bytecode runs on JVM

Flow:
Java Source Code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
Java Virtual Machine (JVM)
        ↓
Program Output

# When Java is used ?
Java is used when we want:
- Secure applications
- Cross-platform software
- Large enterprise systems
- Android mobile applications

Companies like Google, Amazon, and Netflix use Java technologies.

# Where Java is Used?
Java is used in many areas:
- Web Development (Spring, JSP, Servlets)
- Android Apps
- Enterprise Applications
- Cloud Applications
- Banking Systems
- Scientific Applications

# Different Java Versions
Java has many versions released over time.

| Version       | Year | Features                       |
| ------------- | ---- | ------------------------------ |
| Java 1.0      | 1996 | First release                  |
| Java 2 (J2SE) | 1998 | Swing, Collections             |
| Java 5        | 2004 | Generics, Autoboxing           |
| Java 8        | 2014 | Lambda Expressions, Stream API |
| Java 11       | 2018 | Long Term Support              |
| Java 17       | 2021 | LTS version                    |
| Java 21       | 2023 | Latest LTS features            |

LTS = Long Term Support

# How Java is Different from Other Technologies
| Feature           | Java                           | Other Languages          |
| ----------------- | ------------------------------ | ------------------------ |
| Platform          | Platform Independent           | Platform Dependent       |
| Programming Type  | Object-Oriented                | Some procedural          |
| Security          | High                           | Depends on language      |
| Memory Management | Automatic (Garbage Collection) | Manual in some languages |
| Portability       | High                           | Limited                  |

Example:
- C++ → platform dependent
- Java → platform independent

# Module 2 : Introduction To Java Programming Environment

# Step 1: Download Java
Download Java Development Kit from Oracle Corporation official website.

# Steps:
- Go to Oracle website
- Download latest JDK
- Install it on your system.

# Step 2: Set Environment Path (Windows)
- Open System Properties
- Click Advanced System Settings
- Click Environment Variables
- In System Variables → select Path
- Add JDK path

# Example:
C:\Program Files\Java\jdk-21\bin

Check installation using command prompt:
- java -version
- javac -version

# Module 3: Fundamentals of Java Programming

# 1. Naming Convention of Java Language
Java follows specific naming rules and conventions to make code readable.

# Rules
- Names can contain letters, digits, _ and $
- Cannot start with a number
- Cannot use Java keywords

# Conventions
| Element     | Convention | Example            |
| ----------- | ---------- | ------------------ |
| Class Name  | PascalCase | `StudentData`      |
| Method Name | camelCase  | `calculateTotal()` |
| Variable    | camelCase  | `totalMarks`       |
| Constant    | UPPER_CASE | `MAX_VALUE`        |

# Example
class StudentData {
    
     int totalMarks;

}

# 2. Comments
Comments are used to explain code and are ignored by the compiler.

Types of Comments

1. Single Line Comment
// This is a single line comment

2. Multi Line Comment
/* This is
   multi line comment */

3. Documentation Comment
/**
 * This is used for documentation
 */ 

# 3. Statements
A statement is a single instruction in Java.

# Example:
int a = 10;

System.out.println(a);

Each statement ends with semicolon ( ; )
