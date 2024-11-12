package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        PaymentCard Paul = new PaymentCard(20);
        PaymentCard Matt = new PaymentCard(30);

        Paul.eatHeartily();
        Matt.eatAffordably();
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);

        Paul.addMoney(20);
        Matt.eatHeartily();
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);

        Paul.eatAffordably();
        Paul.eatAffordably();
        Matt.addMoney(50);
        System.out.println("Paul: " + Paul);
        System.out.println("Matt: " + Matt);



        // PaymentCard card = new PaymentCard(10);
        // System.out.println("Paul: " + card);
        // card.addMoney(-15);
        // System.out.println("Paul: " + card);



        //////////////////////////

        // Scanner Scan = new Scanner(System.in);

        // Statistics stats = new Statistics();
        // Statistics even = new Statistics();
        // Statistics odd = new Statistics();
        
        // while (true) {
        //     int num = Integer.valueOf(Scan.nextLine());

        //     if (num == -1) {
        //         break;
        //     }

        //     if (num % 2 == 1) {
        //         odd.addNumber(num);
        //     }

        //     if (num % 2 == 0) {
        //         even.addNumber(num);
        //     }

        //     stats.addNumber(num);
        // }

        // System.out.println("Sum: " +(int)stats.sum());
        // System.out.println("Sum of even numbers: " + (int)even.sum());
        // System.out.println("Sum of odd numbers: " + (int)odd.sum());
  

        // Scanner Scan = new Scanner(System.in);
        // Statistics stats = new Statistics();

        // int num = Integer.valueOf(Scan.nextLine());

        // while (num != -1) {
        //     stats.addNumber(num);
        //     int num1 = Integer.valueOf(Scan.nextLine());
        //     num = num1;
        // }
        // System.out.println((int)stats.sum());



        
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


