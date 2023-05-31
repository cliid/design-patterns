# Design Patterns

Implementation of design patterns with Java, mainly from Christopher Okhravi's Design Pattern videos, including some other important design patterns from other sources such as Mosh's ones.

The following are the definitions of the design patterns described in the book "Design Patterns: Elements of Reusable Object-Oriented Software" by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides (often referred to as the "Gang of Four" or "GoF"):

## Definitions

### Abstract Factory Pattern

- Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- Key Participants: AbstractFactory, ConcreteFactory, AbstractProduct, ConcreteProduct.

### Adapter Pattern

- Intent: Convert the interface of a class into another interface clients expect. Allows classes with incompatible interfaces to work together.
- Key Participants: Target, Adapter, Adaptee.

### Bridge Pattern

- Intent: Decouple an abstraction from its implementation so that the two can vary independently.
- Key Participants: Abstraction, RefinedAbstraction, Implementation, ConcreteImplementation.

### Command Pattern

- Intent: Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
- Key Participants: Command, ConcreteCommand, Receiver, Invoker, Client.

### Composite Pattern

- Intent: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
- Key Participants: Component, Leaf, Composite.

### Decorator Pattern

- Intent: Attach additional responsibilities to an object dynamically. Provides a flexible alternative to subclassing for extending functionality.
- Key Participants: Component, ConcreteComponent, Decorator, ConcreteDecorator.

### Facade Pattern

- Intent: Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
- Key Participants: Facade, Subsystem classes.

### Factory Method Pattern

- Intent: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
- Key Participants: Creator, ConcreteCreator, Product, ConcreteProduct.

### Iterator Pattern

- Intent: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- Key Participants: Iterator, ConcreteIterator, Aggregate, ConcreteAggregate.

### Memento Pattern

- Intent: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
- Key Participants: Memento, Originator, Caretaker.

### Null Object Pattern

- Intent: Provide an object that acts as a surrogate for a null object. The Null Object provides default behavior when the original object is null.
- Key Participants: AbstractObject, RealObject, NullObject.

### Observer Pattern

- Intent: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- Key Participants: Subject, Observer, ConcreteSubject, ConcreteObserver.

### Proxy Pattern

- Intent: Provide a surrogate or placeholder for another object to control access to it.
- Key Participants: Proxy, Subject, RealSubject.

### Singleton Pattern

- Intent: Ensure a class only has one instance and provide a global point of access to it.
- Key Participants: Singleton.

### State Pattern

- Intent: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
- Key Participants: Context, State, ConcreteState.

### Strategy Pattern

- Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- Key Participants: Strategy, Context, ConcreteStrategy.

### Template Method Pattern

- Intent: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
- Key Participants: AbstractClass, ConcreteClass.
