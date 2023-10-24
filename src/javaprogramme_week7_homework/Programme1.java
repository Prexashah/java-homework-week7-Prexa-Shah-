package javaprogramme_week7_homework;

/* write a programme that input number is odd or even
using ternary operator
odd number = if we divide by 2 the remainder will be 1
even number = if we divide by 2 the remainder will be 0
formula = condition ? first condition : second condition
result = what ever the condition is true.
 */
public class Programme1 {
    public static void main(String[] args) {
        int num = 15;
        String result = num % 2 == 1 ? "odd number" : "even number";
        System.out.println("The Number is :" + result);


    }

}

