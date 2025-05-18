/*                              DisplayGST.java
    Program No : 03
    Date :
    Program Title :
    Program Description : Program to Input name and Marks in Physics, Chemistry and Biology.
    Note : below method is executed from public static void main(String[] args){..} method only
 */

package project.ix.chapter7;

import java.util.Scanner;

public class GradeTheStudent {

     static int inputMarkFor(String subject) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Marks in " + subject + " :");
         int marks = input.nextInt();
         return marks;
    }
    static String decideGrades(int average) {
        String grade = "";
        if (average >= 80)
            grade = "Student of the Year";
        if(average >= 60 && average < 80)
            grade = "1st Division";
        if(average >= 45 && average < 60)
            grade = "2nd Division";
        if(average >= 40 && average < 45)
            grade = "Pass";
        if(average < 40)
            grade = "Promotion not Granted";
        return grade;
    }

    public static void displayGrades() {

        int phy = inputMarkFor("Physics");
        int chem = inputMarkFor("Chemistry");
        int bio = inputMarkFor("Biology");

        int average = (phy + chem + bio) / 3;
        String grade = decideGrades(average);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = scanner.nextLine();
        System.out.println("------------------------");
        System.out.println("Name : " + name);
        System.out.println("Average Marks : " + average);
        System.out.println("Grade : " + grade);
    }

//    public static void main(String[] args) {
//        displayGrades();
//    }


}
