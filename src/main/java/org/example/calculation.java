package org.example;
import java.util.Scanner;

public class calculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Enter the operator (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                double num1 = getNumberInput("Enter the first number: ");
                double num2 = getNumberInput("Enter the second number: ");

                double result = performOperation(choice, num1, num2);
                System.out.println("Result: " + result);
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        System.out.println("Calculator application ended.!");
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    private static double getNumberInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static double performOperation(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return addition(num1, num2);
            case 2:
                return subtraction(num1, num2);
            case 3:
                return multiplication(num1, num2);
            case 4:
                return division(num1, num2);
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }

    private static double addition(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    private static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
            return Double.NaN;
        }

    }
}

