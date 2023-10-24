package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme6ScanoddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int number;
        number = scan.nextInt();
        String result = number % 2 == 1 ? "odd number" : "even number";
        System.out.println("The Number is:" + result);

        scan.close();

    }
}
