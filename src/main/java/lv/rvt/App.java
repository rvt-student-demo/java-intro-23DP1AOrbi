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

        reader.readLine(); // Title row - ignorējam pirmo rindu
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

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


