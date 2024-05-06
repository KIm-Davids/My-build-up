import java.util.Scanner;
	public class Arithmetic {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter one integer");
		int number1 = input.nextInt();
			
		System.out.println("Enter another integer");
		int number2 = input.nextInt();

		int square = number1 * number1;
		int square2 = number2 * number2;

		int sum = square + square2;
		int diff = square - square2;
		
		System.out.printf("The square of each = %d%n", square);
		System.out.printf("The sum of their squares = %d%n", square2);
		System.out.printf("The difference of the squares = %d%n", sum);
	}
}
		
		

		
		