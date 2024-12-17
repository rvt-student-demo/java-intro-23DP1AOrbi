package lv.rvt;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        // primitivr datu tipu īpašības
        int x = 5;
        int y = x;
        int c = x;

        int value; 

        // Reference datu tipi

        Person pers1 = new Person("John");

        Person pers2 = pers1; // paņem pers1 adresi
        Person pers3 = pers2; // visi adresējās uz pers1 adresi

        pers1.setName("Harry"); // vārds nomainās visiesm jo visi attiecas uz vienu adresi

        System.out.println(pers1);

        Person pers4 = new Person("Joe"); // izveido jaunu adresi


        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // System.out.println(unicafeExactum);

        // PaymentCard annesCard = new PaymentCard(2);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // unicafeExactum.addMoneyToCard(annesCard, 100);

        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // System.out.println(unicafeExactum);

        
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




