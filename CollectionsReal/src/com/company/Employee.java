package com.company;

public class Employee extends Person {
    // Define the attributes of an employee
    private String companyId;
    private String companyName;

    public Employee() {};
    // Define the constructor
    public Employee(String name, int age, String companyId, String companyName) {
        super(name, age);
        this.companyId = companyId;
        this.companyName = companyName;
    }
    // Define getters and setters
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
