package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        getSubscriptions().add(user);
    }

    public boolean isSubscribed(User user) {
        String name = "";
        for (User list : getSubscriptions()) {
            if (user.username == getUsername()) name = getUsername();
        }
        if (name == user.username) return true;
        else return false;
    }

    public boolean isFriend(User user) {
        String friend1 = "", friend2 = "";
        for (User list : getSubscriptions()) {
            if (user.username == getUsername()) friend1 = getUsername();
        }
        for (User list : user.getSubscriptions()) {
            if (username == user.getUsername()) friend2 = user.getUsername();
        }
        if (username.equals(friend2) && user.getUsername().equals(friend1))
            return true;
        else return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(new User(getUsername()), user, text);
    }

    public String toString() {
        return getUsername();
    }
}

