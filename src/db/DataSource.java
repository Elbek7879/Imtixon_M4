package db;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataSource {

    public static User currentUser = null;

    public static List<User> users = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner intScanner = new Scanner(System.in);

    static {

        User user = new User("admin", "admin", "admin", "admin", "ADMIN");
        users.add(user);
    }
}
