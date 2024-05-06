public class FireDrill6 {
	public static void main(String[] args) {
	
	int i = 1;
	int multiples = 1;

	for(i = 1; i >= 10; ++i) {
	multiples *= i;
	if(4 % multiples == 0) {
	System.out.println(multiples);
		}
	    }
	}
}
	