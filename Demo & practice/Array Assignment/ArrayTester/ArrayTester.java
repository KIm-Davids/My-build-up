import java.util.Arrays;
import java.util.Scanner;
	public class ArrayTester {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int counter = 0;
		int result = 0;

		int[] array = new int[10];

		System.out.print("Enter a number");
		

		for(counter = 0; counter < array.length; counter++) {
		
		array[counter] = input.nextInt();
		result = ArrayTestFunction.noOfEvenNumbers(array);

		}


		System.out.print("The even number are " + result);	
				
	
		
			
		
	}
}