package lv.rvt;

import java.util.*;

public class App {
    public static void main( String[] args ) throws Exception {

        Box box = new  Box( 2.5, 5.0, 6.0 ) ;

        System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
        Box box1 = new Box(box);
        Box box2 = new Box(box);
        Box box3 = box2.biggerBox(box1);
        System.out.println( "Area: "  + box3.area() + " volume: " + box3. volume() );
        System.out.println("Lenght: " + box3.lenght() + " Width: " + box3.width() + " Height: " + box3.height());
        Box box4 = box1.smallerBox(box);
        System.out.println( "Area: "  + box4.area() + " volume: " + box4. volume() );
        System.out.println("Lenght: " + box4.lenght() + " Width: " + box4.width() + " Height: " + box4.height());
        System.out.println("Lenght: " + box1.lenght() + " Width: " + box1.width() + " Height: " + box1.height());

        System.out.println(box4.nests(box));

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




