import java.util.Arrays;
import java.util.Scanner;
	public class ArrayRetry{
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		int[] arrays = {1,2,3,4,5,6};

		int counter = 0;	

		//for(counter = 0; counter < arrays.length; counter++) {
		//System.out.print("Enter a number");
		//int number = input.nextInt();		
		//arrays[counter] = number;
		//}

		int result[] = swapNumber(arrays);

		//for(counter = 0; counter < arrays.length; counter++) {
		System.out.print(Arrays.toString(result));
		//}
}


	public static int[] swapNumber(int[] collectInput) {
	int[] theNumbers = new int[collectInput.length];

	for(int counter = 0; counter < collectInput.length; counter+=2) {
	theNumbers[counter+1] = collectInput[counter];

	theNumbers[counter] = collectInput[counter+1];
	if(counter == collectInput.length-2){
		theNumbers[counter + 1] = collectInput[counter];
		theNumbers[counter]  = collectInput[counter +1];
		break;
	}
	}

	return theNumbers;
	}
}