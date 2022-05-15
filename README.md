# DesignPatterns

>Encapsulate what varies

> Favor composition over inheritance  
 
> Program to interfaces, not implementation  

Pattern Groups: 
* Creational:
	1. Factory Method: Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.  
	2. Abstract Factory: Lets you produce families of related objects without specifying their concrete classes.  
	3. Builder: Lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.    
	4. Prototype: Lets you copy existing objects withoud making your code dependent on their classes.    
	5. Singleton: Lets you ensure that a class has only one instance, while providing a global access point to this instance.   
 
* Structural: How we utilize objects, performance , refactoring, memory utilization.
	eg: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy  
 
* Behavioral: 

## 1. Factory Method   
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The Factory Method pattern suggests that you replace direct object construction calls with calls to a special factory method. 
  
![Factory_Method_UML](https://github.com/sameesh-s/DesignPatterns/blob/main/FactoryMethodPattern.jpg?raw=true)  

* Use the Factory Method when you don't know beforehand the exact types and dependencies of the objects your code should work with.  
* Use the Factory Method when you want to provide users of your library or framework a way to extend its internal components.  
* Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time( using pool ).   
* We can use Factory Method along with Iterator to let collection subclasses return different types of interators that are compatiable with the collections.  
* Factory Method is a specialization of **Template Method**. At the same time, a Factory Method may serve as a step in a large Template Method.  

## 2. Abstract Factory     
**Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes. The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product family. The next move is to declare the Abstract Factory-an interface with a list of creation methods for all products that are part of the product familiy. Those methods must return **abstract** product types represented by the interfaces we extracted previously.  

![Abstract Factory](https://github.com/sameesh-s/DesignPatterns/blob/main/AbstractFactory.jpg?raw=true)  

* Use the Abstract Factory when the your code needs to work with various families of related products, but you don't want it to depend on the concreate classes of thos products-they mightbe unknown  beforehand or you simply want to allow for future extensibility.  

## 2. Observer  
A one-to-many relationship between a set of objects. When the state of one object changes, all of its dependents are notified. 
Keeping your objects in the Know.  
One to many relationship and loose coupling.  
Publishers + Subscribers = Observer Pattern  

![Observer Pattern UML](https://github.com/sameesh-s/DesignPatterns/blob/main/ObserverPattern_.jpg?raw=true)

> Strive for loosely coupled designs between objects that interact.  

Loosly coupled designs are much more flexible and resilient to change.
loosly coupled designs allow us to build flexible OOSystems that can handle change because they minimize the interdependency between objects.  

Java Observerable class and Observer interface were deprecated in Java 9, phasing out.

push and pull scenario in Observer , pull seems better. (fetching data from inside observer update method, observer is notified from subject.  

* The Observer Pattern defines one-to-many relationship between objects. 
* Subjects update Observers using a common interface.  
* Observers of any concrete type can participate in the pattern. 
* Observers are loosly coupled in that the Subject knows nothing about them, Other than that they implement the Observer interface.  
* You can push or pull data from the Subject when using the pattern( pull is considered more correct)  
* Swing make heavy use of Observer pattern.eg. RXJava, JavaBeans, RMI, Coco, Javascript events.  
* The Observer pattern is related to Publish/Subscribe Pattern which is more complex situations with multiple Subjects and/or multiple message types.  
* The Observer pattern is commonly used pattern, and it is used in MVC also.  

## Decorator Pattern 

The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. 
Solution for class explosion related to inheritance.  

> Classes should be open for extension, but closed for modification.  

our goal is to allow classes to be easily extended to incorporate new behavior without modifying existing code. What do we get if we accomplish this? Designs that are resilient to change and flexible enough to take on new functionality to meet changing requirements.  
[NOTE] be careful when choosing the areas of code that need to be extended, applying the Open-closed principle EVERYWHERE is wasteful and unnecessary, and can lead to complex, hard to understand code.  

## Adapter Pattern  
real life example: plug adapter(But in software scenario we can have multiple adaptors).  
* Simple solution 
* Easy to implement 
* Integrate with Legacy  
* Can provide multiple adapters  

#### Concepts
* Convert interface into another interface  
* Translates requests  
* Client, Adapter, Adaptee  
* Eg: Arrays -> Lists, Streams  

#### Design
* Client centric
* Integrate new with old
* Interface, but not required  
* Adaptee can be the implementation  
![Adapter Pattern UML](https://github.com/sameesh-s/DesignPatterns/blob/main/AdapterPattern.jpg?raw=true)

#### Pitfalls
* Not a lot
* Don't compolicate
* Multiple adapters
* Don't add functionality( if you add functionality with adapter then you should consider decorator or some other structural pattern)  

#### Contrast to Other Patterns

| Adapter                         | Bridge                     |
|---------------------------------|---------------------------:|
| Works after code is designed    | Designed upfront           |
| Legacy                          | Abstraction and Impl vary  |
| Retrofitted                     | Built in advance           |
| Provides different interface    | Both adapt multiple systems|

## Bridge Pattern
Bridge is very similar to adapter with the main difference being that the bridge works with new code whereas the adapter works with legacy code. 
#### Concepts
* Decouple Abstraction and implementation  
* Encapsulation, Composition, Inheritance 
* Changes in Abstraction won't affect client  
* Details won't be right(to begin with, so that things won't break with changes)
* Eg: Driver, JDBC 

#### Design
* Interfaces and Abstract classes
* Composition over Inheritance  
* More than Composition  
* Expect change from both sides  
* In UML : Abstraction, Implementor, Refined Abstraction, Concrete Implementor  
![Bridge Pattern UML](https://github.com/sameesh-s/DesignPatterns/blob/main/BridgePattern.jpg?raw=true)

## Facade Pattern

Put a basic class and masks some of those things that were going on behind the object behind it, It's just dealing with making a simpler interface to the client.  
* Simplifies client Interface 
* Easy pattern to implement 
* Refactoring pattern  
* Make an API easier to use
* reduce dependencies on outside code 
* Simplify the interface or client useage (wrap complex code within interface using this facade to make to simpler to use for enduser) 
* Usually a refactoring pattern 
* eg. java.net.URL
	javax.faces.context.FacesContext  
In case if build a JDBC components in facade pattern we will be hiding all the complex logic related to statement and connection management and all behind a facade and we will provide simple methods to the enduser to access like createTable() inside the facade and map all the complex methods inside facade method. 

#### Design
* Class that utilizes composition 
* Shouldn't have a need for inheritance( if you think you need inheritence you probably will need to use another pattern)    
* Typically encompasses full lifecycle  
![Facade Pattern UML](https://github.com/sameesh-s/DesignPatterns/blob/main/FacadePattern.jpg?raw=true)

#### Pitfalls  
* Typically used to clean up code 
* Should think about API design( if another pattern solve the problem then take that instead of Facade)  
* Shouldn't use the inheritance so Facade uses Flat problem/structure  
* The "Singleton" of Structural Pattern( often misused( to hide ugly things that are into the code) or overused in strucutral pattern)  

#### Contrast to Other patterns   
| Facade                        |Adapter                        |
|-------------------------------|:-----------------------------:|
|Simplifies Interface           | Also a Refactoring pattern    |
|Works with composites          | Modifies behaviour(adds)      |
|Cleaner API                    | Provides a different API      |




Refactoring book contents ---> 
Refactoring book notes ends --->  
