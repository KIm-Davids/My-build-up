public class kata {

public static float div(float a, float b){


public class Palindrome {
	public static boolean pal(int a) {
	
	
	boolean answer = false;

	int b = a / 10000 % 100 % 10;
	int c = a / 1000 % 100;
	int d = a / 100 % 10;
	int e = a / 10 % 10;
	int f = a % 10;


	if(b == f) {
	answer = true;
	}
	if(b != f) {
	answer = false;
	
	}

	return answer; 

	
	}
}
	
	

public class DivideDigits {
	public static float div(float a, float b) {
	
	float divide = a / b;
	
	return divide;

}
	
	
}


public class SubtractingDigits {
	public static int sub(int a, int b) {

	int subtract = a - b;
	if(subtract < 0) {
	result = subtract
	}
	

	return result;
	}
}


public class FactorsOfNum1 {
	public static int factor(int num1) {

	int factor = 0;
	for(int counter = 1; counter <= num1; counter++){
		if(num1 % counter == 0){
			factor++;		
		}
		}
		
	return factor;	
	}
}



public class evenNumbersMethod1 {
	public static boolean bool(int a) {
	
		boolean b = false;

		if(a % 2 == 0) {	
		b = true;
		}
		
		if(a % 2 == 1) {
		b = false;
		}
		return b;
	}
}

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


public class Palindrome {
	public static boolean pal(int a) {
	
	
	boolean answer = false;

	int b = a / 10000 % 100 % 10;
	int c = a / 1000 % 100;
	int d = a / 100 % 10;
	int e = a / 10 % 10;
	int f = a % 10;


	if(b == f) {
	answer = true;
	}
	if(b != f) {
	answer = false;
	
	}

	return answer; 

	
	}
}
	
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









