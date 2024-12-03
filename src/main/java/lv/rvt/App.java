package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        ArrayList<Person> persons = PersonManager.getPersonList();

        for (Person person : persons) {
            System.out.println(person);
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


