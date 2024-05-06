import java.util.Arrays;
import java.util.Scanner;
	public class DoArrays {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] arrays = new int[10];

		int number = 0;
		for(int counter = 0; counter < arrays.length; counter++) {
			System.out.println("Enter a number");
			 number = input.nextInt();

			arrays[counter] = number;
		}
		int[] result = evenNumbers(arrays);
		System.out.print(Arrays.toString(result));
		
		
}


		public static int[] evenNumbers(int[] collectInput) {
		int[] numbers = new int[collectInput.length/2];
		int count = 0;
		for(int counter = 0; counter < collectInput.length; counter+=1) {
		if(counter%2 == 0){
		numbers[count] = collectInput[counter];
		count ++;
		}
		}
		return numbers;
}	
}