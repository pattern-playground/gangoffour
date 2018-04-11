package behavioral.interpreter.amazondsl.implementation;

import java.util.List;

public class InterpreterContext {

    // Assume web service is setup
    private AmazonWebService webService = new AmazonWebService();

    public InterpreterContext(String endpoint) {
        //create the web service.
    }

    public List<Movie> getAllMovies() {
        return webService.getAllMovies();
    }

    public List<Book> getAllBooks() {
        return webService.getAllBooks();
    }
}