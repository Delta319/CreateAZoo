package com.company.people;

public class Employee extends People {
    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private double hours;
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
}
