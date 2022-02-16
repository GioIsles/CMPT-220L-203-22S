package base;
import java.util.Scanner;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int[] nums = {1,2,3};

        // Give me an example of you using switch case.
        switch(num1){
            case 1:
            System.out.println("The number is 1");
            break;
            case 2:
            System.out.println("The number is 2");
            break;
            case 3:
            System.out.println("The number is 3");
            break;
        }
        // Give me an example of you using a for loop
        for(int i = 0; i < 5; i++){
            System.out.println(nums);
        }
        // Give me an example of you using a while loop
        while(num2 < 4){
            System.out.println(num2);
            num2++;
        }
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.
    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    int power(int num1, int num2){
        return num1 ^ num2;
    }
    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    int findList(int num1, int[] nums){
        int numinlist = 0;       
        for (int i = 0; i < nums.length; i++) 
           {
               if (num1 == nums[i]) 
               {              
                  numinlist = numinlist + 1;
               }
           }
    }
    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
    int summation(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
    }
    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */
    int pythagorean(int a, int b){
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double sum = a2 + b2;
        double c = Math.sqrt(sum);
        return c;
    }

    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
