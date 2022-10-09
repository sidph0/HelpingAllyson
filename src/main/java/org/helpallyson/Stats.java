package org.helpallyson;

import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        int x, price = 0;
        //Make price variable
        double average, standardeviation;
        //double for avg and standard because the answer would prob be in decimals yk
        double totalsum = 0, totalsquaredsum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Enter in $ thanks");
        System.out.println("=====================================");
        System.out.println("Enter first price (no decimals thanks) or -1 to quit: ");
        x = scanner.nextInt();
        while (x != -1) {
            price += 1;
            //Help calc total Items
            totalsum += x;
            //no shit
            totalsquaredsum += x * x;
            //Square sum
            System.out.println("Enter another price, or -1 to quit: ");
            x = scanner.nextInt();
        }
        if (price == 0)
            System.out.println("No data added so cant calculate");
        //if you only put 0 and then -1 to calculate we print this
        else if (price == 1) {
            System.out.println("Avg price is $" + totalsum);
            System.out.println("Cant calc standard deviation");
            System.out.println("Have to add more than one item or standard deviation is impossible");
        } else {
            average = totalsum / price;
            double mathgaming = (price * totalsquaredsum - totalsum * totalsum) / (price * price); //Math gaming 🗿
            standardeviation = Math.sqrt(mathgaming); //Square root of everything
            System.out.println("Number of items: " + price);
            //print total items calculated
            System.out.println("Average price is $" + average);
            //oh boy what does this do
            System.out.println("Standard deviation for total price is $" + standardeviation);
            //youll never believe what this does
        }
    }
}
