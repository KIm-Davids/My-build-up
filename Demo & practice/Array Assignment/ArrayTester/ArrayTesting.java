public class ArrayTesting {
	
	public static int minimumIn(int[] collectInput) {
	
	int minimum = 0;
	
	for(int count = 0; count < collectInput.length; count++) {
		if(collectInput[count] < minimum) {
			minimum = collectInput[count];
		}
	}
		return minimum;
}
}
