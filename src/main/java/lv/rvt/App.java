package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Agent bond =  new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);



        // Animal animal1 = new Animal("cat");
        // Animal animal2 = new Animal("dog");

        // System.out.println(
        //     animal1
        // );
        // System.out.println(
        //     animal2
        // );



        /////////

        // Person per1 = new Person("John");
        // per1.printPerson();

        // per1.growOlder();
        // per1.growOlder();
        // per1.growOlder();

        // per1.printPerson();

        // for (int i = 0; i < 35 ; i++) {
        //     per1.growOlder();
        // }

        // per1.printPerson();


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


