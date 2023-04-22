package Activité13;


import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private static ArrayList<User> users = new ArrayList<User>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static boolean userExists(String login, String password) {
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
