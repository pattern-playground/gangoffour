Source: https://dzone.com/articles/design-patterns-uncovered-14

**What is it?**

The Interpreter pattern is known as a behavioural pattern, as it's used to manage algorithms, relationships and responsibilities between objects.

The definition of Interpreter as provided in the original Gang of Four book on DesignPatterns states: 

_Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language._

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/interpretor_pattern.png?raw=true)

**When Would I Use This Pattern?**

The Interpreter pattern should be used when you have a simple grammar that can be represented as an Abstract Syntax Tree. This is the more obvious use of the pattern.

A more interesting and useful application of Interpreter is when you need a program to produce different types of output, such as a report generator.

**Potential Downsides**

Efficiency is a big concern for any implementation of this pattern. 

Introducing your own grammar requires extensive error checking, which will be time consuming for the programmer to implement, and needs careful design in order to run efficiently at runtime. 

Also, as the grammar becomes more complicated, the maintenance effort is increased. 