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
1. [01_ Basic Java syntax](./Core-Java/01_HelloWorld/src/com/seclore/main/MyFirstProgram.java)
    - The nomenclature of how to create a Java class and initalize the main class was explained.
    - The concepts about how Java works internally and how it compiles code was also explained.
2. [02_Account POJO Class](./Core-Java/02_BankingApplication/src/com/seclore/pojo/Account.java)
    - Access modifiers
    - Default & Parameterized Constructors
    - Method/Constructor Overiding
    - Getters & Setters
3. [02_Account Presentation Class V1](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV1.java)
    - Calling Constructors, Getters & Setters, Methods
    - Scanner
4. [02_Account Presentation Class V2](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV2.java)
    - Loops
    - Switch Case
    - Conditional Statements
5. [02_Savings POJO Class](./Core-Java/02_BankingApplication/src/com/seclore/pojo/Savings.java)
    - Inheritance
    - super()
    - Overiding base class methods
6. [02_Account Presentation Class V3](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV3.java)
    - Object reference
    - Anonmus object
### Day Two
7. [02_Account Presentation Class V4](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV4.java)
    - [Overiding toString Method](./Core-Java/02_BankingApplication/src/com/seclore/pojo/Account.java#L70)
8. [02_Current POJO Class](./Core-Java/02_BankingApplication/src/com/seclore/pojo/Current.java)
    - Local Variables & Accessing Base Class variables
9. [02_Account Presentation Class V5](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV5.java)
    - Copying and refereing objects
10. [02_Account Presentation Class V6](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV6.java)
    - [Static Variables](./Core-Java/02_BankingApplication/src/com/seclore/pojo/Account.java#L7)
11. [02_Account Presentation Class V7](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV7.java)
    - Aggregating code
### Day Three
12. [02_Account Presentation Class V8](./Core-Java/02_BankingApplication/src/com/seclore/main/AccountMainV8.java)
    - Runtime Polymorphism of objects
13. [03_Shapes](./Core-Java/03_Polymorphism/src/com/seclore/main/ShapeMain.java)
    - [Factory Class](./Core-Java/03_Polymorphism/src/com/seclore/factory/ShapeFatory.java)
    - Runtime Polymorphism of objects
    - [POJO](./Core-Java/03_Polymorphism/src/com/seclore/pojo)
14. [04_CandyMachine](./Core-Java/04_CandyMachine/src/com/seclore/main/MainCandy.java)
    - Inheritance? Not always needed, is it?
    - [POJO](./Core-Java/04_CandyMachine/src/com/seclore/pojo)
15. [05_MessagingApp]()
    - Loose Coupling ([Client](./Core-Java/05_MessengerAplication/src/com/seclore/main/MessengerMain.java), [MiddleWare](./Core-Java/05_MessengerAplication/src/com/seclore/application/MessengerApp.java), [Factory](./Core-Java/05_MessengerAplication/src/com/seclore/factory/MessageFactory.java), [POJO](./Core-Java/05_MessengerAplication/src/com/seclore/pojo))
    - [SOLID](https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design) - Single Responsibility principle
    - [Design Patterns](https://www.javatpoint.com/design-patterns-in-java) - Factory pattern
### Day Four
16. JAVA Basiscs
    - [JDK, JRE, JVM](https://www.javatpoint.com/difference-between-jdk-jre-and-jvm)
    - JAR creation
    - JAR compatibility
    - String Vs String Buffer Vs String Builder
    - Abstract class (Printer Example)
17. [06 String Utility](./Core-Java/06_StringUtilitly/src/com/seclore/util)
    - [Importing JAR files libraries](./Core-Java/06_StringUtilityClient/src/com/seclore/main/MyMain.java)
18. [07 CallByValue_CallByReference](./Core-Java/07_CallByValue_CallByReference/src/com/seclore/main/MessaengerMain.java)
    - Call by value (Primitive value)
    - Call by reference (Object)
19. [08 Interface Vs Abstract](./Core-Java/08_InterfaceVsAbstractClass/src/com/seclore/pojo/Canon6541A.java)
    - Interface
    - Default method
    - Multiple Inheritance
### Day Five
20. [09 Exception Handling](./Core-Java/09_ExceptionHandling/src/com/seclore/main/ProductMain.java)
    - Error(Compile time) Vs Exception(Runtime)
    - Checked Vs Unchecked(Runtime Exception)
	- Coding Standards (com.seclore.main / pojo / util / exceptions)
	- Throwable hierarchy
	- [Throw Vs Throws](./Core-Java/09_ExceptionHandling/src/com/seclore/pojo/Product.java)
	- Exception hierarchy
    - [Custom Exception](./Core-Java/09_ExceptionHandling/src/com/seclore/exceptions/InvalidProductPriceException.java)
21. 10 FileIO
    - [File MetaData](./Core-Java/10_FileIO/src/com/seclore/util/FileMetadata.java)
	- [Char Stream](./Core-Java/10_FileIO/src/com/seclore/main/ReadCharStreamMain.java) Vs [Byte Stream](./Core-Java/10_FileIO/src/com/seclore/main/ReadWriteByteStreamMain.java)
### Day Six
22. [11 Collections](./Core-Java/11_Collections/src/com/seclore/main/EmployeeDAOMain.java)
    - [Array Sort](./Core-Java/11_Collections/src/com/seclore/main/ArraySortMain.java)
    - [ArrayList](./Core-Java/11_Collections/src/com/seclore/main/ArrayListMain.java)
    - [Data Access Object](./Core-Java/11_Collections/src/com/seclore/dao/EmployeeDAO.java) (DAO) - CURD operations
    - [Custom Comparator](./Core-Java/11_Collections/src/com/seclore/comparator/EmployeeNameComparator.java)
    - [Custom Sort](./Core-Java/11_Collections/src/com/seclore/main/ArraySortMain.java)
    - [Iterator & ListIterator](./Core-Java/11_Collections/src/com/seclore/main/CollectionIterator.java)
    - [HashMap](./Core-Java/11_Collections/src/com/seclore/main/HashMapMain.java)
    - [HashSet](./Core-Java/11_Collections/src/com/seclore/main/HashSetMain.java)
### Day Seven
23. [12 Annotations](./Core-Java/12_Annotations/src/com/seclore/main/AnnotationMain.java)
    - Default Annotations in Java
    - [Adding Annotations](./Core-Java/12_Annotations/src/com/seclore/pojo/MyClass.java)
    - [Custom Annotations](./Core-Java/12_Annotations/src/com/seclore/annotations/MyAnnotation.java)
	
24. [13 XML](./Core-Java/13_XML/src/com/seclore)
    - [Annotations](./Core-Java/13_XML/src/com/seclore/pojo/Employee.java)
    - [Write XML File](./Core-Java/13_XML/src/com/seclore/main/WriteXMLFile.java)
    - [Read XML File](./Core-Java/13_XML/src/com/seclore/main/DOMParser.java)
    - [Write Object as XML](./Core-Java/13_XML/src/com/seclore/main/CovertObjectIntoXML.java)
    - [Read XML as Object](./Core-Java/13_XML/src/com/seclore/main/CovertXMLintoXML.java)

25. [14_XPath](./Core-Java/14_XPath/src/com/seclore/main/XPathTest.java)
    - Various Queries

### Day Eight
26. [15_JSON](./Core-Java/15_JSON/src/com/seclore)
    - [Read JSON](./Core-Java/15_JSON/src/com/seclore/main/ReadJSON.java)
    - [Write JSON](./Core-Java/15_JSON/src/com/seclore/main/WriteJSON.java)
    - Annotations
    - [Map to JSON](./Core-Java/15_JSON/src/com/seclore/main/JacksonMapJSONMain.java)
    - [JSON to Map](./Core-Java/15_JSON/src/com/seclore/main/JacksonJSONMapMain.java)
    - [JSON to Array of Objects](./Core-Java/15_JSON/src/com/seclore/main/JacksonJSONArrayObjectMain.java)
    - [Create Views](./Core-Java/15_JSON/src/com/seclore/views/CompanyViews.java)
    - [Using Views](./Core-Java/15_JSON/src/com/seclore/main/JacksonJSONViewMain.java)

## ✍️ Authors <a name = "authors"></a>
- [@vivek-gohil](https://github.com/vivek-gohil) - Instructor
- [@caldenrodrigues](https://github.com/caldenrodrigues/) - Documentation
- [@pratiknerurkar](https://youtu.be/5KFDenDWsdQ) - Documentation
