package com.company.menu;

import com.company.people.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {
    private Scanner input = new Scanner(System.in);

    protected void managePeople() {
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
        System.out.println("You are in the Visitor menu." +
                "\nWhat would you like to do:" +
                "\n1.Create New Visitor" +
                "\n2. View All Visitor" +
                "\n3. Remove an Visitor" +
                "\n4. Edit an Visitor" +
                "\n5. Go back" +
                "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
                    //Create New Visitor
                    createPerson(2);
                    break;
                case 2:
                    //View all Visitors
                    break;
                case 3:
                    //Remove Visitor
                case 4:
                    //Edit Visitor
                    break;
                case 5:
                    //Go Back
                    manageVisitor();
                    break;
                case 6:
                    //Exit Program
                    System.exit(0);
                    break;
                default:
                    //Handle if an incorrect number is put in
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 6.");
                    manageVisitor();
                    break;
            }
        } catch (InputMismatchException ime) {


        }

    }


    private void manageEmployee() {

        System.out.println("You are in the employee menu." +
                "\nWhat would you like to do:" +
                "\n1.Create New Employee" +
                "\n2. View All Employees" +
                "\n3. Remove an Employee" +
                "\n4. Edit an Employee" +
                "\n5. Go back" +
                "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
                    //Create New Employees
                    createPerson();
                    break;
                case 2:
                    //View all Employees
                    break;
                case 3:
                    //Remove Employee
                case 4:
                    //Edit Employee
                    break;
                case 5:
                    //Go Back
                    manageEmployee();
                    break;
                case 6:
                    //Exit Program
                    System.exit(0);
                    break;
                default:
                    //Handle if an incorrect number is put in
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 6.");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException ime) {


        }
    }

    private void createPerson(int location) {


        //If location == 1, new Employee, if location == 2, new Visitor

        if (location == 1) {

            System.out.println("What is the employee's age?");
            int employeeAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name?");
            String employeeName = input.nextLine();
            System.out.println("What gender is the employee?");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("What is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("What is the employee number?");
            int employeeNumber = input.nextInt();
            System.out.println("What is the employee's job title?");
            String employeeJobTitle = input.nextLine();
            System.out.println("What is the employee's hire date?");
            String employeeHireDate = input.nextLine();

            Employee newEmployee = new Employee(employeeAge, employeeName, employeeGender, employeeRace, employeeNumber, employeeJobTitle, employeeHireDate);
        }
    }
}

