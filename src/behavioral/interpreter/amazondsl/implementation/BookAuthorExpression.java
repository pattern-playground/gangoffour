package behavioral.interpreter.amazondsl.implementation;

import behavioral.interpreter.amazondsl.AbstractExpression;

import java.util.List;

public class BookAuthorExpression extends AbstractExpression {

    private String searchString;

    public BookAuthorExpression(String searchString) {
        this.searchString = searchString;
    }

    public String interpret(InterpreterContext context) {
        List<Book> books = context.getAllBooks();
        StringBuffer result = new StringBuffer();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(searchString)) {
                result.append(book.toString());
                System.out.println("Found a matching Author!");
            }
        }
        return result.toString();
    }
}