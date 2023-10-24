package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme10 {
    /**
     * Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1 = scan.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = scan.nextDouble();
        System.out.println("Enter Operators (+, -,/ , *");
        char operators = scan.next().charAt(0);


        if (operators == '+') {
            double result = num1 + num2;
            System.out.println("Result is"   +  result);
        } else if (operators == '-') {
            double result = num1 - num2;
            System.out.println("Result is"   +  result);
        } else if (operators == '*') {
            double result = num1 * num2;
            System.out.println("Result is"  +  result);
        } else if (operators == '/') {
                double result = num1 / num2;
                System.out.println("Result is"  +  result);
            } else {
                System.out.println("Error: Division by 0 is not allowed");
            }
        scan.close();
        }
    }

