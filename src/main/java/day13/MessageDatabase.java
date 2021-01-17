package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> MB = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message newMes = new Message(u1, u2, text);
        MB.add(newMes);
    }

    public static List<Message> getMessages() {
        return MB;
    }

    public static void showDialog(User u1, User u2) {
        for (Message mb : MB) {
            if (mb.getSender().getUsername().equals(u1.getUsername())
                    && mb.getReceiver().getUsername().equals(u2.getUsername())) {
                System.out.println(u1.getUsername() + ": " + mb.getText());
            }
            if (mb.getSender().getUsername().equals(u2.getUsername())
                    && mb.getReceiver().getUsername().equals(u1.getUsername())) {
                System.out.println(u2.getUsername() + ": " + mb.getText());
            }
        }
    }


}
