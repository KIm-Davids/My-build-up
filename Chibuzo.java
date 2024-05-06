import java.util.Scanner;
public class Chibuzo {
public static void main(String... args) {

	String prompt = """
	Hi, Welcome 
	Press
	1-> For English
	2-> For Yoruba 
	3-> For Hausa
	""";
	
	System.out.println(prompt);
	Scanner keyboardInput = new Scanner(System.in);
	int userInput = keyboardInput.nextInt();

switch(userInput) {
		case 1 -> System.out.println("Selected English");
		
		case 2 -> System.out.println("Selected Yoruba");

		case 3 -> System.out.println("Selected Hausa");

		default -> System.out.println("You no wise");
}

String prompt1 = """
	
	Press
	1-> Select 1 to transfer
	2-> Selcet 2 to deposits
	3-> Select 3 to check balance
	""";
	
	System.out.println(prompt1);
	Scanner keyboardInput1 = new Scanner(System.in);
	int userInput1 = keyboardInput.nextInt();

switch(userInput1) {
		case 1 -> System.out.println("Transfer Successful");
		
		case 2 -> System.out.println("Deposit Successful");

		case 3 -> System.out.println("Balance - $10,000,000");

		default -> System.out.println("You no wise");


		}
	}
}

