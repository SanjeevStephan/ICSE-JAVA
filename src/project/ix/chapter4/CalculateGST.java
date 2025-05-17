/*                              DisplayGST.java
    Program No : 04
    Date :
    Program Title : DisplayGST
    Program Description : A Shopkeeper sells an article for Rs 10,000. If the rate of tax under GST is 10%,
                          Calculate and display the tax and the amount paid by the customer.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package project.ix.chapter4;

public class CalculateGST {
    public static void displayGST() {
        int pr = 10000;
        double gst, amount;
        gst = pr * 10.0 / 100.0;
        amount = pr + gst;
        System.out.println("GST = " + gst);
        System.out.println("Amount to Pay =" + amount);
    }
}
