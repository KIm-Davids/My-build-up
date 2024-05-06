import java.util.Scanner;
	public class FinAppFiv {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double number1 = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage: ");
		double number2 = input.nextDouble();

		System.out.println("Enter number of years: ");
		double number3 = input.nextDouble();

		double numberOfYears = Math.pow(number3, 12);
		
		double mir = 1 + number2 / 100;
		
		double fiv = number1 * (mir * numberOfYears);

		System.out.printf("Future value is $%.2f", fiv);
	}
}

		