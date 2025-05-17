/*                              DisplayGST.java
    Program No : 08
    Date :
    Program Title :
    Program Description : A Program to find side of a cube
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter6;

import java.util.Scanner;

public class FindCube {
    public static void displayCube() {
        Scanner input = new Scanner(System.in);
        int v;
        double a;
        System.out.print("[?] Enter Volume to a Cube");
        v = input.nextInt();
        a = Math.cbrt(v);
        System.out.println("Volume to a Cube : " + v);
        System.out.println("Side of a Cube : " + a);
    }
}
