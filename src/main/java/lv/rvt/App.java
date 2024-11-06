package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        // System.out.println(1%2);

        Scanner Scan = new Scanner(System.in);

        Statistics stats = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        while (true) {
            int num = Integer.valueOf(Scan.nextLine());

            if (num == -1) {
                break;
            }

            if (num % 2 == 1) {
                odd.addNumber(num);
            }

            if (num % 2 == 0) {
                even.addNumber(num);
            }

            stats.addNumber(num);
        }

        System.out.println("Sum: " +(int)stats.sum());
        System.out.println("Sum of even numbers: " + (int)even.sum());
        System.out.println("Sum of odd numbers: " + (int)odd.sum());
  

        // Scanner Scan = new Scanner(System.in);
        // Statistics stats = new Statistics();

        // int num = Integer.valueOf(Scan.nextLine());

        // while (num != -1) {
        //     stats.addNumber(num);
        //     int num1 = Integer.valueOf(Scan.nextLine());
        //     num = num1;
        // }
        // System.out.println((int)stats.sum());



        // Statistics statistics = new Statistics();
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());
    


        // Agent bond =  new Agent("James", "Bond");

        // bond.toString(); // prints nothing
        // System.out.println(bond);

        // Agent ionic = new Agent("Ionic", "Bond");
        // System.out.println(ionic);


        // Person per1 = new Person("Anthony");
        // per1.setHeight(165);
        // per1.setWeight(65);

        // System.out.println(per1.bodyMassIndex());



        
        ///////////////////////

        // and -> &&
        // or -> ||
        // not -> !

        // // Pievieno elementus
        // intList.add(1);
        // // Saņemt elementu
        // intList.get(0);
        // // Cik ir elementu masīvā?
        // intList.size();

        // masivs.length()
        // // cik elementu masīvā? (priekš parasta masīva)

        }

    }


