package spiralNote.examples.input;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // This statement creates a Scanner Object - input
        System.out.print("Enter Username ; ");
        String userName = input.nextLine();
        System.out.println("UserName : " + userName);
    }
}
