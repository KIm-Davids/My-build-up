import java.util.Arrays;
	public class ArrayQuestion {
		public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6};	
	
		//int result = 0;
		
		int[] result = swapNumbers(array);
		
		System.out.print(Arrays.toString(result));
		

}


		public static int[] swapNumbers(int[] collectInput) {

		int[] movedNumber = new int[collectInput.length];

		for(int counter = 0; counter < collectInput.length; counter++) {
		collectInput[1] = collectInput[0];
		
}
		return collectInput;
	
}	
}	