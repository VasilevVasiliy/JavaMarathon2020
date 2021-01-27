package day13;

import java.util.Date;

public class Message {

    User sender;
    User receiver;
    String text;
    Date date;

    Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        String mess = ("FROM: " + getSender() + "\nTO: " + getReceiver() + "\n" +
                "ON: " + getDate() + "\n" + getText());
        return mess;
    }

}
