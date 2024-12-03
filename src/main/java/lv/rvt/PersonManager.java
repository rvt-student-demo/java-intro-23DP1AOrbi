package lv.rvt;
import java.io.BufferedReader;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {

       ArrayList<Person> persons = new ArrayList<>();
       BufferedReader reader = Helper.getReader("persons.csv");

       String line;

       reader.readLine();
       while ((line = reader.readLine()) != null) {
            
            String[] parts = line.split(", ");
            Person pers = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persons.add(pers);
       }

       return persons;
    }

}
