package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        BufferedReader reader = Helper.getReader("persons.csv");

        // String line = reader.readLine() ;
        String line;
        int ageSum = 0;
        int ageCount = 0;

        reader.readLine(); // Title row - ignorējam pirmo rindu
        while ((line = reader.readLine()) != null) {
            // System.out.println(line);

            String[] parts = line.split(", ");

            System.out.println("Name: " + parts[0] + ", age: " + parts[1] + ", weight: " + parts[2] + ", height: " + parts[3]);
            ageSum += Integer.valueOf(parts[1]);
            ageCount++;
        }
        System.out.println("Average age: " + (double) ageSum/ageCount);

        //////////////////////////

        /// comma seperated values

        // and -> &&/workspaces/java-intro-23DP1AOrbi/src/data
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


