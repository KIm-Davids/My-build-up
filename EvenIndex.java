public class EvenIndex {
	public static int evenIndex(int[] collectInput) {
	
	int counter = 0;
	int result = 0;	


	for(counter = 0; counter < collectInput.length; counter = counter + 1) {
	
	result += collectInput[counter];
	}
	
	return result;
	}
}