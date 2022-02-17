package base;


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
    static int num1 = 2;
    static int num2 = 7;
    static int num3 = 3;
    static int[] nums = {3,2,3,2,3,4,9,1,3};
    public static void main(String[] args) {

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
            System.out.println(num1);
            num1 = num1 + 1;
        }
        // Give me an example of you using a while loop
        while(num2 < 8){
            System.out.println(num2);
            num2++;

        //function 1
        int ans1 = power(5, 2);
        System.out.println("5^2 = " + ans1);
        //function 2
        int ans2 = findList(num3, nums);
        System.out.println("Num1 shows up in the array " + ans2 + " times.");
        //function 3
        int ans3 = summation(nums);
        System.out.println("The sum of the list is " + ans3 + ".");
        //function 4
        int ans4 = pythagorean(num1, num2);
        System.out.println("2^2 + 7^2 = " + ans4 + "^2 / c=" + ans4);
        }
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.
    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    public static int power(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    public static int findList(int num1, int [] nums){
        int numinlist = 0;       
        for (int number:nums) 
           {
               if (number == num1) 
               {              
                  numinlist++;
               }
           }
        return numinlist;
    }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
    public static int summation(int [] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        return sum;
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
    public static int pythagorean(int a, int b){
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double sum = a2 + b2;
        double c = Math.sqrt(sum);
        return (int) c;
    }

    int addition(int a, int b) {
        return a + b;
    }

    int division(int a, int b) {
        return a / b;
    }
}
