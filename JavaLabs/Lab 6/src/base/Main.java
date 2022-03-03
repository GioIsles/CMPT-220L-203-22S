package base;
import java.util.ArrayList;
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
        System.out.println("Array:");
        int[] arr = {1,2,3,4};
        System.out.println(arr[1]);
        System.out.println();
        // Create an ArrayList, Populate it, and Print it out
        System.out.println("Array List:");
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        System.out.println(arrList);
        System.out.println();
        // Create an LinkedList, Populate it, and Print it out
        System.out.println("Linked List:");
        LinkedList<Integer> arrLink = new LinkedList<Integer>();
        arrLink.add(1);
        arrLink.add(2);
        arrLink.add(3);
        arrLink.add(4);
        arrLink.add(5);
        System.out.println(arrLink);
        System.out.println();
        // Create an Queue, Populate it, and Print it out
        Queue<Integer> arrQueue = new LinkedList<Integer>();
        arrQueue.add(2);
        arrQueue.add(4);
        arrQueue.add(6);
        arrQueue.add(8);
        System.out.println(arrQueue);
        System.out.println();
        // Create an Stack, Populate it, and Print it out
        Stack<String> arrs = new Stack<String>();
        arrs.push("One");
        arrs.push("Two");
        arrs.push("Three");
        System.out.println(arrs);
        System.out.println();
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant plant1 = new Plant(needsWatering, plantFamily, name, var1, var2);
        plant1.needsWatering = true;
        plant1.plantFamily = "Asphodelaceae";
        plant1.name = "Aloe Vera";
        plant1.var1 = 12;
        plant1.var2 = 8;
        plant1.wateringInstructions();
        plant1.sunlightRequirements();
        plant1.PlantPrint();
        System.out.println();
        Plant plant2 = new Plant(needsWatering, plantFamily, name, var1, var2);
        plant2.needsWatering = false;
        plant2.plantFamily = "Cacti";
        plant2.name = "Silver Torch Cactus";
        plant2.var2 = 17;
        plant2.sunlightRequirements();
        plant2.PlantPrint();
    }

    public static boolean needsWatering;
    public static String plantFamily;
    public static String name;
    public static int var1;
    public static int var2;

    public void wateringInstructions() {
    }

    public void sunlightRequirements() {
    }
}
