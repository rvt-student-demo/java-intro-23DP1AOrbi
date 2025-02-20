package lv.rvt.secondSem;

import java.util.*;
import java.util.ArrayList;

public class App {
    public static void main( String[] args ) throws Exception {


        System.out.print(ConsoleColors.RED_BOLD);

        System.out.println("Red color");
        System.out.print(ConsoleColors.BLUE_BACKGROUND_BRIGHT);
        System.out.println(
            ConsoleColors.RED_BACKGROUND + 
            "Still red?" 
            + ConsoleColors.RESET
        );

        for(int i = 0; i < 90; i++) {
            if (i <= 30) {
                System.out.print(
                ConsoleColors.GREEN_BACKGROUND + "  "
             + ConsoleColors.RESET);
             if (i == 30) {
                System.out.println();
             }
            } 
            // System.out.println();
            if (i >= 30 && i <= 60) {
                System.out.print(
                    ConsoleColors.WHITE_BACKGROUND + "  "
                 + ConsoleColors.RESET
                );  
                if (i == 60) {
                    System.out.println();
                }
            }
            // System.out.println();
            if (i > 60) {
                System.out.print(
                ConsoleColors.CYAN_BACKGROUND + "  "
             + ConsoleColors.RESET
            );
            }

            
        }
        
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
    