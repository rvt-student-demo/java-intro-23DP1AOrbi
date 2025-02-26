package lv.rvt.secondSem;

import java.util.*;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) throws Exception {



        // Money a = new Money(10,0);
        // Money b = new Money(5,0);

        // Money c = a.plus(b);

        // System.out.println(a);  // 10.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e

        // a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        // //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        // System.out.println(a);  // 25.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e

        // Money a = new Money(10, 0);
        // Money b = new Money(3, 0);
        // Money c = new Money(5, 0);

        // System.out.println(a.lessThan(b));  // false
        // System.out.println(b.lessThan(c));  // true


        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e




        /////////////////

        // System.out.print(ConsoleColors.RED_BOLD);

        // System.out.println("Red color");
        // System.out.print(ConsoleColors.BLUE_BACKGROUND_BRIGHT);
        // System.out.println(
        //     ConsoleColors.RED_BACKGROUND + 
        //     "Still red?" 
        //     + ConsoleColors.RESET
        // );

        // for(int i = 0; i < 90; i++) {
        //     if (i <= 30) {
        //         System.out.print(
        //         ConsoleColors.GREEN_BACKGROUND + "  "
        //      + ConsoleColors.RESET);
        //      if (i == 30) {
        //         System.out.println();
        //      }
        //     } 
        //     // System.out.println();
        //     if (i >= 30 && i <= 60) {
        //         System.out.print(
        //             ConsoleColors.WHITE_BACKGROUND + "  "
        //          + ConsoleColors.RESET
        //         );  
        //         if (i == 60) {
        //             System.out.println();
        //         }
        //     }
        //     // System.out.println();
        //     if (i > 60) {
        //         System.out.print(
        //         ConsoleColors.CYAN_BACKGROUND + "  "
        //      + ConsoleColors.RESET
        //     );
        //     }

            
        // }
        
        // Boxx box = new Boxx(10);

        // box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        // box.add(new Book("Robert Martin", "Clean Code", 1));
        // box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        // box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        // box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        // box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        // System.out.println(box);
        
        // ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        // juice.takeFromWarehouse(11.3);
        // juice.addToWarehouse(1.0);
        // //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        // juice.printAnalysis();
        
        
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
    