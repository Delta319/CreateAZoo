package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends People {

    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private double hours;

    private List<Employee> employeeList = new ArrayList<Employee>();

    public Employee() {
    }

    public Employee(double age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDate) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void addEmployee(Employee newEmployee) {

        employeeList.add(newEmployee);
        System.out.println(newEmployee.getName() + "has been added");
    }
}
