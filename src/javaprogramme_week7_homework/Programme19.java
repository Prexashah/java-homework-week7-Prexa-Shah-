package javaprogramme_week7_homework;

public class Programme19 {
    /**
     * Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        double average = (double) sum/ numbers.length;
        System.out.println("Average of the array elements:" + average);

    }
}