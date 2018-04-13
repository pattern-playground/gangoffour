package behavioral.visitor.postagesystem;

// Visitor interface
public interface Visitor {

    public void visit(Book book);

    // Visit other concrete items
    public void visit(DVD dvd);
}
