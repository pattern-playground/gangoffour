package behavioral.chainofresponsibility.emailclient.run;

import behavioral.chainofresponsibility.emailclient.Email;
import behavioral.chainofresponsibility.emailclient.EmailHandler;
import behavioral.chainofresponsibility.emailclient.EmailProcessor;
import behavioral.chainofresponsibility.emailclient.implementation.BusinessMailHandler;
import behavioral.chainofresponsibility.emailclient.implementation.GMailHandler;

public class EmailClient {

    private EmailProcessor processor;

    public EmailClient() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new EmailProcessor();
    }

    public void addRule(EmailHandler handler) {
        processor.addHandler(handler);
    }

    public static void main(String[] args) {
        EmailClient client = new EmailClient();

        BusinessMailHandler businessMailHandler = new BusinessMailHandler();
        GMailHandler gMailHandler = new GMailHandler();

        client.addRule(businessMailHandler);
        client.addRule(gMailHandler);

        businessMailHandler.handleRequest(new Email("someone@businessaddress.com")); // Found an @businessaddress.com and did something!
        gMailHandler.handleRequest(new Email("someone@businessaddress.com")); // Couldn't find a gmail email address...
        gMailHandler.handleRequest(new Email("someone@gmail.com")); // Found an @gmail.com and did something!
    }
}

// *** Output ***
// See above for initial output - remember that the order of the chain is important - the second example finds nothing because it is businessMailHandler that
// hands off to gMailHandler in chain, not the other way around. You could switch the order on line 31/32 and it would work. Switching the order would produce:
//      Found an @businessaddress.com and did something!    --> line 34
//      Couldn't find a gmail email address...              --> line 35
//      Found an @businessaddress.com and did something!    --> line 35
//      Found an @gmail.com and did something!              --> line 36