package com.company.controllers;

import com.company.dbhelper.DBConnection;
import com.company.objects.Patient;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PatientsController {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static Patient getPatientById() {

        System.out.print("Enter the id of the patient: ");
        int id = scanner.nextInt();

        int patientId, age, diagnosisId, doctorId, drugId;
        String name, surname, diagnosisName, doctorName, doctorSurname, drugName;

        Patient patient = new Patient();

        try {

            ps = DBConnection.getConnection().prepareStatement("SELECT * FROM Patients WHERE PatientID=" + id);
            rs = ps.executeQuery();

            while (rs.next()) {
                patientId = rs.getInt("PatientID");
                name = rs.getString("PatientName");
                surname = rs.getString("PatientSurname");
                age = rs.getInt("PatientAge");
                diagnosisId = rs.getInt("PatientDiagnosisID");
                doctorId = rs.getInt("AssignedDoctorID");
                drugId = rs.getInt("AssignedDrugID");
                patient.setId(patientId);
                patient.setName(name);
                patient.setSurname(surname);
                patient.setAge(age);
                patient.setDiagnosisId(diagnosisId);
                patient.setDoctorId(doctorId);
                patient.setDrugId(drugId);

                ps = DBConnection.getConnection().prepareStatement("SELECT DiagnosisName FROM Diagnosis " +
                        "WHERE DiagnosisID=" + diagnosisId);
                rs = ps.executeQuery();

                while (rs.next()) {
                    diagnosisName = rs.getString("DiagnosisName");
                    patient.setDiagnosisName(diagnosisName);
                }

                ps = DBConnection.getConnection().prepareStatement("SELECT * FROM Doctors " +
                        "WHERE DoctorID=" + doctorId);
                rs = ps.executeQuery();

                while (rs.next()) {
                    doctorName = rs.getString("DoctorName");
                    doctorSurname = rs.getString("DoctorSurname");
                    patient.setDoctorName(doctorName);
                    patient.setDoctorSurname(doctorSurname);
                }

                ps = DBConnection.getConnection().prepareStatement("SELECT DrugName FROM Drugs " +
                        "WHERE DrugID=" + drugId);
                rs = ps.executeQuery();

                while (rs.next()) {
                    drugName = rs.getString("DrugName");
                    patient.setDrugName(drugName);
                }

            }
            return patient;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

        public static boolean addNewPatient() {

            System.out.print("Name: ");
            String patientName = scanner.next();

            System.out.print("Surname: ");
            String patientSurname = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            ShowData.diagnosis();

            System.out.print("Diagnosis' id: ");
            int diagnosisId = scanner.nextInt();

            ShowData.doctors();

            System.out.print("Assigned doctor's id: ");
            int doctorId = scanner.nextInt();

            ShowData.correspondingDrugs(diagnosisId);

            System.out.print("Assigned drug's id: ");
            int drugId = scanner.nextInt();

            try {
                ps = DBConnection.getConnection().prepareStatement("INSERT INTO" +
                        " Patients(PatientName, PatientSurname, PatientAge," +
                        " PatientDiagnosisID, AssignedDoctorID, AssignedDrugID)" +
                        " VALUES('" + patientName + "', '" + patientSurname + "', " + age + ", " +
                        diagnosisId + ", " + doctorId + ", " + drugId + ")");
                ps.execute();
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }

        public static boolean deletePatient() {
            System.out.print("Enter the patient's id: ");
            int id = scanner.nextInt();

            try {
                ps = DBConnection.getConnection().prepareStatement("DELETE FROM Patients " +
                        "WHERE PatientID=" + id);
                ps.execute();
                System.out.println("Patient successfully deleted from the database");
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

        }

        public static void editPatient() {
            System.out.print("Enter the patient's id: ");
            int id = scanner.nextInt();

            System.out.println("Enter 0 if no need to edit");
            System.out.print("Name: ");
            String name = scanner.next();
            if (!"0".equals(name.trim())) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "PatientName='" + name + "' WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("Surname: ");
            String surname = scanner.next();
            if (!"0".equals(surname.trim())) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "PatientSurname='" + surname + "' WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("Age: ");
            int age = scanner.nextInt();
            if (age != 0) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "Age=" + age + " WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("Diagnosis id: ");
            int diagnosisId = scanner.nextInt();
            if (diagnosisId != 0) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "PatientDiagnosisID=" + diagnosisId + " WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("Assigned doctor's id: ");
            int doctorId = scanner.nextInt();
            if (doctorId != 0) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "AssignedDoctorID=" + doctorId + " WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("Assigned drug's id: ");
            int drugId = scanner.nextInt();
            if (drugId != 0) {
                try {
                    ps = DBConnection.getConnection().prepareStatement("UPDATE Patients SET " +
                            "AssignedDrugID=" + drugId + " WHERE PatientID=" + id);
                    ps.execute();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

}
