Source: https://dzone.com/articles/design-patterns-template-method

**What is it?**

The Template Method pattern is used when two or more implementations of a similar algorithm exist.

![alt text](https://github.com/pattern-playground/gangoffour/blob/master/images/template_method.png?raw=true)

**When Would I Use This Pattern?**

The Template Method pattern is used when:

- When behaviour of an algorithm can vary, you let subclasses implement the behaviour through overriding.
- You want to avoid code duplication, implementing variations of the algorithm in subclasses
- You want to control the point that subclassing is allowed.
- Template Method may not be an obvious choice in the beginning, but the usual sign that you should use the pattern is when you find that you have two almost identical classes working on some logic. At that stage, you should consider the power of the template method pattern to clean up your code.

As you can imagine, use of the Template Method is fairly common. You'll find it used in the Arrays class uses it for sorting. 

JFrame uses update() as a template method, subclasses of the JFrame use paint(Graphics g) as their hook method.

**Potential Downsides**

There are some downsides to the template method pattern. 

- Your base classes tend to get cluttered up with a lot of seemingly unrelated code. 
- Program flow is a little more difficult to follow - without the help of stepping through the code with a debugger.