import java.util.Arrays;
import java.util.Scanner;
	public class CheckMyArray {
		public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		int number = 0;
		int collectedNumbers = 0;
		System.out.print("Enter a number");
		

		for(int counter = 0; counter < array.length; counter++) {
		System.out.print("Enter a number");
		collectedNumbers = input.nextInt();
		array[counter] = collectedNumbers;
		}

		MinimumAndMaximumNumber numberToCheck = new MinimumAndMaximumNumber();

		int[] result = numberToCheck.minimumAndMaximum(array);

		System.out.print(Arrays.toString(result));		
	}
}