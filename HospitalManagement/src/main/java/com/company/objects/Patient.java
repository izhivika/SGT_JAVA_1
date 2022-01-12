package com.company.objects;

public class Patient {

    private int id, age, diagnosisId, doctorId, drugId;
    private String name, surname, diagnosisName, doctorName, doctorSurname, drugName;

    public Patient() {}

    public Patient(int id, String name, String surname, int age, int diagnosisId, int doctorId, int drugId,
                   String diagnosisName, String doctorName, String doctorSurname, String drugName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.diagnosisId = diagnosisId;
        this.doctorId = doctorId;
        this.drugId = drugId;
        this.diagnosisName = diagnosisName;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.drugName = drugName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(int diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
}
