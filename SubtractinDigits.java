import java.util.Scanner;
	public class SubtractinDigits {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number");
		int num1 = input.nextInt();

		System.out.print("Ente the second number");
		int num2 = input.nextInt();

	
		SubtractingDigits subtract = new SubtractingDigits();

		int result = subtract.sub(num1, num2);
	System.out.print(result);
		}
}