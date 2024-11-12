package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {


        BufferedReader reader = Utils.getReader("persons.csv");
        String line;
        double sum = 0;

        ArrayList<Person> pers = new ArrayList<>();
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            Person pers1 = new Person(parts[0],Integer.valueOf(parts[1]),Integer.valueOf(parts[2]),Integer.valueOf(parts[3]));
            pers.add(pers1);
        }
        reader.close();
        for (Person person : pers) {
            sum += person.returnAge();
            System.out.println(person); 
        }
        System.out.println();
        System.out.println("Vidējais personu vecums: " + sum/pers.size());


        // BufferedReader reader = Utils.getReader("data.csv");
        // String line;
        // reader.readLine();

        // while ((line = reader.readLine()) != null) {

        //     String[] parts = line.split(", ");
        //     String indx = parts[0];
        //     String user = parts[1];
        //     String pswrd = parts[2];

        //     System.out.println("Id: "+ indx +"; Username: " + user + "; Password: " + pswrd);

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


