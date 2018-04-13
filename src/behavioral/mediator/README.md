Source: https://dzone.com/articles/design-patterns-mediator

**What is it?**

The Mediator defines the interface for communication between Colleague objects. The ConcreteMediator implements the Mediator interface and coordinates communication between Colleague objects. It is aware of all the Colleagues and their purpose with regards to inter communication.The ConcreteColleague communicates with other colleagues through the mediator.

Without this pattern, all of the Colleagues would know about each other, leading to high coupling. By having all colleagues communicate through one central point we have a decoupled system while maintaining control on the object's interactions.

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/mediator_pattern.png?raw=true)

**When Would I Use This Pattern?**

The mediator is a good choice of pattern when the communication between objects is complicated, but well defined. When there are too many relationships between the objects in your code, it's time to think of having such a central point of control.

An observer based variation of the mediator pattern is used in Java Message Service (JMS) implementations, which allows applications to subscribe and publish data to other applications. This is a common combination of patterns that makes sense.

A good example is the mediator that Apache Camel bases itself on. Encapsulates and mediates interactions between components.

**Potential Downsides**

While this pattern aims to reduce complexity, without proper design, the Mediator object itself can become very complicated itself.

The Observer pattern could help here, with the colleague objects dealing with the events from the mediator, rather than having the mediator look after all orchestration.