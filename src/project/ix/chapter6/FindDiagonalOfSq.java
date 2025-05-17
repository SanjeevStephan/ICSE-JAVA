/*                              DisplayGST.java
    Program No : 06
    Date :
    Program Title :
    Program Description : A Program to find side of a cube
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter6;

import java.util.Scanner;

public class FindDiagonalOfSq {
    public static void displayDiagonal() {
        Scanner in = new Scanner(System.in);
        int a;
        double d;
        System.out.print("[?] Enter Side of a Square : ");
        a = in.nextInt();
        d = Math.sqrt(2) * a;
        System.out.println("Side of a Square = " + a);
        System.out.println("Diagonal of a Square = " + d);
    }
}
