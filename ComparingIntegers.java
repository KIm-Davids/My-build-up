import java.util.Scanner;

	public class ComparingIntegers {
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an Integer: ");
		int number1 = input.nextInt();

		int square = number1 * number1;
		int sum = square + number1;
		
		if (sum < 100);
		System.out.println("The number is less than 100");

		if (sum > 100);
		System.out.println("The number is greater than 100");
		
		if (sum == 100);
		System.out.println("The number is equal to 100");	
	}
}

	
