public class ArrayTestFunction {
	public static int noOfEvenNumbers(int[] collectInput) {

	int[] array = new int[10];
	int evenNumbers = 0;
	int result = 0;

	for(int count = 0; count < array.length; count++) {

	if(collectInput[count] % 2 == 0) {
		result = collectInput[count];
	}
	}
	
		return result;
	}


}