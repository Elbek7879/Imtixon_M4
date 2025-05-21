package service;
import entity.User;

import static db.DataSource.*;

public class AuthService {
    AdminService adminService = new AdminService();
    UserService userService = new UserService();

    public void service(){
        while (true){
            System.out.println("""
                    0. exit
                    1. sign Up
                    2. sign In
                    """);
            switch (intScanner.nextInt()){
                case 0 -> {
                    return;
                }
                case 1 -> {
                    signUp();
                }
                case 2 -> {
                    signIn();
                }
                default -> {
                    System.out.println("Noto'g'ri tanlov!");
                }
            }
        }
    }

    private void signUp() {

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(name,surname,email,password,"USER");
        users.add(user);
    }

    private void signIn() {

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                currentUser = user;
                if (user.getRole().equals("USER")){
                    userService.service();
                }
                if (user.getRole().equals("ADMIN")){
                    adminService.service();
                }
            }
        }
    }
}
