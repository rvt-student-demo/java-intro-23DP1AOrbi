package lv.rvt;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, choose a command");
        System.out.println("show - shows all persons");
        System.out.println("add - add a person");
        System.out.println("exit - ends program");
        System.out.println("help - see avaiable commands");


        while (true) {
            

            String command = scan.nextLine();

            if (command.equals("exit")) {
                break;
            }
            
            else if (command.equals("show")) {
                ArrayList<Person> persons = PersonManager.getPersonList();
                for (Person person : persons) {
                    System.out.println(person);
                }
            }
            else if (command.equals("add")) {
                System.out.println("Please enter name: ");
                String name = scan.nextLine();

                System.out.println("Please enter age: ");
                int age = Integer.valueOf(scan.nextLine());

                System.out.println("Please enter weight: ");
                int weight = Integer.valueOf(scan.nextLine());

                System.out.println("Please enter height: ");
                int height = Integer.valueOf(scan.nextLine());

                Person pers = new Person(name, age, weight, height);
                PersonManager.addPerson(pers);
                // break;
            }
            else if (command.equals("help")) {
                System.out.println("Hello, choose a command");
                System.out.println("show - shows all persons");
                System.out.println("add - add a person");
                System.out.println("exit - ends program");
                System.out.println("help - see avaiable commands");
            }
        }

        System.out.println("Buh bye");


        
        
        // izvada csv failu
        // ArrayList<Person> persons = PersonManager.getPersonList();

        // for (Person person : persons) {
        //     System.out.println(person);
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




