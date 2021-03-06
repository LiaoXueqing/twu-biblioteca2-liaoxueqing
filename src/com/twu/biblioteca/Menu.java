package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer, String> memuOptions;

    public Menu() {
        memuOptions = new HashMap<Integer, String>(){
            {
                put(8, "Checkout movie");
                put(7, "View available movies");
                put(6, "View personal information");
                put(5, "View checkout books");
                put(4, "Login in");
                put(3, "Return book");
                put(2, "Checkout book");
                put(1, "List of books");
                put(0, "Exit");
            }
        };
    }

    public Menu(Map<Integer, String> memuOptions) {
        this.memuOptions = memuOptions;
    }

    public void printMenuOptions() {
        System.out.println();
        System.out.println("************************************");
        System.out.println();
        System.out.println("------ Please choose the menu ------");
        memuOptions.forEach((key, value) -> {
            System.out.println("         " + key +" : " + value);
        });
        System.out.println();
        System.out.println("************************************");
        System.out.println();
    }

    public boolean checkInput(int option) {
        if(memuOptions.keySet().contains(option)) {
            //choose right
            return true;
        } else {
            //choose error
            return false;
        }
    }

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    public Map<Integer, String> getMemuOptions() {
        return memuOptions;
    }

    public void setMemuOptions(Map<Integer, String> memuOptions) {
        this.memuOptions = memuOptions;
    }
}
