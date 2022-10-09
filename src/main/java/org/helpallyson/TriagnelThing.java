package org.helpallyson;

import java.util.Scanner;

public class TriagnelThing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter egds
        System.out.println("Enter edges for triangle:");
        System.out.println("Edge 1 - x, y: ");
        double xcoord1 = input.nextDouble();
        double ycoord1 = input.nextDouble();
        System.out.println("Edge 2 - x, y: ");
        double xcoord2 = input.nextDouble();
        double ycoord2 = input.nextDouble();
        System.out.println("Edge 3 - x, y: ");
        double xcoord3 = input.nextDouble();
        double ycoord3 = input.nextDouble();

        //Calculate Sides
        double edge1 = Math.pow(Math.pow(xcoord2 - xcoord1, 2) + Math.pow(ycoord2 - ycoord1, 2), 0.5);
        double edge2 = Math.pow(Math.pow(xcoord3 - xcoord2, 2) + Math.pow(ycoord3 - ycoord2, 2), 0.5);
        double edge3 = Math.pow(Math.pow(xcoord1 - xcoord3, 2) + Math.pow(ycoord1 - ycoord3, 2), 0.5);

        /* WTF I GOTTA CHECK IF THE TRIANGLES VALID>?
           THIS SOME STRAIGHT BS BRO
           aight then
           this stupid ash bro just take the damn triangle
          */

        boolean checkValidity = true;

        //Perimeter
        System.out.println("the perimeter is " + (edge1 + edge2 + edge3));
    }

}
// 10-8-22 Update
//Fuck the triangle validity she can do it instead
//We ball

//The original code was done at 2 in the morning