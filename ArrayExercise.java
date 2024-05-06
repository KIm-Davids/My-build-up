import java.util.Scanner;	
	public class LargeSmall {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number");
	int userInput = input.nextInt();
	
	System.out.print("Enter a number");
	int userInput1 = input.nextInt();
	
	System.out.print("Enter a number");
	int userInput2 = input.nextInt();


	int sum = userInput + userInput1 + userInput2;
	System.out.print(sum);

	int average = sum / 3;

	int product = userInput * (userInput1 * userInput2);
	
	System.out.print(Math.min(userInput, userInput1, userInput2));

	System.out.print(Math.max(userInput, userInput1, userInput2));

	}
}