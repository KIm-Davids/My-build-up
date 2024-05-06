import java.util.Scanner;
	public class TaxCalculator {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		char c = input.next().charAt(0);
		
		System.out.println("Enter earnings:");
		double earnings = input.nextDouble();

		
		double taxRate = 0.15 * earnings;
		double taxRate2 = 0.20 * earnings;

		double total = taxRate;
		double total2 = taxRate2;

	if (earnings <= 30000) {
		System.out.printf("Earnings insufficient - tax amount = %.2f", total);
		}
	if (earnings >= 30000) {
		System.out.printf("Earnings sufficient - tax amount %.2f", total2);
		}
	}
}
	