/*                              DisplayGST.java
    Program No : 07
    Date :
    Program Title :
    Program Description : Write a Program In Java to input three numbers and display the smallest number
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter6;

public class FindSmallestNum {
    public static void displaySmallestNum(int a, int b, int c)
    {
        int d, z ;
        d = Math.min(a, b); // Math.min() method gives us the smallest num
        z = Math.min(c, d);
        System.out.println("Smallest Number = " + z);
    }

}
