import java.util.Scanner;
import java.security.SecureRandom;

	public class randomNumber {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Welcome to Guess game\nPlease Enter a number to continue ");
	int num2 = input.nextInt();
	

	SecureRandom randomNumbers = new SecureRandom();
	int randomValue = randomNumbers.nextInt(101);
	
	int num3 = (randomValue);
	int num5 = randomValue % 3;
	int num4 = 100;

	int playGame = 1;

	while(true) {
	System.out.println("\nEnter your lucky number");
	int num1 = input.nextInt();
	

	if(num1 < num3) {
	System.out.println("Oh too low, pls try again");
		
	}

	if(num1 > num3) {
	System.out.println("Oh too high, pls try again");
	}

	if(num1 == num3) {
	System.out.println("You are correct, welldone");
	break;
	}

	if (num1 != num3) {
	System.out.print("You have missed this round, Number Updated! " + num5);
	}
	
	else {
	System.out.print("Pls Try Again");
	}

	playGame++;

	

	
	
}
	
}
}
	

	