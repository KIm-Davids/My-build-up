public class MinimumAndMaximumNumber {
	public static int[] minimumAndMaximum(int[] collectInput) {
	
	int maximum = 0;
	int minimum = collectInput[0];
	int counter = 0;

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
}