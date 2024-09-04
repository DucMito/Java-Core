package service;

import entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
    public List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public boolean register(String username, String password, String email) {
        if (findUserByUsername(username) != null) {
            return false;
        }

        users.add(new User(username, password, email));
        return true;
    }

    public boolean login(String username, String password) {
        User user = findUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return false;
        }
        return true;
    }


    public boolean resetPassword(String username, String email, String newPassword) {
        User user = findUserByUsername(username);
        if (user != null && user.getEmail().equals(email)) {
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }


    public boolean changeUsername(String oldUsername, String newUsername) {
        if (findUserByUsername(oldUsername) == null || findUserByUsername(newUsername) != null) {
            return false;
        }
        User user = findUserByUsername(oldUsername);
        user.setUsername(newUsername);
        return true;
    }


    public boolean changeEmail(String username, String newEmail) {
        User user = findUserByUsername(username);
        if (user == null) {
            return false;
        }
        user.setEmail(newEmail);
        return true;
    }


    public boolean changePassword(String username, String newPassword) {
        User user = findUserByUsername(username);
        if (user == null) {
            return false;
        }
        user.setPassword(newPassword);
        return true;
    }


    public boolean isValidPassword(String password) {
        if (password.length() < 7 || password.length() > 15) return false;
        boolean hasUpperCase = false, hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
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
