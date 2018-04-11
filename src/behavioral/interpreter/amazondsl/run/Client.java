package behavioral.interpreter.amazondsl.run;

import behavioral.interpreter.amazondsl.AbstractExpression;
import behavioral.interpreter.amazondsl.implementation.BookAuthorExpression;
import behavioral.interpreter.amazondsl.implementation.InterpreterContext;

public class Client {

    private InterpreterContext context;

    public Client(InterpreterContext context) {
        this.context = context;
    }

    /**
     * Interprets a string input of the form   *   movies | books by title | year | name '<string>'
     */
    public String interpret(String expression) {

        // Parse the string to determine which expression to use
        AbstractExpression exp = null;
        String[] stringParts = expression.split(" ");
        String main = stringParts[0];
        String sub = stringParts[2];

        // Get the query part
        String query = expression.substring(expression.indexOf("'") + 1, expression.lastIndexOf("'"));
        if (main.equals("books")) {
            if (sub.equals("author")) {
                exp = new BookAuthorExpression(query);
            }
            // More expressions would go here to find a book such as Title ...
        } else if (main.equals("movie")) {
            // Similar statements to create movie expressions
        }

        String result = null;
        if (exp != null) {
            result = exp.interpret(context);
        }

        return result;
    }

    public static void main(String[] args) {
        InterpreterContext context = new InterpreterContext("http://aws.amazon.com/");
        Client client = new Client(context);

        // Run a query
        String result = client.interpret("books by author 'John Connolly'");
        System.out.println(result);
    }
}

// *** Output ***
// Found a matching Author!
// behavioral.interpreter.amazondsl.implementation.Book@1540e19d