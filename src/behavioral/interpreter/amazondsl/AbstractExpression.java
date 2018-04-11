package behavioral.interpreter.amazondsl;

import behavioral.interpreter.amazondsl.implementation.InterpreterContext;

public abstract class AbstractExpression {

    public abstract String interpret(InterpreterContext context);
}