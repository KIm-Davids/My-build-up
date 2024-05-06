public class Task6 {
	public static void main(String[] args) {
	
	int i = 1;
	int j = 1;
	int multiples = 1;
	int multiples1 = 1;

	for(i = 4; i <= 10; i++) {
	for(j = 1; j <= 5; j++){
	if(multiples == 1024) {
	break;
	}
	multiples *= i;
	System.out.print(" " + multiples);
	}
		
	    }
	for(i = 8; i <= 10; i++) {
	for(j = 1; j <= 5; j++){
	if(multiples1 == 32768) {
	break;
	}
	multiples1 *= i;
	System.out.print(" " + multiples1);
	}

	}
	




	}
}
	