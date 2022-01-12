package com.company.controllers;

import com.company.dbhelper.DBConnection;
import com.company.objects.Doctor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DoctorsController {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static Doctor getDoctorById() {

        Doctor doctor = new Doctor();

        System.out.print("Enter the id of the doctor: ");
        int id = scanner.nextInt();
        try {
            ps = DBConnection.getConnection().prepareStatement("SELECT * FROM Doctors WHERE DoctorID=" + id);
            rs = ps.executeQuery();

            String name, surname;

            while (rs.next()) {
                name = rs.getString("DoctorName");
                surname = rs.getString("DoctorSurname");
                doctor.setName(name);
                doctor.setSurname(surname);
                doctor.setId(id);
            }

            return doctor;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
