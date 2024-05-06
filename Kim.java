import java.util.Scanner;
	public class SumOfTheDigit {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000");
		int number1 = input.nextInt;

		int number2 = number1 / 100;
		int number3 = (number2 / 10) % 10
		int number4 = number3 % 10

		System.out.printf("The sum of the digit is %d", number4);
	}
}	
		