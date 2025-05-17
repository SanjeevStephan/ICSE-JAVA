/*                              DisplayGST.java
    Program No : 05
    Date :
    Program Title :
    Program Description : A dealer allows his customer two successive discounts of 20% and 10%
                          If the article costs Rs 7,200, calculate and display the selling price and
                          the total discount given by the dealer.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter4;

public class CalculateDiscount {
    public static void displayDiscount() {
        int cost_price = 7200;
        double d1, d2, discount, amount;
        d1 = cost_price * 20.0 / 100.0;
        d2 = (cost_price - d1) * 10.0 / 100.0;
        discount = d1 + d2;
        amount = cost_price - discount;
        System.out.println("Total Discount =" + discount);
        System.out.println("Amount to Pay =" + amount);
    }
}
