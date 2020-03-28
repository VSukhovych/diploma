package edu.nulp.diploma.utils;

import edu.nulp.diploma.logger.LogListener;

import javax.mail.*;
import java.util.Properties;

public class MailsUtil {

    private MailsUtil() {
    }

    private static Store store;
    private static Folder emailFolder;
    private static Message[] messages;

    private static Message[] connectMailServer(String host, String user, String password) {
        Message[] messages = null;
        try {
            //create properties field
            Properties properties = new Properties();
            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            store = emailSession.getStore("pop3s");
            store.connect(host, user, password);

            //create the folder object and open it
            emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            messages = emailFolder.getMessages();

        } catch (NoSuchProviderException e) {
            LogListener.log.error("Incorrect mail provider was chosen", e);
        } catch (MessagingException ex) {
            LogListener.log.error("Error during validate mail message", ex);
        } catch (Exception exp) {
            LogListener.log.error("General error during sending mail", exp);
        }

        return messages;
    }
}
