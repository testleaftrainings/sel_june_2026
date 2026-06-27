9:00 to 10:00 --->CoreJavaIntroduction 
10:00 to 10:20 ---> Breakout
10:20 to 10:30 ---> Break 
10:30 to 11:15 ---> Datatypes
11:15 to 11:35 ---> Breakout
11:35 to 12:00 ---> Operators 


PreRequisites: -JDK -Vscode Java Introduction: What is Java?

Java is a computer programming language. Java is a versatile and widely-used programming language. It allows developers to write code that can run on different types of devices, from computers to mobile phones. Java is strong and reliable. Robustness in Java refers to its ability to handle errors and unexpected situations gracefully. It includes features like strong memory management. Java uses a way of organizing code based on objects. Object-oriented programming is a programming principle that organizes code into objects, which are instances of classes. This approach promotes code reuse, modularity, and easier maintenance. Why Java?

Java is known for being flexible. Java's adaptability means that it can be used in various scenarios. Whether you're building a small application or a large-scale system, Java provides the flexibility to adapt to different requirements and environments. Java works on different types of devices. Being ''platform-independent'' means that Java code can run on various devices, such as computers, smartphones, and other gadgets. This is possible because Java programs are compiled into an intermediate form (bytecode), which can be executed on any device with a Java Virtual Machine (JVM). Java is versatile and excels in a wide range of applications. It is commonly used in web development, mobile app development (Android), enterprise systems, scientific applications, and more. Its broad applicability makes it a popular choice for developers working on diverse projects. Java Architecture: JDK (Java Development Kit):

JDK is like a toolkit for Java developers. The JDK includes everything a developer needs to write, compile, and run Java applications. It contains the Java compiler, libraries, and other tools to help create software. If you want to build Java applications, you need the JDK. JRE (Java Runtime Environment):

JRE is like a package to run Java programs. The JRE is necessary for running Java applications. It includes the Java Virtual Machine (JVM) and essential libraries. If you only want to run Java programs and not develop them, you just need the JRE. It allows your computer to execute Java applications. JVM (Java Virtual Machine):

JVM is like a virtual computer for Java. The JVM is a virtualized environment that runs Java bytecode. When you compile your Java code, it turns into bytecode, a set of instructions for the JVM. The JVM, in turn, translates these instructions into machine code that your computer understands. It makes Java programs "write once, run anywhere" by enabling them to run on any device with a compatible JVM. IDE: Definition: An IDE, or Integrated Development Environment, is like a digital workspace where programmers write, edit, and manage their code. It provides tools such as a code editor, debugger, and compiler, all in one place, making it easier for developers to create and maintain their software. Package: Definition: In Java, a package is a way to organize and group related classes and interfaces. It helps in avoiding naming conflicts and enhances the overall structure of a program. Naming Convention: start with lowerCase Class: Definition: In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects created from the class will have. Variables: Definition: Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data. Datatypes: Definition: Datatypes specify the type of data a variable can hold.

Folder structure of project: src main java resources test java

Different types of datatype: A)primitive datattype(predefined)--->size is defined already

1)WholeNUmbers(Integer) -byte(8bit) -short(16bit)---5digits -int(32bit)-->1 to 9 digits -long(64bit)-->more than 9 digits 2)decimal -float -double 3)char--to store a single character 4)boolean-returns true or false B)Non-Primitive(userdefined)-->size is not predefined


Operators:
operators are special symbols that perform specific operations

1.Arithmetic operators: These operators are used to perform mathematical operations such as addition, subtraction, multiplication,and division.

(addition)
(subtraction)
(multiplication) / (division)-Que % (modulus or remainder)
2.Assignment operators: These operators are used to assign values to variables. = (assignment)//a=2; += (add and assign) -= (subtract and assign) *= (multiply and assign) /= (divide and assign) %= (modulus and assign)

3.Comparison operators: These operators are used to compare two value and return a boolean value (true or false). == (equal to) != (not equal to)

(greater than) < (less than) = (greater than or equal to) <= (less than or equal to)

4.Logical operators: These operators are used to combine two or more boolean expressions and return a boolean value. && (logical and) (multiplication) 1 T 0 F A B C 0 0 0--->false 1 0 0 0 1 0 1 1 1---->true

|| (logical or)(addition) addition A B C 1 0 1--->true 0 0 0-->false 1 1 1

! (logical not or negation) 1---0 T F

0---1 F T

unary operator Increment operator (++) Decrement operator (--)
