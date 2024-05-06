public class OddIndex {
	public static int indexNumber(int[] collectInput) {
	
	int counter = 0;
	int result = 0;


	for(counter = 1; counter < collectInput.length; counter+=2){
	result = collectInput[counter];
	}
	
	return result;
	}
}