import java.util.Scanner;
import java.util.Arrays;
	public class ArrayQuestionNumeber13 {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//int[] array = {1,2,3,4,5,6,7};	
		//int result = 0;
		int number = 0;
		int[] array = new int[6];

		for(int counter = 0; counter < array.length; counter++) {
		System.out.print("Enter a number");
		number = input.nextInt();
		array[counter] = number;
		}		

		int[] result = swapNumbers(array);
	
		System.out.println("Normal number " + Arrays.toString(array));		
		System.out.print("Swapped number " + Arrays.toString(result));
		

}


		public static int[] swapNumbers(int[] collectInput) {

		int[] movedNumber = new int[collectInput.length];

		for(int counter = 0; counter < collectInput.length; counter++) {

		movedNumber[0] = collectInput[0];
		movedNumber[1] = collectInput[1];
		movedNumber[2] = collectInput[2];
		movedNumber[3] = collectInput[3];
		movedNumber[4] = collectInput[4];
		movedNumber[5] = collectInput[5];

		if(collectInput[0] % 2 == 1 && collectInput[1] % 2 == 1) {
		movedNumber[0] = collectInput[1];
		movedNumber[1] = collectInput[0];
		}
		
		if(collectInput[2] % 2 == 1 && collectInput[3] % 2 == 1) {
		movedNumber[3] = collectInput[2];
		movedNumber[2] = collectInput[3];
		}

		if(collectInput[4] % 2 == 1 && collectInput[5] % 2 == 1){
		movedNumber[4] = collectInput[5];
		movedNumber[5] = collectInput[4];
		}
		
		


		
		
		
		
}
		return movedNumber;
	
}	
}	