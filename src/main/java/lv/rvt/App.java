package lv.rvt;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);

        // HealthStation childrensHospital = new HealthStation();

        // Person ethan = new Person("Ethan", 1, 110, 7);
        // Person peter = new Person("Peter", 33, 176, 85);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(peter);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);

        // System.out.println("weighings performed: " + childrensHospital.weighings());


        // Scanner scan = new Scanner(System.in);
        // boolean isProgramRunning = true;
        // System.out.println("Welcome to person manager, type \"help\" to see available commands.");


        // while (isProgramRunning) {
        //     String command = scan.nextLine();
        //     if (command.equals("exit")) {
        //         isProgramRunning = false;
        //     }
        //     else if (command.equals("show")) {
        //         System.out.println();
        //         ArrayList<Person> persons = PersonManager.getPersonList();

        //         String name = "Name";
        //         String age = "Age";
        //         String weight = "Weigth";
        //         String height = "Height";
        //         String bmi = "Body mass index";

        //         System.out.printf("%-20s| ", name);
        //         System.out.printf("%-5s| ", age);
        //         System.out.printf("%-7s| ", weight);
        //         System.out.printf("%-7s| ", height);
        //         System.out.printf("%-15s |", bmi);
        //         System.out.println();
        //         for (Person person : persons) {
        //             System.out.println("----------------------------------------------------------------");
        //             System.out.printf("%-20s| ", person.getName());
        //             System.out.printf("%-5d| ", person.getAge());
        //             System.out.printf("%-7d| ", person.getWeight());
        //             System.out.printf("%-7d| ", person.getHeight());
        //             System.out.printf("%-16.2f| ", person.bodyMassIndex());
        //             System.out.println();
        //         }   
        //     }
        //     else if (command.equals("add")) {
        //         System.out.println("Please enter name: ");
        //         String name = scan.nextLine();

        //         System.out.println("Please enter age: ");
        //         int age = Integer.valueOf(scan.nextLine());

        //         System.out.println("Please enter weight:");
        //         int weight = Integer.valueOf(scan.nextLine());

        //         System.out.println("Please enter height:");
        //         int height = Integer.valueOf(scan.nextLine());

        //         Person pers = new Person(name, age, weight, height);
        //         PersonManager.addPerson(pers);
        //         System.out.println("Person is added");
        //     }
        //     else if (command.equals("help")) {
        //         System.out.println("show - show person list");
        //         System.out.println("add - add person to persons.csv file");
        //         System.out.println("help - show what commands do");
        //         System.out.println("exit - exit program");
        //     }
        //     System.out.println();
        //     System.out.println("Your command was " + command);
        // }
        // System.out.println("thanks, bye bye!");

        
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




