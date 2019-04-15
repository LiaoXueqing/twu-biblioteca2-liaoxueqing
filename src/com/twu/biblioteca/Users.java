package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users;

    public Users() {
        this.users = new ArrayList<User>(){
            {
                add(new User("lxl-2018", "pass", 11, "movie"));
                add(new User("xwx-2018", "pass", 12, "music"));
                add(new User("xqq-2017", "pass", 21, "reading"));
                add(new User("wwf-2018", "pass", 17, "song"));
            }
        };
    }

    public Users(List<User> users) {
        this.users = users;
    }

    public User login(String libraryNumber, String password) {
        User loginUser = null;
        for (User user: users) {
            if(user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                loginUser = user;
                break;
            }
        }
        return loginUser;
    }

}
