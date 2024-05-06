public class TaskFourCopy {
	public static void main(String[] args) {
	
	int i = 0;
	int j = 0;
	int k = 0;
	int h = 0;
	int multiples = 1;
	int multiples1 = 1;

	for(i = 1; i <= 5; i++) {
		if(i % 4 == 0) {
	for(j = 1; j <= 5; j++) {
	multiples *= i;
		System.out.print("  " + multiples);
		}
	     }
	}

	for(k = 1; k <= 8; k++) {
		if(k % 8 == 0) {
	for(h = 1; h <= 5; h++) {
	multiples1 *= k;
		System.out.print("  " + multiples1);
			}
		}
	}






    }
}