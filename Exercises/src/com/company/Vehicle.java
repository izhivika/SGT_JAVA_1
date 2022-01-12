package com.company;

public class Vehicle {

    private int lengthOfVehicle;
    private int numberOfSeats;
    private int noOfTires;
    private String nameOfVehicle;
    private int currentSpeed;

    public void speedUp() {
        this.currentSpeed += 5;
    }

    public void slowDown() {
        this.currentSpeed -= 5;
    }

    public void startEngine() {
        System.out.println("Started Engine");
    }

    public void stopEngine() {
        this.currentSpeed = 0;
        System.out.println("Stopped Engine");
    }

    public int getLengthOfVehicle() {
        return lengthOfVehicle;
    }

    public void setLengthOfVehicle(int lengthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
