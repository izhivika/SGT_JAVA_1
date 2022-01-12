package com.company.objects;

import java.util.LinkedList;
import java.util.List;

public class Doctor {

    private int id;
    private String name, surname;

    public Doctor() {}

    public Doctor(int id, String name, String surname, List<Object> assignedPatients) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
