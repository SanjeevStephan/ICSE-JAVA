/*
    Program No : 00
 */
package project;

import project.ix.chapter4.*;
import project.ix.chapter6.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------[ 01.Student Bio-Data ]---------");
        //calling method() from class StudentBioData
        StudentBioData.displayStudentBioData("Jimmy Jones"); // Write your name here

        System.out.println("--------------[ 02. Sum ]------------");
        //calling method() from class CalculateSum
        CalculateSum.inputAndDisplaySum();

        System.out.println("--------------[ 03.Area of Square ]------------");
        //calling method() from class AreaOfSquare
        AreaOfSquare.displaySquareArea();

        System.out.println("--------------[ 04. Goods & Service Tax ]------------");
        //calling method() from class AreaOfSquare
        CalculateGST.displayGST();

        System.out.println("--------------[ 05. Discounts ]------------");
        //calling method() from class AreaOfSquare
        CalculateDiscount.displayDiscount();

        System.out.println("--------------[ 06. Diagonal of Square ]------------");
        //calling method() from class FindDiagonalOfSq
        FindDiagonalOfSq.displayDiagonal();

        System.out.println("--------------[ 07. Display Smallest Number ]------------");
        //calling method() from class FindSmallestNum
        FindSmallestNum.displaySmallestNum(2,6,9);

        System.out.println("--------------[ 08. Display Smallest Number ]------------");
        //calling method() from class FindCube
        FindCube.displayCube();

        System.out.println("--------------[ 09. Find Velocity ]------------");
        //calling method() from class FindVelocity
        FindValueOfExpression.findExpression();

        System.out.println("--------------[ 09. Find Velocity ]------------");
        //calling method() from class FindVelocity
        FindVelocity.displayVelocity();

    }
}
