/*                              DisplayGST.java
    Program No : 10
    Date :
    Program Title :
    Program Description : A Program to find side of a cube
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter6;

import java.util.Scanner;

public class FindVelocity {
    public static void displayVelocity() {
        Scanner input = new Scanner(System.in);
        int u, a, s;
        double v;
        System.out.println("Enter the Value of u : ");
        u = input.nextInt();
        System.out.println("Enter the Value of a");
        a = input.nextInt();
        System.out.println("Enter the Value of s");
        s = input.nextInt();
        v = Math.sqrt(Math.pow(u, 2) + 2 * a * s);
        System.out.println("Find Velocity = " + v);

    }
}
