package javaprogramme_week7_homework;

public class Programme18 {
    /**
     * 18. Write a Java program to sum values of an array.
     */
    public static void main(String[] args) {

        int[] a = {5, 2, 7, 9, 6};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a [i];
        }
        System.out.println("Sum of the array elements"  +  sum);
    }
}