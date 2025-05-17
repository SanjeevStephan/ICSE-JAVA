/*                              DisplayGST.java
    Program No : 02
    Date :
    Program Title :
    Program Description : A dealer allows his customer two successive discounts of 20% and 10%
                          If the article costs Rs 7,200, calculate and display the selling price and
                          the total discount given by the dealer.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter4;

import java.util.Scanner;

public class CalculateSum {

    public static void inputAndDisplaySum() {
        // Declare the required variables first
        int a, b , sum;
        // Create Scanner Class's object to enable input from keyboard
        Scanner input = new Scanner(System.in);
        // Prompt to Enter First Number
        System.out.print("[?] Enter First Number : ");
        // Store the value receive from keyboard into a int variable
        a = input.nextInt(); // using nextInt() to accept integer value only
        // Prompt for the Second Number
        System.out.print("[?] Enter Second Number : ");
        b = input.nextInt();
        // Display the Sum of those two number
        sum = a + b;
        // Display the Result on the Screen
        System.out.println("The Sum of Two Number (a + b) : " + sum);
    }
}
