public class isPrimeNumber {
	public static boolean prime(int a) {

	boolean primedNumber = false;
		
	int factor = 0;

	for(int counter = 1; counter <= a/2; counter++) {
		
	if(a%counter == 0) {
	factor++;
	}
	
	}
	if(factor == 1) primedNumber = true;

	return primedNumber;

	}
}