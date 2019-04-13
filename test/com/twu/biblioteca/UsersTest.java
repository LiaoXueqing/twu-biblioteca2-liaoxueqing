package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UsersTest {

    private List<User> userList;
    private Users users;

    @Before
    public void setUp() throws Exception {
        userList = new ArrayList<User>(){
            {
                add(new User("xiaoli", "pass", 11, "movie"));
                add(new User("xiaowang", "pass", 12, "music"));
                add(new User("xiaoqi", "pass", 21, "reading"));
                add(new User("wuwu", "pass", 17, "song"));
            }
        };
        users = new Users(userList);
    }

    @Test
    public void loginRight() {
        User loginUser = users.login("xiaoli","pass");
        assertNotNull(loginUser);
    }

    @Test
    public void loginError() {
        User loginUser = users.login("renren","renren");
        assertNull(loginUser);
    }

}