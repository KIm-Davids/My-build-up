import java.util.Scanner;
import java.util.ArrayList;
	public class CreditCardCopy1 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, kindly enter your card details to verify");
		String number = input.next();

		int total = 0;
		int counter = 0;
		int result = 0;
		int[] array = new int[number.length()];
		char[] theTwoDigits = new char[3];
		int multipliedNumber = 0;
		int collectedNumber = 0;
		int sum = 0;
		int sumOfSecondNumber = 0;
		int theResult = 0;
		int sumTotal = 0;
		int oddNumbers = 0;





		for(counter = 0; counter < number.length(); counter+=2) {
			

			array[counter] = number.charAt(counter) - '0';
			result = array[counter] * 2;
			total = result * 2;

			if(total % 2 == 1) {
			//oddNumbers += total;
			}			
		
			
			
			collectedNumber += total;

			
			if(total >= 10) {

			while(total != 0){

			int hold = total % 10;
			sum = sum + hold;
			total /= 10;
			}
			}



			System.out.println();
			
			sumTotal = collectedNumber + sum;
			
			System.out.println(collectedNumber);
		}
			
		
			
			
				
			
		
		

		char firstNumber = number.charAt(0);
		char secondNumber = number.charAt(1);

		System.out.println("***************************************");

		if(number.length() != 13 && number.length() != 16) {
		System.out.println("**Credit Card Type: Invalid Card");
		}

		if(firstNumber == '3' && secondNumber == '7') {
		System.out.println("**Credit Card Type: American Express Card");
		}		

		if(firstNumber == '4') {
		System.out.println("**Credit Card Type: Visa Card");
		}

		

		if(firstNumber == '6') {
		System.out.println("**Credit Card Type: Discover");
		}
				
	


		if(firstNumber == '5') {
		System.out.println("**Credit Card Type: MasterCard");
		}
		System.out.println("**Credit Card Number: " + number);
		System.out.println("**Credit Card Digit Length: " + number.length());
		
		if(sumTotal % 10 == 0) {
		System.out.print("**Credit Card Validity Status: Valid");
			}
		else {
		System.out.println("**Credit Card Validity Status: Invalid");
			}

		
		System.out.println("******************************************");
		
		
		





		}
	}	