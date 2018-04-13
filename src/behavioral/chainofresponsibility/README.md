Source: https://dzone.com/articles/design-patterns-uncovered-chain-of-responsibility

**What is it?**

The Chain of Responsibility is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects. 

The definition of Chain of Responsibility provided in the original Gang of Four book on DesignPatterns states: 

_Gives more than one object an opportunity to handle a request by linking receiving objects together._ 

Chain of Responsibility allows a number of classes to attempt to handle a request, independently of any other object along the chain. Once the request is handled, it completes it's journey through the chain.

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/chain_of_resp_pattern.png?raw=true)

**When Would I Use This Pattern?**

This pattern is recommended when either of the following scenarios occur in your application:

- Multiple objects can handle a request and the handler doesn't have to be a specific object
- A set of objects should be able to handle a request with the handler determined at runtime
- A request not being handled is an acceptable outcome.

The pattern is used in windows systems to handle events generated from the keyboard or mouse.

Exception handling systems also implement this pattern, with the runtime checking if a handler is provided for the exception through the call stack. If no handler is defined, the exception will cause a crash in the program, as it is unhandled.

In JavaEE, the concept of Servlet filters implement the Chain of Responsibility pattern, and may also the request to add extra information before the request is handled by a servlet.

**Potential Downsides**

Chain of Responsibility can make it difficult to follow through the logic of a particular path in the code at runtime. 

It's also important to note that there is the potential that the request could reach the end of the chain and not be handled at all.