Source: https://dzone.com/articles/design-patterns-command

**What is it?**

The Command pattern is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects.

The definition of Command provided in the original Gang of Four book on Design Patterns states: 

_Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations_

Command declares an interface for all commands, providing a simple execute() method which asks the Receiver of the command to carry out an operation. 

The Receiver has the knowledge of what to do to carry out the request. 

The Invoker holds a command and can get the Command to execute a request by calling the execute method. 

The Client creates ConcreteCommands and sets a Receiver for the command. The ConcreteCommand defines a binding between the action and the receiver. 

When the Invoker calls execute the ConcreteCommand will run one or more actions on the Receiver.

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/command_pattern.png?raw=true)

**When Would I Use This Pattern?**

The Command Pattern is useful when:

- A history of requests is needed
- You need callback functionality
- Requests need to be handled at variant times or in variant orders
- The invoker should be decoupled from the object handling the invocation.
- You'll see command being used a lot when you need to have multiple undo operations, where a stack of the recently executed commands are maintained. To implement the undo, all you need to do is get the last Command in the stack and execute it's undo() method.

You'll also find Command useful for wizards, progress bars, GUI buttons and menu actions, and other transactional behaviour. 

**Potential Downsides**

This pattern ends up forcing a lot of Command classes that will make your design look cluttered - more operations being made possible leads to more command classes. 

Intelligence required of which Command to use and when leads to possible maintenance issues for the central controller.