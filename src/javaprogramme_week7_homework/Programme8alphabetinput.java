package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme8alphabetinput {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
    //any other alphabet should be invalid entry//
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        String alphabet = scan.next().toUpperCase();


        if (alphabet.equals("A")) {
            System.out.println("City name is : Ahmedabad");

        } else if (alphabet.equals("B")) {
            System.out.println("City name is : Bombay");
        } else if (alphabet.equals("C")) {
            System.out.println("City name is : Cardiff");
        } else if (alphabet.equals("D")) {
            System.out.println("City name is : Dewas");
        } else if (alphabet.equals("E")) {
            System.out.println("City name is : Edinburgh");
        } else if (alphabet.equals("F")) {
                System.out.println("City name is :Frankfurt ");
            } else {
                System.out.println("Invalid entry");
            }
        scan.close();

        }
    }
