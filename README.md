<h2 align="center">Seclore - Core Java Induction</h3>

<p align="center"> A course on Core Java was conducted for the 2020 Batch of Freshers. The course consists of the basics of Java up to Advanced level, dealing with complicated topics as it progresses.
    <br> 
</p>

## 📝 Table of Contents
- [Introduction](#introduction)
- [Dependencies](#dependencies)
- [Concepts Covered](#conceptscovered)
- [Authors](#authors)

## 🧐 Introduction <a name = "introduction"></a>
- The approach used to train the students was as such; the theory of every concept was explained in detail using illustrations. Then the concept explained was explained with a small example with sudo-code or with actual code. The next step was to take a real life example and included the concept in it (One exaple is carried out across multiple examples).

## ⛓️ Dependencies <a name = "dependencies"></a>
- [Java ^1.8](https://www.java.com/en/) - Programming Language
- [Eclipse EE](https://www.eclipse.org/) - IDE

## Concepts Covered <a name = "conceptscovered">
### Day One
1. [01_ Basic Java syntax](./01_HelloWorld/src/com/seclore/main/MyFirstProgram.java)
    - The nomenclature of how to create a Java class and initalize the main class was explained.
    - The concepts about how Java works internally and how it compiles code was also explained.
2. [02_Account POJO Class](./02_BankingApplication/src/com/seclore/pojo/Account.java)
    - Access modifiers
    - Default & Parameterized Constructors
    - Method/Constructor Overiding
    - Getters & Setters
3. [02_Account Presentation Class V1](./02_BankingApplication/src/com/seclore/main/AccountMainV1.java)
    - Calling Constructors, Getters & Setters, Methods
    - Scanner
4. [02_Account Presentation Class V2](./02_BankingApplication/src/com/seclore/main/AccountMainV2.java)
    - Loops
    - Switch Case
    - Conditional Statements
5. [02_Savings POJO Class](./02_BankingApplication/src/com/seclore/pojo/Savings.java)
    - Inheritance
    - super()
    - Overiding base class methods
6. [02_Account Presentation Class V3](./02_BankingApplication/src/com/seclore/main/AccountMainV3.java)
    - Object reference
    - Anonmus object
### Day Two
7. [02_Account Presentation Class V4](./02_BankingApplication/src/com/seclore/main/AccountMainV4.java)
    - [Overiding toString Method](./02_BankingApplication/src/com/seclore/pojo/Account.java#L70)
8. [02_Current POJO Class](./02_BankingApplication/src/com/seclore/pojo/Current.java)
    - Local Variables & Accessing Base Class variables
9. [02_Account Presentation Class V5](./02_BankingApplication/src/com/seclore/main/AccountMainV5.java)
    - Copying and refereing objects
10. [02_Account Presentation Class V6](./02_BankingApplication/src/com/seclore/main/AccountMainV6.java)
    - [Static Variables](./02_BankingApplication/src/com/seclore/pojo/Account.java#L7)
11. [02_Account Presentation Class V7](./02_BankingApplication/src/com/seclore/main/AccountMainV7.java)
    - Aggregating code
### Day Three
12. [02_Account Presentation Class V8](./02_BankingApplication/src/com/seclore/main/AccountMainV8.java)
    - Runtime Polymorphism of objects
13. [03_Shapes](./03_Polymorphism/src/com/seclore/main/ShapeMain.java)
    - [Factory Class](./03_Polymorphism/src/com/seclore/factory/ShapeFatory.java)
    - Runtime Polymorphism of objects
    - [POJO](./03_Polymorphism/src/com/seclore/pojo)
14. [04_CandyMachine](./04_CandyMachine/src/com/seclore/main/MainCandy.java)
    - Inheritance? Not always needed, is it?
    - [POJO](./04_CandyMachine/src/com/seclore/pojo)
15. [05_MessagingApp]()
    - Loose Coupling ([Client](./05_MessengerAplication/src/com/seclore/main/MessengerMain.java), [MiddleWare](./05_MessengerAplication/src/com/seclore/application/MessengerApp.java), [Factory](./05_MessengerAplication/src/com/seclore/factory/MessageFactory.java), [POJO](./05_MessengerAplication/src/com/seclore/pojo))
    - [SOLID](https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design) - Single Responsibility principle
    - [Design Patterns](https://www.javatpoint.com/design-patterns-in-java) - Factory pattern
### Day Four
16. JAVA Basiscs
    - [JDK, JRE, JVM](https://www.javatpoint.com/difference-between-jdk-jre-and-jvm)
    - JAR creation
    - JAR compatibility
    - String Vs String Buffer Vs String Builder
    - Abstract class (Printer Example)
17. [06 String Utility](./06_StringUtilitly/src/com/seclore/util)
    - [Importing JAR files libraries](./06_StringUtilityClient/src/com/seclore/main/MyMain.java)
18. [07 CallByValue_CallByReference](./07_CallByValue_CallByReference/src/com/seclore/main/MessaengerMain.java)
    - Call by value (Primitive value)
    - Call by reference (Object)
19. [08 Interface Vs Abstract](./08_InterfaceVsAbstractClass/src/com/seclore/pojo/Canon6541A.java)
    - Interface
    - Default method
    - Multiple Inheritance
### Day Five
20. [09 Exception Handling](./09_ExceptionHandling/src/com/seclore/main/ProductMain.java)
    - Error(Compile time) Vs Exception(Runtime)
    - Checked Vs Unchecked(Runtime Exception)
	- Coding Standards (com.seclore.main / pojo / util / exceptions)
	- Throwable hierarchy
	- [Throw Vs Throws](./09_ExceptionHandling/src/com/seclore/pojo/Product.java)
	- Exception hierarchy
    - [Custom Exception](./09_ExceptionHandling/src/com/seclore/exceptions/InvalidProductPriceException.java)
21. 10 FileIO
    - [File MetaData](./10_FileIO/src/com/seclore/util/FileMetadata.java)
	- [Char Stream](./10_FileIO/src/com/seclore/main/ReadCharStreamMain.java) Vs [Byte Stream](./10_FileIO/src/com/seclore/main/ReadWriteByteStreamMain.java)
### Day Six
22. [11 Collections](./11_Collections/src/com/seclore/main/EmployeeDAOMain.java)
    - [Array Sort](./11_Collections/src/com/seclore/main/ArraySortMain.java)
    - [ArrayList](./11_Collections/src/com/seclore/main/ArrayListMain.java)
    - [Data Access Object](./11_Collections/src/com/seclore/dao/EmployeeDAO.java) (DAO) - CURD operations
    - [Custom Comparator](./11_Collections/src/com/seclore/comparator/EmployeeNameComparator.java)
    - [Custom Sort](./11_Collections/src/com/seclore/main/ArraySortMain.java)
    - [Iterator & ListIterator](./11_Collections/src/com/seclore/main/CollectionIterator.java)
    - [HashMap](./11_Collections/src/com/seclore/main/HashMapMain.java)
    - [HashSet](./11_Collections/src/com/seclore/main/HashSetMain.java)
### Day Seven
23. [12 Annotations](./12_Annotations/src/com/seclore/main/AnnotationMain.java)
    - Default Annotations in Java
    - [Adding Annotations](./12_Annotations/src/com/seclore/pojo/MyClass.java)
    - [Custom Annotations](./12_Annotations/src/com/seclore/annotations/MyAnnotation.java)
	
24. [13 XML]()

## ✍️ Authors <a name = "authors"></a>
- [@vivek-gohil](https://github.com/vivek-gohil) - Instructor
- [@caldenrodrigues](https://github.com/caldenrodrigues/) - Documentation
- [@pratiknerurkar](https://youtu.be/5KFDenDWsdQ) - Documentation
