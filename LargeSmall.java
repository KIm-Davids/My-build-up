import java.util.Scanner;	
	public class LargeSmall {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int userInput = input.nextInt();
	
	System.out.println("Enter a number");
	int userInput1 = input.nextInt();
	
	System.out.println("Enter a number");
	int userInput2 = input.nextInt();


	int sum = userInput + userInput1 + userInput2;
	

	int average = sum / 3;

	int product = userInput * (userInput1 * userInput2);
	
	int smallest = userInput;
	int largest = userInput;


	if(userInput1 < smallest) {
	smallest = userInput1;
	}

	if(userInput2 < smallest) {
	smallest = userInput2;
	}


	if(userInput2 > largest) {
	largest = userInput2;
	}

	if(userInput2 > largest) {
	largest = userInput2;
	}

	System.out.println("The sum is = " + sum);
	System.out.println("The average is = " + average);
	System.out.println("The product is = " + product);
	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is: " + largest);	



	}
}