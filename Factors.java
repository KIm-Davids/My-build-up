import java.util.Scanner;
	public class Factors {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num1 = input.nextInt();

	int factor = 1;
	int counter = 0;

	for(factor = 1; counter<=num1; factor++) {	
 	if(num1 % factor == 0) {
	System.out.print("   " + factor);
	factor = factor + 1;
	}
	counter = counter + 1;
       }
     }
}