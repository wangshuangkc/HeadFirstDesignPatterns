# HeadFirstDesignPatterns
Java codes for Head First Design Patterns

## OO Basics
* Abstraction
* Encapsulation
* Inheritance
* Polymorphism

## OO Principles
* Encapsulate what varies
* Favor composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact
* Classes should be open for extension but closed for modification
* Depend on abstractions, do not depend on concrete classes

## OO Patterns

**Chapter 1. [Strategy Pattern](./StrategyPattern/src)**<br>
Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

**Chapter 2. [Observer Pattern](./ObserverPattern/src)**<br>
Define a one-to-many dependency between objects
so that when on object changes state, all its dependents are notified and updated automatically.

**Chapter 3. [Decorator Pattern](./DecoratorPattern/src)**<br>
Attach additional responsibilities to an object dynamicly. Decorators privode a flexible alternative to subclassing for extending functionality.

**Chapter 4. [Factory Pattern](./FactoryPattern/src)**<br>
Abstract Factory provides an interface for creating families of related or dependent objects without specifying their concrete classes. <br>
Factory Method defines an interface for creating an object, but let subclasses to decide which class to initializ; lets a class defer initialization to the subclasses.

**Chapter 10. [State Pattern](./StatePattern/src)**<br>
Allow an object to alter its behavior when its internal state changes.
The object will appear to change its class.

**Chapter 11. [Proxy Pattern](./ProxyPattern)**<br>
Provide a surrogate or placeholder for another object to control access to it.
