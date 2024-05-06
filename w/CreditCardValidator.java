import java.util.Scanner;
	public class CreditCardValidator {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Hello, Kindly Enter Card details to verify");
		char number = input.next().charAt(0);

		int checkNumber = Character.getNumericValue(number);

		if(number.length() > 2) {
			firtTwoChars = input.substring(0, 4);
		} else {
			firstFourChars = input;
		}
		System.out.println(firstFourChars);
		

		if(checkNumber == 4) {
		System.out.print("This is a Visa Card");
		}
	

		if(checkNumber == 5) { 
		System.out.print("This is a MasterCard");
		}

		if(checkNumber == 6) {
		System.out.print("This is a Discover Card");
		}
		



		
	
		}
}