package behavioral.chainofresponsibility.emailclient;

public class EmailProcessor {

    // Maintain a reference to the previous handler so we can add the next one
    private EmailHandler prevHandler;

    public void addHandler(EmailHandler handler) {
        if (prevHandler != null) {
            prevHandler.setNext(handler);
        }
        prevHandler = handler;
    }
}
