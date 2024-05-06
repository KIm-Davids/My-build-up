import java.util.Scanner;
	public class DiscountCalculator {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a price");
	double num1 = input.nextInt();

	System.out.print("Please enter discount recieved");
	double num2 = input.nextInt();
	
	
	double discountPercentage = num2 / 100 * num1;
	double priceDiscount = num1 - discountPercentage;

	System.out.print("The price after discount is " + priceDiscount);
	
		}
}