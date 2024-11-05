package lv.rvt;

import java.applet.Applet;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();


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


