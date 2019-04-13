package com.twu.biblioteca;

public class User {
    private String name;
    private String password;
    private int age;
    private String hobby;

    public User(String name, String password, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.hobby = hobby;
    }

    public void printUserInfo() {
        System.out.println("name: " + name + " age: "+ age + " hobby: "+ hobby);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
