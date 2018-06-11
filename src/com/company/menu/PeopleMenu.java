package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {
    private Scanner input = new Scanner(System.in);

    protected void manageInventory() {
        try {


            //Find out what type of person we need to manage.
            System.out.println("Are you" +
                    "\n1: an Employee" +
                    "\n2: a Visitor" +
                    "\n3: go back" +
                    "\n4: Exit program");

            //Handles People management options
            switch (input.nextInt()) {
                case 1:
                    //Handle Employee
                    manageEmployee();
                    break;
                case 2:
                    //Handle Visitor
                    manageVisitor();
                    break;
                case 3:
                    //Handle going back to mainMenu().
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    //Handle exiting the program.
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                default:
                    //Handle incorrect input.
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
                    managePeople();
                    break;

            }
        } catch (InputMismatchException ime) {
            //handle any input that is not an int
            input.nextLine();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 4.");
            managePeople();

        }

    }

    private void manageVisitor() {

    }

    private void manageEmployee() {

    }

    private void managePeople() {

    }
}
