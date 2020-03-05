package com.company;

public class VeterinaryReport {
    public int dogs;
    public int cats;

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
