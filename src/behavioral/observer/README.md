Source: https://dzone.com/articles/design-patterns-uncovered

**What is it?**

Of all of the design patterns that are out there, the Observer is one that you've probably used already, even if you weren't aware of it. The Observer pattern is the gold standard in decoupling - the separation of objects that depend on each other.

The Observer is known as a behavioural pattern, as it's used to form relationships between objects at runtime.  The definition provided in the original Gang of Four book on Design Patterns states: 

_Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically._

The idea behind the pattern is simple - one of more Observers are interested in the state of a Subject and register their interest with the Subject by attaching themselves. When something changes in our Subject that the Observer may be interested in, a notify message is sent, which calls the update method in each Observer. 

When the Observer is no longer interested in the Subject's state, they can simply detatch themselves. The following sequence diagram illustrates the registration and notification flow in action.

The benefits here are quite clear. To pass data onto the observers, our subject doesn't need to know who needs to know. Instead, everything is done through a common interface, and the notify method just calls all the objects out there that have registered their interest. This is a very powerful decoupling - meaning that any object can simply implement the Observer interface and get updates from the Subject. 

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/observer_pattern.png?raw=true)

**When Would I Use This Pattern?**

In general, you want to use this pattern to reduce coupling. If you have an object that needs to share it's state with others, without knowing who those objects are, the Observer is exactly what you need.

You'll have seen, and probably used, the Observer many times if you've done any UI programming, especially in Swing. The whole concept of listeners is based on this pattern. The event listener is the most popular, where you register an ActionListener to a UI control, such a button, and react to action events using the actionPerformed method. In this case, the ActionListener is the Observer and the button is your Subject. As the button changes state, you can react, if you choose to, in your actionPerformed method. 

The typical real world uses of the pattern all revolve around this type of event handling system. 

**Potential Downsides**

Martin Fowler observes that it can be difficult to see the path through the code, unless you are debugging. As such, you should be careful not to have chains of observers (observers acting as subjects). 

Also, watch out for memory leaks as the subject will hold a reference to the observer unless it has de-registered. 