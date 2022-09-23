package org.helpallyson;

import java.util.Scanner;

public class Shipping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of package in pounds: ");
        double weight = input.nextDouble();
        double cost = 0;
        if (weight < 0) {
            System.out.print("Weight must be greater than zero.");
        } else if (weight > 25) {
            System.out.print("Cannot ship - maximum weight is 25 pounds.");
        } else {
            if (weight <= 2) {
                cost = 3.5;
            } else if (weight <= 7) {
                cost = 5.9;
            } else if (weight <= 16) {
                cost = 10.85;
            } else if (weight <= 25) {
                cost = 12.35;
            }
        }
    }
}
