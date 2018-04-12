Source: https://dzone.com/articles/state-pattern

**What is it?**

The State pattern allows an object to alter its behavior when its internal state changes

**When Would I Use This Pattern?**

An object’s behavior depends on its state, and it must change its behavior at run-time depending on that state.
Operations have large, multipart conditional statements that depend on the object’s state.

**Potential Downsides**

There are some potential bad uses of the state pattern. 

For example, some operations may not be possible when the context is in certain states.