package base;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        int[] arr = {1,2,3,4};
        System.out.println(arr);
        // Create an ArrayList, Populate it, and Print it out
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        System.out.println(arrList);
        // Create an LinkedList, Populate it, and Print it out
        LinkedList<Integer> arrLink = new LinkedList<Integer>();
        arrLink.add(1);
        arrLink.add(2);
        arrLink.add(3);
        arrLink.add(4);
        arrLink.add(5);
        System.out.println(arrLink);
        // Create an Queue, Populate it, and Print it out
        Queue<Integer> arrQueue = new LinkedList<Integer>();
        arrQueue.add(2);
        arrQueue.add(4);
        arrQueue.add(6);
        arrQueue.add(8);
        System.out.println(arrQueue);
        // Create an Stack, Populate it, and Print it out
        Stack<String> arrStack = new Stack<String>();
        arrStack.push("One");
        arrStack.push("Two");
        arrStack.push("Three");
        System.out.println(arrStack);
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        
    }
}
