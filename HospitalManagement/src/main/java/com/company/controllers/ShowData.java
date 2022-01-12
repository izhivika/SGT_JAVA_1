package com.company.controllers;

import com.company.dbhelper.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowData {

    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void allPatients() {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT PatientID, PatientName, PatientSurname, PatientAge " +
                    "FROM Patients");
            rs = ps.executeQuery();
            while (rs.next()) {
                int patientId = rs.getInt("PatientID");
                String patientName = rs.getString("PatientName");
                String patientSurname = rs.getString("PatientSurname");
                int patientAge = rs.getInt ("PatientAge");
                System.out.format("%s: %s %s, %s\n", patientId, patientName, patientSurname, patientAge);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void assignedPatients(int doctorId) {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT PatientID, PatientName, PatientSurname, PatientAge " +
                    "FROM Patients WHERE AssignedDoctorID=" + doctorId);
            rs = ps.executeQuery();
            while (rs.next()) {
                int patientId = rs.getInt("PatientID");
                String patientName = rs.getString("PatientName");
                String patientSurname = rs.getString("PatientSurname");
                int patientAge = rs.getInt ("PatientAge");
                System.out.format("%s: %s %s, %s\n", patientId, patientName, patientSurname, patientAge);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void doctors() {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT * FROM Doctors");
            rs = ps.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("DoctorID");
                String doctorName = rs.getString("DoctorName");
                String doctorSurname = rs.getString("DoctorSurname");
                System.out.format("%s: %s %s\n", id, doctorName, doctorSurname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void diagnosis() {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT * FROM Diagnosis");
            rs = ps.executeQuery();
            while (rs.next())
            {
                int diagnosisId = rs.getInt("DiagnosisID");
                String diagnosisName = rs.getString("DiagnosisName");
                System.out.format("%s: %s\n", diagnosisId, diagnosisName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void allDrugs() {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT DrugID, DrugName FROM Drugs");
            rs = ps.executeQuery();
            while (rs.next())
            {
                int drugId = rs.getInt("DrugID");
                String drugName = rs.getString("DrugName");
                System.out.format("%s: %s\n", drugId, drugName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void correspondingDrugs(int diagnosisId) {

        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT DrugID, DrugName FROM Drugs" +
                    " WHERE CorrespondingDiagnosisID=" + diagnosisId);
            rs = ps.executeQuery();
            while (rs.next())
            {
                int drugId = rs.getInt("DrugID");
                String drugName = rs.getString("DrugName");
                System.out.format("%s: %s\n", drugId, drugName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
