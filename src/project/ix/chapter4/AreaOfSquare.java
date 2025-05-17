/*                              DisplayGST.java
    Program No : 03
    Date :
    Program Title :
    Program Description : A dealer allows his customer two successive discounts of 20% and 10%
                          If the article costs Rs 7,200, calculate and display the selling price and
                          the total discount given by the dealer.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter4;

public class AreaOfSquare {

    // static method can only be accessed from within the same class
    static void calculateSquare(int side) {
        // declaring the required variables for the program
        int area, perimeter;
        double diagonal;
        area = side * side;  // calculate area of sq
        perimeter = 4 * side; // calculate perimeter of sq
        diagonal = Math.sqrt(2) * side;

        System.out.println("The Area of Square :" + area);
        System.out.println("The Perimeter of Square : " + perimeter);
        System.out.println("The Diagonal of Square : " + diagonal);
    }
    // public static method() can be accessed outside the class
    public static void displaySquareArea(){
        calculateSquare(25);
    }
}
