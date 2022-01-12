package com.company;

public class Company {

    // Add attributes
    private Employee[] employees;
    private String companyName;

    // Add constructor
    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    // Add getters and setters
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
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
        for (int i = 0; i < this.employees.length; i++) {
            sum += this.employees[i].getAge();
        }
        return sum / this.employees.length;
    }

    // Get random employee.
    public Employee getEmployee() {
        int random = (int) (Math.random() * 10);
        if (random >= this.employees.length) {
            return getEmployee(); // keep calling the array until a value is less than the
            // length of the employees array is achieved
        }
        else return this.employees[random]; // return the employee
    }
}
