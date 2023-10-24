package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme12 {
     /**
      * 12. Write a program that tells us input value is number or an alphabet or symbol.
      */

     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter a Character:");
          char ch = scan.next().charAt(0);
          scan.close();
          if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
               System.out.println("It is an Alphabet");
          }
          else if (ch>= '1'&& ch<=9999 ){
               System.out.println("It's Digit");
          }
          else{
               System.out.println("It is a symbol");
          }
     }
}