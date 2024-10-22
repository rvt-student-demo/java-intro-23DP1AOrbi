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

        // // Pievieno elementus
        // intList.add(1);
        // // Saņemt elementu
        // intList.get(0);
        // // Cik ir elementu masīvā?
        // intList.size();



        // Scanner scan = new Scanner(System.in);
        // ArrayList<Integer> intNum = new ArrayList<>();

        // while (true) {
        //     int number = Integer.valueOf(scan.nextLine());
        //     if (number == -1) {
        //         break;
        //     }
        //     intNum.add(number);
        // }

        // System.out.print("From where? ");
        // int begin = Integer.valueOf(scan.nextLine());

        // while (begin >= intNum.size() || begin < 0) {
        //     System.out.println("Index needs to be within range");
        //     int start = Integer.valueOf(scan.nextLine());
        //     begin = start;
        // }

        // System.out.print("To where? ");
        // int end = Integer.valueOf(scan.nextLine());
        
        // while (end >= intNum.size() || begin < 0) {
        //     System.out.println("Index needs to be within range");
        //     int fin = Integer.valueOf(scan.nextLine());
        //     end = fin;
        // }
        // System.out.println();

        // for (int i = begin ; i <= end ; i++) {
        //         System.out.println(intNum.get(i));
        //     }

        
        ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(3);
            numbers.add(2);
            numbers.add(6);
            numbers.add(-1);
            numbers.add(5);
            numbers.add(1);

            System.out.println("The numbers in the range [0, 5]");
            printNumbersInRange(numbers, 0, 5);

            System.out.println("The numbers in the range [3, 10]");
            printNumbersInRange(numbers, 3, 10);
        

        }

        public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

            for (int x : numbers) {
                if (x >= lowerLimit && x <= upperLimit) {
                    System.out.println(x);
                }
            }
        }

    }


