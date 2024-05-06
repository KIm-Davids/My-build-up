import java.util.Scanner;
	public class Comparator {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter another number: ");
		int number2 = input.nextInt();
		
		if (number1 == number2) {
			System.out.printf("First number - %d is equal to second number - %d%n", number1, number2);
			System.out.println("0");
		
		}
		
		if (number1 > number2) {
			System.out.printf("First number - %d is greater than second number - %d%n", number1, number2);
			System.out.println("1");
		}

		if (number1 < number2) {
			System.out.printf("First number - %d is less than the second number - %d%n", number1, number2);
			System.out.println("-1");
		}

	}
}