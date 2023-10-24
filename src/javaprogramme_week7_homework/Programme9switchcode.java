package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme9switchcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        String alphabet = scan.next().toUpperCase();


        switch (alphabet) {
            case "A" -> System.out.println("City name is : Ahmedabad");
            case "B" -> System.out.println("City name is : Bombay");
            case "C" -> System.out.println("City name is : Cardiff");
            case "D" -> System.out.println("City name is : Dewas");
            case "E" -> System.out.println("City name is : Edinburgh");
            case "F" -> System.out.println("City name is :Frankfurt ");


            default -> System.out.println("Invalid entry");
        }
        scan.close();
    }
}