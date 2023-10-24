package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme7findthesales {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sale's ID");
        int salesId = scan.nextInt();
        System.out.println("Enter Seller's name");
        String SellerName = scan.next();
        System.out.println("Enter sales amount");
        int salesAmount = scan.nextInt();
        System.out.println("Enter Basic salary");
        double basicSalary = scan.nextDouble();

        System.out.println("Sale's ID" + salesId);
        System.out.println("Seller's name" + SellerName);
        System.out.println("Sales Amount" + salesAmount);
        System.out.println("Basic salary" + basicSalary);
        //   System.out.println("Sales commission"+ commission);
        // System.out.println("Total salary"+ totalSalary);
        scan.close();
        //public static void calculateCommission(int salesAmount){
        double commission = 0.0;

        if (salesAmount >= 50000) {
            commission = salesAmount * 35 / 100;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 20 / 100;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 10 / 100;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 5 / 100;
        } else if (salesAmount < 10000) {
            commission = salesAmount * 2 / 100;
            // calculate total salary//
            double totalSalary = basicSalary + commission;

            scan.close();
        }
    }
}