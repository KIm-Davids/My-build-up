public class ArrayTestFunction {
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

