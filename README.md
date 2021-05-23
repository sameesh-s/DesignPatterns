# DesignPatterns

>Encapsulate what varies

> Favor composition over inheritance  
 
> Program to interfaces, not implementation  

## 2. Observer  
A one-to-many relationship between a set of objects. When the state of one object changes, all of its dependents are notified. 
Keeping your objects in the Know.  
One to many relationship and loose coupling.  
Publishers + Subscribers = Observer Pattern  

![alt text](https://github.com/sameesh-s/DesignPatterns/blob/main/ObserverPattern.jpg?raw=true)

> Strive for loosely coupled designs between objects that interact.  

loosly coupled designs allow us to build flexible OOSystems that can handle change because they minimize the interdependency between objects.  

Java Observerable class and Observer interface were deprecated in Java 9, phasing out.

push and pull scenario in Observer , pull seems better. (fetching data from inside observer update method, observer is notified from subject.  

