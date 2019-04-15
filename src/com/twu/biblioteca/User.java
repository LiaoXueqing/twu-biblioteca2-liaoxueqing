package com.twu.biblioteca;

public class User {
    private String libraryNumber;
    private String password;
    private int age;
    private String hobby;

    public User(String libraryNumber, String password, int age, String hobby) {
        this.libraryNumber = libraryNumber;
        this.age = age;
        this.password = password;
        this.hobby = hobby;
    }

    public void printUserInfo() {
        System.out.println("LibraryNumber: " + libraryNumber + " Age: "+ age + " Hobby: "+ hobby);
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

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
