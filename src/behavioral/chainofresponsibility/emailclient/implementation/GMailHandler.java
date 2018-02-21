package behavioral.chainofresponsibility.emailclient.implementation;

import behavioral.chainofresponsibility.emailclient.Email;
import behavioral.chainofresponsibility.emailclient.EmailHandler;

public class GMailHandler implements EmailHandler {

    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@gmail.com")) {
            System.out.println("Couldn't find a gmail email address...");
            if(next != null) {
                next.handleRequest(email);
            }
        } else {
            System.out.println("Found an @gmail.com and did something!");
        }
    }
}
