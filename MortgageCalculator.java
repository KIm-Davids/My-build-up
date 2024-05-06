import java.util.Scanner;
	public class MortgageCalculator {
		public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your principal amount");
		double principal = input.nextInt();

		System.out.println("Enter the annual interest rate");
		double num2 = input.nextInt();

		System.out.println("Enter the number of years");
		double num3 = input.nextInt();
		
		double num12 = num3 * 12;

		double rate = num2 / 100;

		double num4 = principal * rate / 12;

		double num5 = rate / 12;

		double num6 = 1 + num5;
		
		double num7 = Math.pow(num6,num12);

		double num8 = Math.pow(num6,num12);

		double num9 = num8 - 1;

		double num10 = num4 * num7;

		double num11 = num10 / num9;
		

		System.out.printf("Your monthly payment is %.2f", num11);
	
		
		
		}
}