package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    

    //    // Once Upon a Time
    //    System.out.println("Once upon a time");
    //    System.out.println("there was");
    //    System.out.println("a program");

        //Input uzdevums
    
        // Scanner scanner = new Scanner(System.in);

        // // Saņēmām vērtīb kā string vērtību
        // String input = scanner.nextLine();

        // // Veidojam int datu tip un konvertējam input uz in datu tipu 
        // int inputAsInt = Integer.valueOf(input);

        // System.out.println(inputAsInt * 10);

        // Scanner scanner = new Scanner(System.in);

        // // Saņēmām vērtīb kā string vērtību
        // String cipars1 = scanner.nextLine();

        // // Veidojam int datu tip un konvertējam input uz in datu tipu 
        // int skaitlis1 = Integer.valueOf(cipars1);

        // // option 2 
        // int skaitlis2 = Integer.valueOf(scanner.nextLine());

        // System.out.println(skaitlis1 * skaitlis2);

        // Scanner scanner = new Scanner(System.in);

        // int cipars1 = Integer.valueOf(scanner.nextLine());
        // int cipars2 = Integer.valueOf(scanner.nextLine());
        // int cipars3 = Integer.valueOf(scanner.nextLine());

        // System.out.println(cipars1 + cipars2 + cipars3);
        // System.out.println(cipars1 * cipars2 * cipars3);
        // System.out.println((cipars1 + cipars2 + cipars3)/3.0);

        // // x++ == x = x + 1

        // and -> &&
        // or -> ||
        // not -> !

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give the first number:");
        // int number1 = Integer.valueOf(scanner.nextLine());

        // System.out.println("Give the second number:");
        // int number2 = Integer.valueOf(scanner.nextLine());

        // if (number1 > number2) {
        //     System.out.println("Greater number is: " + number1);   
        // }
        
        // else if (number1 == number2) {
        //     System.out.println("The numbers are equal!");
        // }

        // else {
        //     System.out.println("Greater number is: " + number2);
        // }
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            System.out.println("Grade: impossible!");
        }
        else if ( 0 <= number  && number <= 49) {
            System.out.println("Grade: failed");
        }
        else if (number >= 50 && number <= 59) {
            System.out.println("Grade: 1");
        }
        else if (number >= 60 && number <= 69) {
            System.out.println("Grade: 2");
        }
        else if (number >= 70 && number <= 79) {
            System.out.println("Grade: 3");
        }
        else if (number >= 80 && number <= 89) {
            System.out.println("Grade: 4");
        }
        else if (number >= 90 && number <= 100) {
            System.out.println("Grade: 5");
        }
        else if (number > 100) {
            System.out.println("Grade: incredible!");  
        }

    }



}
