package lesson7;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please provide the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result after division:" + divideNumbers(num1, num2));
    }
    public static double divideNumbers(double x, double y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Cannot divide by 0!");
        }
    }
}
