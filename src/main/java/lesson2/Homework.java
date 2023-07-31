package lesson2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        printName();
        printTrianglePerimetar();
        printTriangleArea();
        printTree();
        printPerimetarInput();
        printAreaInput();
        convertMinutes();
    }

    public static void printName() {
        String firstName = "Anna";
        String secondName = "Borisova";
        String lastName = "Budinova";

        System.out.println("My name is: " + firstName + " " + secondName + " " + lastName);

    }

    public static void printTrianglePerimetar() {
        float a = 3.4F;
        float b = 6.98F;
        float c = 2.99F;

        float p = a + b + c;
        System.out.println("The perimetar of the triangle is: " + p);
    }

    public static void printTriangleArea() {
        float b = 4.56F;
        float h = 3.45F;
        float area = (b * h) / 2;

        System.out.println("The area of the triangle is: " + area);
    }

    public static void printTree() {
        char symbol = '*';
        System.out.println("    " + symbol);
        System.out.println("   " + symbol + " " + symbol);
        System.out.println("  " + symbol + " " + symbol + " " + symbol);
        System.out.println(" " + symbol + "  " + symbol + "  " + symbol);
    }

    public static void printPerimetarInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter values for the sides of the triangle in the following sequence: a,b,c: ");
        float a = myObj.nextFloat();
        float b = myObj.nextFloat();
        float c = myObj.nextFloat();

        float perimetar = a + b + c;
        System.out.println("The Perimetar of the triangle is: " + perimetar);
    }

    public static void printAreaInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the h and b value: ");
        float h = myObj.nextFloat();
        float b = myObj.nextFloat();

        float area = (h * b) / 2;
        System.out.println("The Area of the triangle is: " + area);
    }

    public static void convertMinutes() {
        int minutesInHour = 60;
        int hourInDay = 24;
        short daysInShortYear = 365;

        int minutesInOneYear = minutesInHour * hourInDay * daysInShortYear;

        Scanner inputMinutes = new Scanner(System.in);

        System.out.println("Please enter a value for minutes: ");

        long min = inputMinutes.nextLong();
        long years = (min / minutesInOneYear);
        long days = (min/minutesInHour/hourInDay) % daysInShortYear;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
