public class OddIndex {
	public static int[] indexNumber(int[] collectInput) {
	
	int counter = 0;
	int results = 0;
	int result = 0;
	int[] finalResult = new int[10];

	for(counter = 0; counter < 10; counter = counter++){
	if(counter % 2 == 0) {
	finalResult[counter] = collectInput[counter];
	}
	}
	
	return finalResult[counter];
	}
}