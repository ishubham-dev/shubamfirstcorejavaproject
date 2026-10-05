* ###### Core Java Notes



1. WHAT IS JAVA?

ANS:- Java is a general-purpose, class-based, object-oriented language developed by James Gosling at Sun Microsystems in 1995.



It is now maintained by Oracle Corporation.



Java programs are compiled into bytecode, which runs on the JVM, making them platform-independent.







2.Explain the java Features?

ANS:- 1. Simple Syntax

Java removes complex features like pointers and multiple inheritance.



Easier for beginners to learn compared to C/C++.



Example: A basic Hello World program requires minimal code.



2\. Object-Oriented

Supports classes, objects, inheritance, encapsulation, abstraction, and polymorphism.



Encourages modular, reusable, and maintainable code.



Example: A Student class with attributes and methods demonstrates encapsulation and object creation.



3\. Platform Independence

Java code is compiled into bytecode, which runs on any system with a JVM.



Principle: “Write Once, Run Anywhere.”



This makes Java ideal for cross‑platform applications.



4\. Robustness

Strong memory management, type checking, and exception handling.



Reduces runtime errors and improves reliability.



Automatic garbage collection prevents memory leaks.



5\. Security

No explicit pointers, bytecode verification, and built‑in security APIs.



Prevents unauthorized memory access.



Widely used in banking and enterprise systems for secure transactions.



6\. Multithreading and Concurrency

Allows multiple tasks to run simultaneously.



Useful for games, servers, and GUI applications.



Java provides APIs for thread management and synchronization.



7\. Automatic Memory Management

JVM handles memory allocation and garbage collection.



Developers don’t need to manually free memory.



Simplifies development and reduces bugs.



8\. High Performance

Uses Just‑In‑Time (JIT) compiler to convert bytecode into native machine code at runtime.



Faster execution compared to purely interpreted languages.



9\. Rich Standard Library

Provides APIs for collections, I/O, networking, databases, concurrency, and more.



Speeds up development with ready‑to‑use tools.











&#x20;    3.JVM ARCHITECTURE?



&#x20;   ANS:- JVM IS A VIRTUAL MACHINE WHICH IS THE PART OF JRE(JAVA RUN TIME ENVIRONMENT).IT  CONVERTS

&#x20;     A BYTE CODE TO MACHINE LEVEL OR HIGH LEVEL CODE. THIS IS THE ROLE OF JAVA VIRTUAL MACHINE

&#x20;    (JVM), AND ALSO  JVM HAS FEW COMPONENTS AS WELL WHICH DEFINES THE STEP BY STEP ROLE OF JVM.



&#x20;    COMPONENTS OF JVM ARCHITECTURE:-



&#x20;         1.)CLASS LOADER SUB SYSTEM:-

&#x20;

&#x20;           ROLE:- Loads .class files into memory.



&#x20;           STEPS:-



&#x20;               ->Loading : Finds and loads class bytecode.

&#x20;               ->Linking: Verifies Bytecode allocates memory for static variables , resolves  references.

&#x20;               ->Initialization: Assigns Values to static variables and executes static blocks.



&#x20;      TYPES OF CLASS LOADERS:-



&#x20;               ->BOOTSTRAP LOADER:-Loads Core java Class (java.lang , java.util).

&#x20;               ->Extension Loader:-Loads Classes from Java\_Home/Lib?ext.

&#x20;               ->Application Loader:-Loads user-defined Classes from the class Path.



&#x20;               

&#x20;         2.)Runtime Data Areas:-



&#x20;               ->Memory are used during program execution.



&#x20;            Includes:



&#x20;                ->Heap -> stores objects.

&#x20;                ->Method AREA (META SPACE) -> stores class-Level data.

&#x20;                ->Stack -> Each thread has its own stack.

&#x20;                ->PC REGISTER ->Tracks current instruction.

&#x20;                ->Native method stack:-Supports native (non-java) methods.



&#x20;         3.)Execution Engine:-

&#x20;                

&#x20;                ->Runs the bytecode



&#x20;            Components:-



&#x20;                ->Interpreters:- Executes the code line by line.

&#x20;                ->JIT COMPILER:-Converts frequently used bytecode into native machine code.

&#x20;                ->Garbage collector:-Frees unused memory automatically.



&#x20;         4.)NATIVE METHOD INTERFACE(JNI):-



&#x20;                ->Acts as a bridge between java and native applications  (c/c++).

&#x20;                ->Allows java to access System-Level resources.

&#x20;                ->Works with native libraries (.dll in windows .so in Linux).



&#x20;        5.)NATIVE METHOD LIBRARIES:-



&#x20;                 ->The actual libraries required by the JVM to execute native methods.

&#x20;                 ->These are platform -Specific files that JNI uses to connect java with the operating system.

&#x20;   





&#x20;               























































&#x20;                                

















&#x20;

