package com.company;

import java.util.List;

public class Company {
    // Define the attributes of the Company
    private List<Employee> employees;
    private String companyName;

    // Define the constructor
    public Company(List<Employee> employees, String companyName) {
        this.employees = employees;
        this.companyName = companyName;
    }

    // Define the getters and setters
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Get the average age for a company
    public float average() {
        float sum = 0;
        // Use a loop to add the values of the employees array together
        for (Employee employee : this.employees) {
            sum += employee.getAge();
        }
        return sum / this.employees.size();
    }
/*
    // Get random employee.
    public Employee getEmployee() {
        int random = (int) (Math.random() * 10);
        if (random >= this.employees.size()) {
            return getEmployee(); // keep calling the array until a value is less than the
            // length of the employees array is achieved
        }
        else return this.employees[random]; // return the employee
    }*/
}
