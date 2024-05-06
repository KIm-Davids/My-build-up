public class isPrimeNumber {
	public static boolean prime(int a ) {

	int factor = 0;
	boolean primedNumber = false;

	for(int counter = 1; counter <= a/2; counter++) {
	
	if(a % counter == 0) {
	factor++;
	}
		
	if(factor == 1) {
	primedNumber = true;
	}
	else {
	primedNumber = false;
	}
      }
	return primedNumber;
    }
}