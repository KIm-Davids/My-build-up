import java.util.Scanner;
	public class SalesComissionCalculator {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter items sold:");		
	

		System.out.println("Enter a value");
		double itemSold1 = input.nextDouble();

		System.out.println("Enter a value");
		double itemSold2 = input.nextDouble();

		System.out.println("Enter a value");
		double itemSold3 = input.nextDouble();

		System.out.println("Enter a value");
		double itemSold4 = input.nextDouble();

		System.out.println("Enter a value");
		double itemSold5 = input.nextDouble();

		double itemSoldTotal = itemSold1 + itemSold2 + 			itemSold3 + itemSold4 + itemSold5;		
	
		double earnings = (0.09 * itemSoldTotal);
		
		double totalEarning = earnings + 200;

		System.out.printf("Salesperson earnings - $%.2f", 		totalEarning);
		
	}
}

		