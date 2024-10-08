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

        // //////////////////

    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("How many times?");

    //     int sk = Integer.valueOf(scanner.nextLine());
        
    //     for (int i = 0 ; i < sk ; i++ ) {
    //         printText();
    //     }
    // }
    // public static void printText() {
    //     System.out.println("In a hole in the ground there lived a method");
    // }

    ///////////////////
    // Scanner scanner = new Scanner(System.in);

    // int sak = Integer.valueOf(scanner.nextLine());
    // int beig = Integer.valueOf(scanner.nextLine());

    //    divisibleByThreeInRange(sak ,  beig);
    // }

    // public static void divisibleByThreeInRange(int beginning, int end) {
    //     for (int i = beginning ;  i <= end ; i++) {
    //         if (i % 3 == 0) {
    //             System.out.println(i);
    //         }
    //     }
    // }
    

    printStars(5);
    printStars(3);
    printStars(9);

    System.out.println();

    printSquare(4);

    System.out.println();

    printRectangle(17, 3);

    System.out.println();

    printTriangle(4);

    }

    public static void printStars(int num) {
        for (int i = 1; i <= num ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 1 ; i <= size; i++) {
            printStars(size);
        }

    }
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size ; i++) {
            printStars(i);
        }
    }

}
