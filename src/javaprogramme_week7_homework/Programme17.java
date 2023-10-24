package javaprogramme_week7_homework;

import java.util.Arrays;
import java.util.Comparator;

public class Programme17 {
    /** Write a Java program to sort a numeric array and a string array.*/
    public static void main(String[] args) {
        int[] numericArray = {5,2,9,1,5,6};
        String[] stringArray = {"apple", "banana", "Cherry","date", "Kiwi","orange"};

        System.out.println("original numeric array:"  + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array:" + Arrays.toString(stringArray));

        System.out.println("Original string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray, new StringComparator());
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }

    // Custom comparator for string array sorting
    static class StringComparator implements Comparator<String> {

        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
    }


