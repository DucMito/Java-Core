package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public final List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }
    public void register(String username, String password, String email) {
        if (findUserByUsername(username) != null) {
            System.out.println("Username đã tồn tại.");
            return;
        }
        users.add(new User(username, password, email));
        System.out.println("Register successful!");
    }

    public void login(String username, String password) {
        User user = findUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            System.out.println("Login fail. Username or Password sai.");
            return;
        }
        System.out.println("Chào mừng " + username + "!");
    }

    public void resetPassword(String username, String email, String newPassword) {
        User user = findUserByUsername(username);
        if (user != null && user.getEmail().equals(email)) {
            user.setPassword(newPassword);
            System.out.println("Change password successful.");
        } else {
            System.out.println("Email không khớp với tài khoản.");
        }
    }

    public void changeUsername(String oldUsername, String newUsername) {
        if (findUserByUsername(oldUsername) == null) {
            System.out.println("Username cũ không tồn tại.");
            return;
        }
        if (findUserByUsername(newUsername) != null) {
            System.out.println("Username mới đã tồn tại.");
            return;
        }

        User user = findUserByUsername(oldUsername);
        user.setUsername(newUsername);
        System.out.println("Thay đổi username thành công.");
    }

    public void changeEmail(String username, String newEmail) {
        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Username không tồn tại.");
            return;
        }

        user.setEmail(newEmail);
        System.out.println("Thay đổi email thành công.");
    }


    public void changePassword(String username, String newPassword) {
        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Username không tồn tại.");
            return;
        }

        if (isValidPassword(newPassword)) {
            user.setPassword(newPassword);
            System.out.println("Thay đổi mật khẩu thành công.");
        } else {
            System.out.println("Mật khẩu không hợp lệ.");
        }
    }

    public boolean isValidPassword(String password) {
        if (password.length() < 7 || password.length() > 15)
            return false;
        boolean hasUpperCase = false, hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
            {
                hasUpperCase = true;
            }
            if (!Character.isLetterOrDigit(c))
            {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasSpecialChar;
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

