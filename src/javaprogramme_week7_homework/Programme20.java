package javaprogramme_week7_homework;

public class Programme20 {
    /**
     * Write a Java program to test if an array contains a specific value
     */
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        int targetValue = 15;

        boolean result = containsValue(numbers, targetValue);

        if (result) {
            System.out.println("The array contains the value" + targetValue);
            System.out.println("The array does not contain the value" + targetValue);
        }

    }

    public static boolean containsValue(int[] array, int target) {
        for (int elements : array) {
            if (elements == target) {
                return true;

            }
        }
        return false;
    }
}