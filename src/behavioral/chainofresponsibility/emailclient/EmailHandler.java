package behavioral.chainofresponsibility.emailclient;

// Handler
public interface EmailHandler {

    // Reference to the next handler in the chain
    void setNext(EmailHandler handler);

    // Handle request
    void handleRequest(Email email);
}
