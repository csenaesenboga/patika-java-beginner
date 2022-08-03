import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //define the variables
        double price, taxRate, taxAmount, priceAfterTax;

        //get the price from user
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the price of the item to see the tax details");
        price = inp.nextDouble();

        //set the tax rate condition
        taxRate = (price>1000)? 0.08 : 0.18;

        System.out.println("Tax rate: " + taxRate);

        //calculate the tax amount
        taxAmount = price * taxRate;

        System.out.println("Tax amount: " + taxAmount);

        //calculate the new price after tax is added
        priceAfterTax = price + taxAmount;

        System.out.println("Price after tax: " + priceAfterTax);
    }
}
