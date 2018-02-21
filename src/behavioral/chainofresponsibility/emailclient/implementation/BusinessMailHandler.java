package behavioral.chainofresponsibility.emailclient.implementation;

import behavioral.chainofresponsibility.emailclient.Email;
import behavioral.chainofresponsibility.emailclient.EmailHandler;

public class BusinessMailHandler implements EmailHandler {

    // Each Handler has a reference to the next
    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@businessaddress.com")) {
            System.out.println("Couldn't find a businessaddress email address...");
            if(next != null) {
                next.handleRequest(email);
            }
        } else {
            System.out.println("Found an @businessaddress.com and did something!");
        }
    }
}
