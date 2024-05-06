import java.util.Arrays;
import java.util.Scanner;
	public class ArrayRetry {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number");
		int result = input.nextInt();


		


}

	public static int evenNumbers(int[] collectNumbers) {

	int counter = 0;
	int finalResult = 0;

	for(counter = 0; counter < collectNumbers.length; counter++) {
	finalResult += collectNumbers[counter];
	}

	return finalResult;
		}
}