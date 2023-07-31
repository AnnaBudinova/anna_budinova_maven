package lesson4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        calculateTriangle();
        daysOfTheWeek();
        eligibleToWork();
        printRevenue();
        largestNumber();
        reverseArray();
        divisibleNumber();
        planVacation();
    }

    public static void calculateTriangle() {
        float angle1, angle2, angle3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the angles of the triangle in the following sequence: angle1,angle2,angle3: ");
        angle1 = scanner.nextFloat();
        angle2 = scanner.nextFloat();
        angle3 = scanner.nextFloat();

        float sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles != 180) {
            System.out.println("The triangle cannot be build!");
        } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println("The triangle is acute");
        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("The triangle is right-angled");
        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println("The triangle is obtuse");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("The triangle is equilateral");
        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is multifaceted");
        }
    }

    public static void daysOfTheWeek() {
        System.out.println("Please enter the day of the week using the number from 1 to 7:");
        Scanner scanner = new Scanner(System.in);
        byte day = scanner.nextByte();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Monday");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "-th day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day:" + day + " Please select a day between 1-7");
        }
    }

    public static void eligibleToWork() {
        System.out.println("Enter your age: ");
        byte age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextByte();
        if (age < 16) {
            System.out.println("You are not eligible to work.");
        } else {
            System.out.println("You are eligible to work");
        }
    }

    public static void printRevenue() {
        double revenue;
        double unitPrice;
        int quantity;
        String discountRate15 = "(15%)";
        String discountRate20 = "(20%)";
        String discountRate0 = "(0%)";
        double discount;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;
        double discount1 = revenue * 0.15;
        double discount2 = revenue * 0.20;
        double discount3 = revenue * 0.00;
        if (quantity >= 100 && quantity <= 120) {
            System.out.println(revenueMessage + (revenue - discount1) + dollar);
            System.out.println(discountMessage + discount1 + dollar + discountRate15);
        } else if (quantity > 120) {
            System.out.println(revenueMessage + (revenue - discount2) + dollar);
            System.out.println(discountMessage + discount2 + dollar + discountRate20);
        } else {
            System.out.println(revenueMessage + (revenue - discount3) + dollar);
            System.out.println(discountMessage + discount3 + dollar + discountRate0);
        }
    }

    public static void largestNumber() {
        int arr[] = {2, 11, 45, 9, 150, 48};
        int largestNumber = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber) largestNumber = arr[i];
        }
        System.out.println("The largest number is: " + largestNumber);
    }

    public static void planVacation() {
        String vacationType;
        double budget;
        double dailyBudget;
        int people;
        int days;
        String bulgariaDestinationMessage = "Available destination: Bulgaria";
        String nonBulgariaDestinationMessage = "Available destination: Outside Bulgaria";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter vacation type:");
        vacationType = scanner.nextLine();

        System.out.println("Please enter number of days:");
        days = scanner.nextInt();

        System.out.println("Please enter number of people:");
        people = scanner.nextInt();

        System.out.println("Please enter your budget:");
        budget = scanner.nextDouble();

        dailyBudget = budget / (days * people);

        switch (vacationType) {
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation!");
        }
    }

    public static void reverseArray() {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    public static void divisibleNumber() {
        int arr[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            if ((num % 5) == 0) {
                System.out.println(num);
                if (num > 150) {
                    break;
                }
            }
        }
    }
}
