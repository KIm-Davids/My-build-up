import java.util.Arrays;
import java.util.Scanner;
	public class ReverseNumbersInAnArray {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		
		int counter = 0;
		

		int[] numbers = new int[10];
		int[] num = new int[numbers.length];
		int rev = numbers.length-1;

		
	
		for(counter = 0; counter < numbers.length; counter++){
		System.out.print("Enter a number "+ (counter+1) + " : ");
		numbers[counter] = input.nextInt();
		num[rev] = numbers[counter];
		 rev--;
		}

		System.out.print("The numbers in the array are: ");
		System.out.print(Arrays.toString(num));
		

			
		}
}
