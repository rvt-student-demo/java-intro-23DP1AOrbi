package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {

        // and -> &&
        // or -> ||
        // not -> !

        // ArrayList<String> nameList = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);

        // while (true) {
        //     String name = scanner.nextLine();
        //     if (name == "") {
        //         System.out.println(nameList.get(2));
        //         break;
        //     }
        //     nameList.add(name);
        // }

        // // Pievieno elementus
        // intList.add(1);
        // // Saņemt elementu
        // intList.get(0);
        // // Cik ir elementu masīvā?
        // intList.size();



        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intNum = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scan.nextLine());
            if (number == -1) {
                break;
            }
            intNum.add(number);
        }
        System.out.print("From where? ");
        int begin = Integer.valueOf(scan.nextLine());

        System.out.print("To where? ");
        int end = Integer.valueOf(scan.nextLine());

        for (int i = begin ; i <= end ; i++) {
                System.out.println(intNum.get(i));
            }
            
        }

    }


