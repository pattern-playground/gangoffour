package behavioral.memento.employeeapp;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmployeeCaretaker {

    final Deque<EmployeeMemento> mementos = new ArrayDeque<>();

    public EmployeeMemento getMemento()
    {
        EmployeeMemento empMemento= mementos.pop();
        return empMemento;
    }

    public void addMemento(EmployeeMemento memento)
    {
        mementos.push(memento);
    }
}