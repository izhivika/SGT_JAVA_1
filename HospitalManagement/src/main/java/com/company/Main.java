package com.company;

import com.company.controllers.PatientsController;
import com.company.menu.Menu;
import com.company.objects.Patient;

public class Main {
    public static void main(String[] args) {

/*        Patient patient = PatientsController.getPatientById();
        System.out.println("Name: " + patient.getName());
        System.out.println("Surname: " + patient.getSurname());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Diagnosis: " + patient.getDiagnosisId() + ": " + patient.getDiagnosisName());
        System.out.println("Assigned doctor: " + patient.getDoctorId()
                + ": " + patient.getDoctorName() + " " + patient.getDoctorSurname());
        System.out.println("Assigned drug: " + patient.getDrugId() + ": " + patient.getDrugName());*/

        //System.out.println(PatientsController.addNewPatient() ? "Patient added successfully" :
                //"Could not add a new patient");

        Menu.menu();

    }
}
