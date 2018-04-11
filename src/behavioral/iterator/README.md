Source: https://dzone.com/articles/design-patterns-iterator

**What is it?**

The Iterator pattern is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects.

The definition of Iterator as provided in the original Gang of Four book on DesignPatterns states: 

_Provides a way to access the elements of an aggregate object without exposing its underlying representation._

**When Would I Use This Pattern?**

This pattern is useful when you need access to elements in a set without access to the entire representation. 

When you need a uniform traversal interface, and multiple traversals may happen across elements, iterator is a good choice. 

It also makes you code much more reasonable, getting rid of the typical for loop syntax across sections of your codebase.

**Potential Downsides**

I don't see any disadvantages to this pattern. 

It's simple, widely used and provides more readable code. 

Streams are an alternative but also have their drawbacks (e.g. performance, maintainability, readability)