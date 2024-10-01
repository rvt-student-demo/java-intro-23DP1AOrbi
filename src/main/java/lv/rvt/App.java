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

        // int numNumbers = 0;
        // int sum = 0;

        // while (true) {
        //     System.out.println("Give a number:");
        //     int number = Integer.valueOf(scanner.nextLine());

        //     if (number == 0) {
        //         break;
        //     }
        //     numNumbers += 1;
        //     sum = number + sum;    
        // }
        // System.out.println("Number of numbers: " + numNumbers);
        // System.out.println("Sum of the numbers: " + sum);

        // int number = Integer.valueOf(scanner.nextLine());

        // for (int i = number; i <= 100; i++) {
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Last number?");
        // int number = Integer.valueOf(scanner.nextLine());
        // int sum = 0; 

        // for (int i = 1; i < number + 1; i++) {
        //     sum += i;
        // }
        // System.out.println("The sum is " + sum);


        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give numbers:");
        // int sum = 0;
        // int i = 0;
        // int odd = 0;

        // while (true) {
        //     int number = Integer.valueOf(scanner.nextLine());
            
        //     if (number == -1) {
        //         break;
        //     }

        //     if (number % 2 == 1) {
        //         odd++;
        //     }

        //     sum += number;
        //     i++;
        // }
        
        // System.out.println("Thx! Bye!");
        // System.out.println("Sum: " + sum);
        // System.out.println("Numbers: " + i);
        // System.out.println("Average: " + ( (double) sum/i));
        // System.out.println("Even: " + (i-odd));
        // System.out.println("Odd: " + odd);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");

        int sk = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0 ; i < sk ; i++ ) {
            printText();
        }
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }



}
