import java.util.Scanner;
	public class PriceCalculator {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter price");
		double price = input.nextInt();

		double discount = 0.10 * price;

		double result = price - discount;

		System.out.print(result);

		}
}