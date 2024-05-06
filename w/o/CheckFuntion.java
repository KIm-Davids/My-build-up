import java.util.Scanner;
	public class CheckFuntion {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int result = 0;
		int[] array = new int[2];
		int[] userInput = new int[10];

		System.out.print("Enter the numbers");
		

		minimumAndMaximumNumber number = new minimumAndMaximumNumber();

		for(counter = 0; counter < array.length; counter++) {
		result = input.nextInt();
		userInput[counter] = result;
		array[counter] = number.minimumAndMaximum(userInput[counter]);
		
		}
		System.out.print(array[counter]);
	}
}
		
		