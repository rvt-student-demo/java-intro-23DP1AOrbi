package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

        // and -> &&
        // or -> ||
        // not -> !

        // ArrayList<String> nameList = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);

        // while (true) {
        //     String name = scanner.nextLine();
        //     if (name == "") {
        //         System.out.println(nameList.get(2));
        //         break;
        //     }
        //     nameList.add(name);
        // }

        // // Pievieno elementus
        // intList.add(1);
        // // Saņemt elementu
        // intList.get(0);
        // // Cik ir elementu masīvā?
        // intList.size();

        // Scanner scanner = new Scanner(System.in);

        // int userInput = Integer.valueOf(scanner.nextLine());

        // ArrayList<Integer> intList = new ArrayList<>();

        // for (int i = 0; i < intList.size(); i++) {
        //     System.out.println(
        //         intList.get(i)
        //     );
        // }

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intSum = new ArrayList<>();

        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                // System.out.println(sum);
                sum = 0;

                for (int i = 0; i < intSum.size(); i++){
                    sum += intSum.get(i);
                }
                // System.out.println(intSum.get(number));
                System.out.println(sum);
                break;
            }

            intSum.add(number);
            // sum += number;
        }



        
 
        







    }


    // public static void printStars(int num) {
    //     for (int i = 1; i <= num ; i++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // public static void printSquare(int size) {
    //     for (int i = 1 ; i <= size; i++) {
    //         printStars(size);
    //     }

    // }
    // public static void printRectangle(int width, int height) {
    //     for (int i = 1; i <= height; i++) {
    //         printStars(width);
    //     }
    // }
    // public static void printTriangle(int size) {
    //     for (int i = 1; i <= size ; i++) {
    //         printStars(i);
    //     }
    // }

    // public static void printSpaces(int number) {
    //     for (int i = 1; i <= number; i++) {
    //             System.out.print(" ");
    //     }
    // }

    // public static void printTriangleTwo(int size) {
    //     for (int i = 1; i <= size; i++) {
    //        printSpaces(size-i);
    //        printStars(i); 
    //     }
    //     System.out.println();
    // }

    // public static void christmasTree(int height) {
    //     for (int i = 1; i <= height; i++) {
    //         printSpaces(height-i);
    //         printStars(i+i-1);
    //     }

    //     for (int j = 1; j <= 2; j++) {
    //         printSpaces(height-2);
    //         printStars(3);
    //     }
    // }


    }


