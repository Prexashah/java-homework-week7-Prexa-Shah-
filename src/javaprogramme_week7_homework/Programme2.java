package javaprogramme_week7_homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 * leap year has 366 days, and it comes every 4 years
 * conditions:1 : it should be divisible by 4 except century years and remainder should be 0
 * condition2: century years should be divisible by 400 and remainder should be 0
 * if years are divide by 100 it should not give remainder 0
 */
public class Programme2 {
    //public static void main(String[] args) {
        /**int year = 2007;
        if (year % 400 == 0)  {
            System.out.println(year+ " is a leap year");

        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year+ " is a leap year");
        }
        else {
            System.out.println(year+ " Not a leap year");
        }
        }


    }**/
 // Via Scanner input//

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println(" Enter any year");
        year = scan.nextInt();

         if(year % 400 == 0)  {
             System.out.println(" is a leap year");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(" is a leap year");
        }
        else {
            System.out.println(year+ " Not a leap year");
            scan.close();
        }
    }

    }


