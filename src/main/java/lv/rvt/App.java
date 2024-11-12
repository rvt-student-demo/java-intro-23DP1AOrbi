package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args ) throws Exception {


        BufferedReader reader = Utils.getReader("data.csv");
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        
        //////////////////////////
  
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


