public class isSquare {
	public static boolean sqrt(double num) {

	boolean sqrdNumber = false;

	for(int counter = 1; counter * counter <= num; counter++) {

	if(counter * counter == num) {
	sqrdNumber = true;
	}
	if(counter * counter != num) {
	sqrdNumber = false;
	}
	}

	return sqrdNumber;

	
	}
}	