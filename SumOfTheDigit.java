import java.util.Scanner;
	public class SumOfTheDigit {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000");
		int number1 = input.nextInt();
		int number2 = number1 / 100 % 10;
		int number3 = (number1 / 10) % 10;
		int number4 = number1 % 10;
		int sum = number2 + number3 + number4;
		System.out.printf("The sum of the digit is %d", sum);
	}
}	
		