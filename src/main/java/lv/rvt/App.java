package lv.rvt;

import java.util.*;
import java.util.ArrayList;

import lv.rvt.secondSem.Box;

public class App {
    public static void main( String[] args ) throws Exception {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    } 
    public static void printPersons(ArrayList<Person> list) {
        for (Person person : list) {
            System.out.println(person);
            
        }
    }
        
        
        
        
                // Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
                // Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
                // System.out.println(ada);
                // System.out.println(esko);
                
                // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
                
                // int i = 0;
                // while (i < 25) {
                //   ollie.study();
                //   i = i + 1;
                // }
                // System.out.println(ollie);
                
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
        
    




