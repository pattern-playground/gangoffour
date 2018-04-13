Source: https://dzone.com/articles/design-patterns-visitor

**What is it?**

The Visitor is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects. 

The definition of Visitor provided in the original Gang of Four book on DesignPatterns states: 

_Allows for one or more operation to be applied to a set of objects at runtime, decoupling the operations from the object structure._ 

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/visitor_pattern.png?raw=true)

**When Would I Use This Pattern?**

The pattern should be used when you have distinct and unrelated operations to perform across a structure of objects. 

This avoids adding in code throughout your object structure that is better kept separate, so it encourages cleaner code. 

You may want to run operations against a set of objects with different interfaces.  

Visitors are also valuable if you have to perform a number of unrelated operations across the classes.

In summary, if you want to decouple some logical code from the elements that you're using as input, visitor is probably the best pattern for the job.

**Potential Downsides**

The arguments and return types for the visiting methods needs to be known in advance, so the Visitor pattern is not good for situtations where these visited classes are subject to change. 
Every time a new type of Element is added, every Visitor derived class must be amended. 

Also, it can be difficult to refactor the Visitor pattern into code that wasn't already designed with the pattern in mind. 
And, when you do add your Visitor code, it can look obscure. The Visitor is powerful, but you should make sure to use it only when necessary.   