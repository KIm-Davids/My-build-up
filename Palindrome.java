import java.util.Scanner;
	public class Palindrome {
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer: ");
		int number1 = input.nextInt();
		
		int number2 = number1 /100 % 10;
		int number3 = (number1 / 10) % 10;
		int number4 = number1 % 10;

		
		
		if (number4 != number2) {
			System.out.printf("%d%d%d is not a palindrome", number2, number3, number4);
		}
		if (number4 == number2) {
			System.out.printf("%d%d%d is a palindrome", number2, number3, number4);
		}
	}
}