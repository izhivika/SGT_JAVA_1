package com.company.menu;

import com.company.controllers.DoctorsController;
import com.company.controllers.PatientsController;
import com.company.controllers.ShowData;
import com.company.objects.Doctor;
import com.company.objects.Patient;

import java.util.Scanner;

public class Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Get a patient's details by id");
        System.out.println("2: Add a new patient");
        System.out.println("3: Edit a patient's details");
        System.out.println("4: Delete a patient");
        System.out.println("5: Get doctor's details by id");
        System.out.println("6: Show all patients");
        System.out.println("7: Show all doctors");
        System.out.println("8: Show the list of diagnosis");
        System.out.println("9: Show the list of drugs");
        System.out.println("10: Exit");

        System.out.print("Select an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                Patient patient = PatientsController.getPatientById();
                System.out.println("Name: " + patient.getName());
                System.out.println("Surname: " + patient.getSurname());
                System.out.println("Age: " + patient.getAge());
                System.out.println("Diagnosis: " + patient.getDiagnosisId() + ": " + patient.getDiagnosisName());
                System.out.println("Assigned doctor: " + patient.getDoctorId()
                        + ": " + patient.getDoctorName() + " " + patient.getDoctorSurname());
                System.out.println("Assigned drug: " + patient.getDrugId() + ": " + patient.getDrugName());
                menu();
                break;
            case 2:
                PatientsController.addNewPatient();
                menu();
                break;
            case 3:
                PatientsController.editPatient();
                menu();
                break;
            case 4:
                PatientsController.deletePatient();
                menu();
                break;
            case 5:
                Doctor doctor = DoctorsController.getDoctorById();
                System.out.println(doctor.getName() + " " + doctor.getSurname());
                ShowData.assignedPatients(doctor.getId());
                menu();
                break;
            case 6:
                ShowData.allPatients();
                menu();
                break;
            case 7:
                ShowData.doctors();
                menu();
                break;
            case 8:
                ShowData.diagnosis();
                menu();
                break;
            case 9:
                ShowData.allDrugs();
                menu();
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Try again.");
                menu();
                break;
        }

    }

}
