public class Task8 {
	public static void main(String[] args) {
	
	int i = 1;
	int j = 1;
	int multiples = 1;
	int multiples1 = 1;
	int sum = 0;
	int sum1 = 0;

	for(i = 4; i <= 10; i++) {
	for(j = 1; j <= 5; j++){
	if(multiples == 1024) {
	break;
	}
	multiples *= i;
	sum += multiples;
	if(sum == 1364) {
	
	}
	}
		
	    }
	for(i = 8; i <= 10; i++) {
	for(j = 1; j <= 5; j++){
	if(multiples1 == 32768) {
	break;
	}
	multiples1 *= i;
	sum1 += multiples1;
	if(sum1 == 37448){
	
	}

	}

	}
	int result = sum + sum1;	
	System.out.println(result);




	}
}
	