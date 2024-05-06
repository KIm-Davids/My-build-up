import java.util.Scanner;
	public class FactorialOfNumbers {
	
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.print("Enter a number");
		int userInput = input.nextInt();

		FactorialOf findFactors = new FactorialOf();
		long result = findFactors.factors(userInput);

		System.out.print(result);
		}
}