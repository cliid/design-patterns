# design patterns

this repo contains implementations of various design patterns in java, mostly inspired by christopher okhravi's videos, with a few extras pulled from other sources like mosh hamedani’s work.

below are the definitions of key design patterns from "design patterns: elements of reusable object-oriented software" by erich gamma, richard helm, ralph johnson, and john vlissides (the "gang of four"):

## definitions

### abstract factory pattern
- purpose: provide a way to create related objects without specifying their exact classes.
- roles: `AbstractFactory`, `ConcreteFactory`, `AbstractProduct`, `ConcreteProduct`.

### adapter pattern
- purpose: let incompatible interfaces work together by converting one interface into another that clients expect.
- roles: `Target`, `Adapter`, `Adaptee`.

### bridge pattern
- purpose: separate an abstraction from its implementation so both can change independently.
- roles: `Abstraction`, `RefinedAbstraction`, `Implementation`, `ConcreteImplementation`.

### command pattern
- purpose: turn a request into an object so you can queue it, log it, and support undo operations.
- roles: `Command`, `ConcreteCommand`, `Receiver`, `Invoker`, `Client`.

### composite pattern
- purpose: arrange objects into tree structures to represent whole-part relationships, so you can treat them all uniformly.
- roles: `Component`, `Leaf`, `Composite`.

### decorator pattern
- purpose: add responsibilities to an object dynamically, as an alternative to subclassing.
- roles: `Component`, `ConcreteComponent`, `Decorator`, `ConcreteDecorator`.

### facade pattern
- purpose: simplify interactions with a system by providing a unified interface to its more complex subsystems.
- roles: `Facade`, `Subsystem` classes.

### factory method pattern
- purpose: let subclasses decide which object to create, instead of having the parent class specify the exact class.
- roles: `Creator`, `ConcreteCreator`, `Product`, `ConcreteProduct`.

### iterator pattern
- purpose: provide a way to sequentially access elements of a collection without exposing the underlying structure.
- roles: `Iterator`, `ConcreteIterator`, `Aggregate`, `ConcreteAggregate`.

### memento pattern
- purpose: capture an object’s internal state without exposing its details, so it can be restored later.
- roles: `Memento`, `Originator`, `Caretaker`.

### null object pattern
- purpose: use a default object when the real object is missing, to avoid null references.
- roles: `AbstractObject`, `RealObject`, `NullObject`.

### observer pattern
- purpose: automatically notify and update dependents when an object changes state.
- roles: `Subject`, `Observer`, `ConcreteSubject`, `ConcreteObserver`.

### proxy pattern
- purpose: provide a stand-in for an object, controlling access to it.
- roles: `Proxy`, `Subject`, `RealSubject`.

### singleton pattern
- purpose: ensure a class only has one instance, and provide a way to access it globally.
- roles: `Singleton`.

### state pattern
- purpose: change an object’s behavior based on its internal state.
- roles: `Context`, `State`, `ConcreteState`.

### strategy pattern
- purpose: define a set of interchangeable algorithms, allowing clients to switch between them.
- roles: `Strategy`, `Context`, `ConcreteStrategy`.

### template method pattern
- purpose: define the overall structure of an algorithm, while allowing subclasses to fill in specific steps.
- roles: `AbstractClass`, `ConcreteClass`.

