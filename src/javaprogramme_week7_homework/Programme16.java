package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any digit");
        int num = scan.nextInt();
        scan.close();
        if (num > 0) {
            System.out.println("It is a positive number");
        } else if (num < 0) {
            System.out.println("It is a negative number");
        } else {
            System.out.println("The number is Zero");
        }
        }
    }
