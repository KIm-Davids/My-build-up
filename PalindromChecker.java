import java.util.Scanner;
public class PalindromChecker {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);	

	System.out.print("Enter 5 number");
	int userInput = input.nextInt();	
	
	Palindrome checkNumber = new Palindrome();
	boolean result = checkNumber.pal(userInput );
	System.out.println(result);
	}
}