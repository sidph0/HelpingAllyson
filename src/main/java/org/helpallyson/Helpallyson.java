package org.helpallyson;

import java.util.Scanner;

public class Helpallyson {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight of the package
        System.out.print("Enter weight: ");
        double weight = input.nextDouble();

        // Calculate cost of shipping
        if (weight < 0) {
            System.out.print("gotta be more than 0");
        } else if (weight > 25)
            System.out.println("Too heavy, be below 25 ");
        else {
            //setting cost depending on weight
            double cost = 0;
            if (weight <= 2)
                cost = 3.5;
            else if (weight <= 7)
                cost = 5.9;
            else if (weight <= 16)
                cost = 10.85;
            else if (weight <= 25)
                cost = 12.35;
            //print the cost
            System.out.println("Shipping cost of package is $" +
                    cost * weight);
        }
    }
}


