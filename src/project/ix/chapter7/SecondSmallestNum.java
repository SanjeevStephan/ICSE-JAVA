package project.ix.chapter7;

import java.util.Scanner;
public class SecondSmallestNum {
    public static int InputNumber(String digit) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + digit + " Number : ");
        int num = input.nextInt();
        return num;
    }

    public static void Find2ndSmallestNum() {
        int a = InputNumber("First");
        int b = InputNumber("Second");
        int c = InputNumber("Third");

        System.out.println("The Numbers are : " + a + " " + b + " " + c);
        if ((a < b) && (a < c))
        {
            if (b < c)
                System.out.println("The Second Smallest Number : " + b);
            else
                System.out.println("The Second Smallest Number : " + c);
        }

        if ((b < c) && (b < a))
        {
            if (c < a)
                System.out.println("The Second Smallest Number : " + c);
            else
                System.out.println("The Second smallest Number " + a);

        }

        if ((c < a) && (c < b))
        {
            if (a < b)
                System.out.println("The Second Smallest Number : " + a);
            else
                System.out.println("The Second Smallest Number : " + b);
        }
    }

//    public static void main(String[] args) {
//        Find2ndSmallestNum();
//    }
}
