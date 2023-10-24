package javaprogramme_week7_homework;

import java.util.Scanner;

public class Programme5SalarySlip {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     */
    public static void main(String[] args) {
        int HRA;
        int DA;
        int TA;
        int PF;
        int BasicSalary;
        int GrossSalary;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        BasicSalary = scan.nextInt();

        HRA = (10 * BasicSalary) / 100;
        DA = (8 * BasicSalary) / 100;
        TA = (9 * BasicSalary) / 100;
        PF = (20 * BasicSalary) / 100;
        GrossSalary = BasicSalary + HRA + TA + DA - PF;

        System.out.println("Enter your Employ ID");
        int EmployId = scan.nextInt();
        System.out.println("Employ Name");
        String Name = scan.next();

        System.out.println("-------------------------------------------");
        System.out.println("|          Salary Slip                     |");
        System.out.println("|------------------------------------------|");
        System.out.println("|Employ ID:                                |");
        System.out.println("|Employee Name:                            |");
        System.out.println("|------------------------------------------|");
        System.out.println("|Basic Salary  :         = " + BasicSalary);
        System.out.println("|HRA           :          =" + HRA);
        System.out.println("|TA            :          =" + TA);
        System.out.println("|DA            :          =" + DA);
        System.out.println("|PF            :          =" + PF);
        System.out.println("|-------------------------------------------|");
        System.out.println("|Gross Salary  :           =" + GrossSalary);
        System.out.println("|--------------------------------------------|");
        scan.close();
    }

}



