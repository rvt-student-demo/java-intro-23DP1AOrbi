package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    //    System.out.println("Yello");
    //    String name = "Juris";
    //    int age = 20;
    //    boolean isOnline = true;

    //    // My code starts here

    //    String name1 = "Laima";
    //    int age1 = 17;


    //    System.out.println(name1);
    //    System.out.println(age1);
    //    System.out.println(isOnline);

    //    // Code ends


    //    // Once Upon a Time
    //    System.out.println("Once upon a time");
    //    System.out.println("there was");
    //    System.out.println("a program");


    // Izveido skaneri vienu reizi un pielieto visā programmā

    Scanner scanner = new Scanner(System.in);

    System.out.println("Write your name:");
    String name = scanner.nextLine();

    System.out.println("Write your last name:");
    String lastName = scanner.nextLine();

    System.out.println("Write your group:");
    String group = scanner.nextLine();

    System.out.println("Yello " + name + " " + lastName + " from group " + group);
    }

}
