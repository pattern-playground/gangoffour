package behavioral.interpreter.amazondsl.implementation;

import java.util.ArrayList;
import java.util.List;

public class AmazonWebService {

    public List<Movie> getAllMovies() {
        return null;
    }

    public List<Book> getAllBooks() {

        // Return a Mock of all Books found through the web service
        Book book = new Book("John Connolly");
        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }
}
