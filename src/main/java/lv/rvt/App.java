package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        // // x++ == x = x + 1

        // and -> &&
        // or -> ||
        // not -> !

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give points [0-100]:");
        // int number = Integer.valueOf(scanner.nextLine());

        // if (number < 0) {
        //     System.out.println("Grade: impossible!");
        // }
        // else if ( 0 <= number  && number <= 49) {
        //     System.out.println("Grade: failed");
        // }
        // else if (number >= 50 && number <= 59) {
        //     System.out.println("Grade: 1");
        // }
        // else if (number >= 60 && number <= 69) {
        //     System.out.println("Grade: 2");
        // }
        // else if (number >= 70 && number <= 79) {
        //     System.out.println("Grade: 3");
        // }
        // else if (number >= 80 && number <= 89) {
        //     System.out.println("Grade: 4");
        // }
        // else if (number >= 90 && number <= 100) {
        //     System.out.println("Grade: 5");
        // }
        // else if (number > 100) {
        //     System.out.println("Grade: incredible!");  
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Value of the gift?");
        // int number = Integer.valueOf(scanner.nextLine());

        // if (number < 5000) {
        //     System.out.println("No tax!");
        // }
        // else if (number >= 5000 && number <= 25000) {
        //     System.out.println("Tax: " + (100 + (number - 5000) * 0.08));
        // }
        // else if (number >= 25000 && number <= 55000) {
        //     System.out.println("Tax: " + (1700 + (number - 25000) * 0.10));
        // }
        // else if (number >= 55000 && number <= 200000) {
        //     System.out.println("Tax: " + (4700 + (number - 55000) * 0.12));
        // }
        // else if (number >= 200000 && number <= 1000000) {
        //     System.out.println("Tax: " + (22100 + (number - 200000) * 0.15));
        // }
        // else if (number > 1000000) {
        //     System.out.println("Tax: " + (142100 + (number - 1000000) * 0.17));  
        // }
        Scanner scanner = new Scanner(System.in);

        int numNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            numNumbers += 1;
            sum = number + sum;    
        }
        System.out.println("Number of numbers: " + numNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }



}
