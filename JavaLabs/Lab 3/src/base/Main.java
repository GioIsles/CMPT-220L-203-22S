package base;

public class Main {
    /**
     * # Lab Two
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // Make an if statement that triggers a print or println statement
        if(true){
            System.out.println("Hello World!");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        if(x > 15){
            System.out.println("Welcome to the internet.");
        }
        else{
            System.out.println("Sorry, it seems that x isnt greater than 15.");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        if(x < 10){
            System.out.println("X is less than 10.");
        }
        else if(x == 10){
            System.out.println("X is equal to 10.");
        }
        else{
            System.out.println("X is greater than 10.");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        if(x > y){
            System.out.println("X is greater than Y.");
        }
        else if(x < y){
            System.out.println("X is less than Y.");
        }
        else{
            System.out.println("X is equal to Y.");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        if((x > 5) && (y > 5)){
            System.out.println("X and Y are greater than 5.");
        }
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        if((x > 15) || (y > 15)){
            System.out.println("Either X or Y is greater than 15.");
        }
    }
}
