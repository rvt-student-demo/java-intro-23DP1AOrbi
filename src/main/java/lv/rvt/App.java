package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);



        // BufferedReader reader = Utils.getReader("persons.csv");
        // String line;
        // double sum = 0;

        // ArrayList<Person> pers = new ArrayList<>();
        // reader.readLine();

        // while ((line = reader.readLine()) != null) {
        //     String[] parts = line.split(", ");

        //     Person pers1 = new Person(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),Integer.valueOf(parts[3]));
        //     pers.add(pers1);
        // }
        // reader.close();
        // for (Person person : pers) {
        //     sum += person.returnAge();
        //     System.out.println(person); 
        // }
        // System.out.println();
        // System.out.println("Vidējais personu vecums: " + sum/pers.size());


        //////////////////////////

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


