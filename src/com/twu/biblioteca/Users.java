package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users;

    public Users() {
        this.users = new ArrayList<User>(){
            {
                add(new User("xiaoli", "pass", 11, "movie"));
                add(new User("xiaowang", "pass", 12, "music"));
                add(new User("xiaoqi", "pass", 21, "reading"));
                add(new User("wuwu", "pass", 17, "song"));
            }
        };
    }

    public Users(List<User> users) {
        this.users = users;
    }

    public User login(String name, String password) {
        User loginUser = null;
        for (User user: users) {
            if(user.getName().equals(name) && user.getPassword().equals(password)) {
                loginUser = user;
                break;
            }
        }
        return loginUser;
    }

}
