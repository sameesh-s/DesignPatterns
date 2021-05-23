# DesignPatterns

>Encapsulate what varies

> Favor composition over inheritance  
 
> Program to interfaces, not implementation  

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

