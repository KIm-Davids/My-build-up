import java.util.Scanner;
	public class RaisePower {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	System.out.print("Enter a second number: ");
	int num2 = input.nextInt();


	int result = 1;
	int i = 1;

	for(i = 1; i <= num1; i++) {
	
	 result *= num1;	
}
	System.out.println("The final answer is " + result);
		
	}
}