import java.util.Arrays;
import java.util.Scanner;
	public class BooelanReturnTwoParameters {
		public static boolean performAction(int[] collectInput, int number) {



	
	for(int num : collectInput) {
	if(number % 2 == 0) {
	return true;
	}
	}
		return false;
		
	

}



	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);

	int[] array = new int[2];


	System.out.print("How many times ? ");
	int number = input.nextInt();

	int counter = 0;

	for(counter = 0; counter < array.length; counter++) {
	
	System.out.print("Enter the number");
	array[counter] = input.nextInt();
	}
	//boolean result = performAction(number);

	System.out.print(performAction(array, 14));
}
}