package lv.rvt;

import java.util.*;
import java.util.ArrayList;

import lv.rvt.secondSem.Box;

public class App {
    public static void main( String[] args ) throws Exception {
        
    // the usual:
    ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    juice.takeFromWarehouse(11.3);
    System.out.println(juice.getName()); // Juice
    juice.addToWarehouse(1.0);
    System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

    // etc

    // however, history() still doesn't work properly:
    System.out.println(juice.history()); // [1000.0]
    // so we only get the initial state of the history set by 

    //     ArrayList<Person> persons = new ArrayList<Person>();
    //     persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    //     persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    //     printPersons(persons);

    // } 
    // public static void printPersons(ArrayList<Person> list) {
    //     for (Person person : list) {
    //         System.out.println(person);
            
    //     }
    // }
        
        
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
    