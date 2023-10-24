package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     **/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("|        Mark Sheet            |");
        System.out.println("|------------------------------|");

        System.out.println("|      Name:                   |");
        String name = scan.next();
        System.out.println("|      Roll number:            |");
        int roll = scan.nextInt();
        System.out.println("|    Subjects:       Marks     |");
        System.out.println("|     Math     :               |");
        int mathMarks = scan.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid input");
        }
        System.out.println("|     Science   :              |");
        int scienceMarks = scan.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input");
        }
        System.out.println("|     English   :              |");
        int englishMarks = scan.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input");
        }
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks * 100) / 300;
        System.out.println("|------------------------------|");
        System.out.println("|      Total      : " + totalMarks);
        System.out.println("|------------------------------|");
        System.out.println("|      Percentage : " + percentage);
        if (percentage >= 35) {
            System.out.println("|  Result:     Pass            |");
        }
        if (percentage >= 80) {
            System.out.println("|   Grade:      A+             |");
        } else if (percentage >= 60) {
            System.out.println("|   Grade:      A              |");
        } else if (percentage >= 50) {
            System.out.println("|   Grade:      B              |");
        } else if (percentage >= 35) {
            System.out.println("|   Grade:                  |");
        } else {
            System.out.println("|   Result:     Fai         |");
        }
        scan.close();


    }
}