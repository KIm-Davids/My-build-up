import java.util.Scanner;
	public class DiscountCalculatorJ {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Please enter a price");
	double num1 = input.nextInt();

	System.out.println("Please enter discount recieved");
	double num2 = input.nextInt();
	
	
	double discountPercentage = num2 / 100 * num1;
	double priceDiscount = num1 - discountPercentage;

	System.out.print("The price after discount is " + priceDiscount);
	
		}
}