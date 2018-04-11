package behavioral.memento.employeeapp.run;

import behavioral.memento.employeeapp.EmployeeCaretaker;
import behavioral.memento.employeeapp.EmployeeMemento;
import behavioral.memento.employeeapp.EmployeeOriginator;

public class Client {

    public static void main(String[] args) {

        EmployeeOriginator empOriginator = new EmployeeOriginator(306,"Mark Ferguson", "131011789610","Sales Manager");
        EmployeeMemento empMemento = empOriginator.saveToMemento();
        EmployeeCaretaker empCaretaker = new EmployeeCaretaker();

        empCaretaker.addMemento(empMemento);
        System.out.println("\n Original EmpOriginator");

        empOriginator.printInfo();
        System.out.println("\n EmpOriginator after updating phone number");

        empOriginator.setEmpPhoneNo("131011888886");

        empMemento = empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after updating designation");
        empOriginator.setEmpDesignation("Senior Sales Manager");

        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after undoing designation update");
        empMemento = empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);

        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);

        empOriginator.printInfo();

        System.out.println("\n Original EmpOriginator after undoing phone number update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();
    }
}

// *** Output ***
// Original EmpOriginator
// ID: 306
// Name: Mark Ferguson
// Phone Number: 131011789610
// Designation: Sales Manager

// EmpOriginator after updating phone number
// ID: 306
// Name: Mark Ferguson
// Phone Number: 131011888886
// Designation: Sales Manager

// EmpOriginator after updating designation
// ID: 306
// Name: Mark Ferguson
// Phone Number: 131011888886
// Designation: Senior Sales Manager

// EmpOriginator after undoing designation update
// ID: 306
// Name: Mark Ferguson
// Phone Number: 131011888886
// Designation: Sales Manager

// Original EmpOriginator after undoing phone number update
// ID: 306
// Name: Mark Ferguson
// Phone Number: 131011789610
// Designation: Sales Manager