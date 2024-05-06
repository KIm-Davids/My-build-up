import java.util.Scanner;
	public class PracticeWorkOne {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter one integer: ");
		int number1 = input.nextInt();

		int number2 = number1 * number1;
		
		if (number1 == 100) {
			System.out.println("The number is equal than 100");
		}
		if (number1 != 100) {
			System.out.println("The number is not equal than 100");
		}
		if (number1 > 100) {
			System.out.println("The number is greater than 100");
		}
		if (number1 <= 100) {
			System.out.println("The number is less than 100");
		}
		if (number2 == 100) {
			System.out.println("The square is equal than 100");
		}
		if (number2 != 100) {
			System.out.println("The square is not equal than 100");
		}
		if (number2 > 100) {
			System.out.println("The square is greater than 100");
		}
		if (number2 <= 100) {
			System.out.println("The square is less than 100");
		}
	}
}
		
		