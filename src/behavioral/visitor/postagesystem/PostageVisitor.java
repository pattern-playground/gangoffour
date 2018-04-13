package behavioral.visitor.postagesystem;

public class PostageVisitor implements Visitor {

    private double totalPostageForCart;

    // Collect data about the book
    public void visit(Book book) {
        // Assume we have a calculation here related to weight and price
        // Free postage for a book over 10
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
        System.out.println("Call visit method for Book in PostageVisitor");
    }

    // Add other visitors here
    public void visit(DVD dvd) {
        totalPostageForCart += dvd.getWeight() * 3;
        System.out.println("Call visit method for DVD in PostageVisitor");
    }

    //return the internal state
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}