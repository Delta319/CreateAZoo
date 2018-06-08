package com.company;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu =  new Menu();
        menu.mainMenu();
        System.out.println("Welcome to the Zoo");

        System.out.println("Please choose an option. " +
                "\n1. Manage People" +
                "\n2. Manage Animals" +
                "\n3. Manage Inventory");

    }
}
