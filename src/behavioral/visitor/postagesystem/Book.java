package behavioral.visitor.postagesystem;

// Concrete element
public class Book implements Visitable {

    private double price;
    private double weight;

    // Accept the visitor
    public void accept(Visitor visitor) {
        System.out.println("Call accept method in Book object");
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}