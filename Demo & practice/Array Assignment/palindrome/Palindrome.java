
public class Palindrome {
	public static boolean pal(int a) {
	
	
	boolean answer = false;

	int b = a / 10000 % 100 % 10;
	int c = a / 1000 % 100;
	int d = a / 100 % 10;
	int e = a / 10 % 10;
	int f = a % 10;


	if(b == f && c == e) {
	answer = true;
	}
	if(b != f && c != e) {
	answer = false;
	
	}

	return answer; 

	
	}
}
	
	