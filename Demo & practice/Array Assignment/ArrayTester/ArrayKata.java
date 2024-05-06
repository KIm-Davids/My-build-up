public class ArrayKata {

	public class ArrayTest {
	public static int maximumIn(int[] collectInput) {

	int maximum = 0;
	for(int count = 0; count<collectInput.length;count++){
		if(collectInput[count] > maximum){
			maximum = collectInput[count];
		}
		
	}
		return maximum;
}

}



public static int minimumIn(int[] collectInput) {
	
	int minimum = collectInput[0];
	
	for(int count = 0; count < collectInput.length; count++) {
		if(collectInput[count] < minimum) {
			minimum = collectInput[count];
		}
	}
		return minimum;
}




	public static int sumOf(int[] collectInput) {

	int sum = 0;
	int counter = 0;
	for(counter = 0; counter < collectInput.length; counter++) {

		sum += collectInput[counter];
		}
		return sum;
	}
		
	




	public static int sumOfArrayOf(int[] collectInput) {
	
	int sum = 0;
	int evenNumbers = 0;
	for(int count = 0; count < collectInput.length; count++) {
	if(collectInput % 2 == 0) {
	 evenNumbers = collectInput[count];
		sum += evenNumbers;
	   }
	

			}
		
		return sum;
}
	
	

	public static int oddNumbers(int[] collectInput) {

	int counter = 0;
	int oddNumbers = 0;
	int sum = 0;
	for(counter = 0; counter < collectInput.length; counter++) {

	if(collectInput[counter] % 2 == 1 ) {
		oddNumbers = collectInput[counter];
		sum += oddNumbers;
	}
	}
		return sum;
	}



	public static int[] maximumAndMinimum(int[] collectInput) {

	int counter = 0;
	int maximum = 0;
	int minimum = collectInput[0];
	


	for(counter = 0; counter < collectInput.length; counter++) {

	if(collectInput[counter] > maximum) {
	maximum = collectInput[counter];
	}
	
	if(collectInput[counter] < minimum) {
	minimum = collectInput[counter];
	}

	}
	 
	int[] result = new int[2];
	result[0] = maximum;
	result[1] = minimum;

	return result;
	}



	public static int noOfOddNumbers(int[] number) {
	
	int oddNumbers[];

	int number[] = 0;
	for(int count = 0; count < number.length; count++) {
	
	if(number[count] % 2 == 1) {
	oddNUmbers++; 
	}
	}

	return oddNumbers;
}



	public static int noOfEvenNumberIn(int[] number) {

	int evenNumbers[];
	
	for(int count = 0; count < number.length; count++) {

	if(number[count] % 2 == 0) {
	evenNumbers++;
	}

	}
	return evenNumbers++;
	}

	

	public static int evenNumbersIn(int[] number) {

	int evenNumbers[];

	for(int count = 0; count < number.length; count++) {

	if(number[count] % 2 == 0) {
		evenNumbers = number[count];
		}
		}
	evenNumbers++;
		return evenNumbers;
	}

	


	public static int squareNumbersIn(int[] number) {

	int multiples[];

	for(int count = 0; count < number.length; count++) {
	
	multiples *= number[count];
	}
		multiples++;
	return multiples;
	}















	
