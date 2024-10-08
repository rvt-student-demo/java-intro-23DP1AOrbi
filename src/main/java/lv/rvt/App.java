package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        // // x++ == x = x + 1

        // and -> &&
        // or -> ||
        // not -> !

    // printStars(5);
    // printStars(3);
    // printStars(9);
    // System.out.println();
    // printSquare(4);
    // System.out.println();
    // printRectangle(17, 3);
    // System.out.println();
    // printTriangle(4);

    // printTriangleTwo(4);

    christmasTree(16);


    }


    public static void printStars(int num) {
        for (int i = 1; i <= num ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 1 ; i <= size; i++) {
            printStars(size);
        }

    }
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size ; i++) {
            printStars(i);
        }
    }

    ////////////

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
                System.out.print(" ");
        }
    }

    public static void printTriangleTwo(int size) {
        for (int i = 1; i <= size; i++) {
           printSpaces(size-i);
           printStars(i); 
        }
        System.out.println();
    }

    public static void christmasTree(int height) {
        printSpaces(height-1);
            printStars(1);

        for (int i = 2; i <= height; i++) {
            printSpaces(height-i);
            printStars(i+i-1);
        }

        for (int j = 1; j <= 2; j++) {
            printSpaces(height-2);
            printStars(3);
        }
    }


    }


