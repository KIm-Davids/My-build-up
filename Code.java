import java.util.Scanner;
	public class Code {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Welcome, How many times would you like to play? ");
	int num1 = input.nextInt();


	int counter = 0;

	while(counter != num1 ) {

	System.out.print("Enter a number: ");
	int num2 = input.nextInt();

	if(num2 == 1) {
	System.out.println("0");
	}

	if(num2 == 0) {
	System.out.println("1");
	}

	counter++;
 	}
}






}