/*                              DisplayGST.java
    Program No : 09
    Date :
    Program Title :
    Program Description : A Program to find value of an expression.
    Note : below method is executed from public static void main(String[] args){..} method only
 */

package project.ix.chapter6;

import java.util.Scanner;

public class FindValueOfExpression {
    public static void findExpression() {
        Scanner input = new Scanner(System.in);
        int a, b , c;
        double d;
        System.out.print("[?] Enter Value of a :  ");
        a = input.nextInt();
        System.out.print("[?] Enter Value of b : ");
        b = input.nextInt();
        System.out.print("[?] Enter Value of b : ");
        c = input.nextInt();
        d = 1 / Math.pow(a, 2) + 1 / Math.pow(b, 3) + 1 / Math.pow(c, 4);
        System.out.print("Value of the Expression : " + d);
    }
    public static void main(String[] args) {
        findExpression();
    }
}


