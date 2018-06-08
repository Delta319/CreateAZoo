package com.company;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Scanner input;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
        System.out.println("Welcome to the Zoo");

        System.out.println("Please choose an option. " +
                "\n1. Manage People" +
                "\n2. Manage Animals" +
                "\n3. Manage Inventory");

        switch (input.nextInt()) {
            case 1:
                //Manage People
                managePeople();
                break;
            case 2:
                //Manage Animals
                manageAnimals();
                break;
            case 3:
                //Manage Inventory
                manageInventory();
                break;
            default:
                //Handle wrong number
               //Restart method to allow user to try again.
                break;
        }
    }

    private static void manageInventory() {

    }

    private static void manageAnimals() {

    }

    private void mainMenu() {

    }

    private static void managePeople() {

    }
