package spiralNotes.codes;

/**
 * Real-Life Example Code-#4
 * File Name : ItemCalculator.java
 * Class Name : ItemCalculator
 * Description : Here's a real-life example of using different data-types, to calculate and output the total cost of a number of items :
 */
public class ItemCalculator {
    public static void main(String[] args) {
        // Create a Variables of different data-types
        int items = 50;
        double costPerItem = 9.99;
        double totalCost = items * costPerItem;
        char currency = '$';
        // Print Variables
        System.out.println("Number of Items : " + items);
        System.out.println("Cost per Item : " + costPerItem);
        System.out.println("Total Cost = " + totalCost + currency);
    }
}
