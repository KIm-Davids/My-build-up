import java.util.Scanner;
	public class FinApp {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter balace and interest rate: ");
		double number1 = input.nextDouble();

		System.out.print("Enter balance and interest rate: ");
		double number2 = input.nextDouble();

		double interest = number1 * number2;
		double finalAnswer = interest / 1200;

		System.out.printf("The interest is %.4f", finalAnswer);
	}
}