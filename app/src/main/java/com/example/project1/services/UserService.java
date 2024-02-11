package com.example.project1.services;
import com.example.project1.domain.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> getUsers() {
        List<User> result = new ArrayList<>();
        result.add(new User("User 1", "User1@webtel.in", "Unlicensed"));
        result.add(new User("User 2", "User2@webtel.in", "Licensed"));
        result.add(new User("User 3", "User3@webtel.in", "Unlicensed"));
        return result;
    }

    public static List<User> getUserByLicence(String license) {
        List<User> result = new ArrayList<>();
        for (User u: getUsers()) {
            if (u.getStatus().equals(license)) {
                result.add(u);
            }
        }
        return result;
    }

    public static List<User> filterUsers(List<User> users, String query) {
        List<User> filteredList = new ArrayList<>();
        for (User user : users) {
            if (user.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredList.add(user);
            }
        }
        return filteredList;
    }

}
