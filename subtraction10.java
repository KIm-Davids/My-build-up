import java.util.Scanner;
	public class subtraction10 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number");
		int num1 = input.nextInt();
		
		System.out.print("Enter a number");
		int num2 = input.nextInt();
	
		SubtractingDigits subtractn = new SubtractingDigits();
		int result = subtractn.sub(num1, num2);

		System.out.print(result);
		}
}