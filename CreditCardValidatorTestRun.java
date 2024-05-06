import java.util.Scanner;
	public class CreditCardValidatorTestRun {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Hello, Kindly Enter Card details to verify");
		String number = input.next();

		int[] array = new int[number.length()];

		int total = 0;
	 		
		int counter = 0;
		if(number.length() != 16 && number.length() != 13) {
		System.out.println("Invalid input");
		}

		

		for(counter = 0; counter< array.length(); counter++) {
		
		array[counter] = number.charAt(counter)-'0';

		
		for(counter = array.length-2; counter >= 0; counter -= 2) {
		if(array[counter] * 2 < 9) {
		total += array[counter] * 2;  
		}
		else {
		total += (array[counter]*2 / 10) + (array[counter]*2 % 10); 
		}
		} 	

		
		for(counter = array.length-1; counter >= 0; counter -= 2) {
		
		total += array[counter];  
		}


		if(number.charAt(0) == 3 && number.charAt(1) == 7) {
		System.out.print("This is an American Express Cards");
		}
		if(number.charAt(0) == 4) {
		System.out.print("visa Card");
		}

		if(number.charAt(0) == 5) {
		System.out.print("MasterCard");
		}
		if(number.charAt(0) == 6) {
		System.out.print("Discover Card");
		}
	
		}


		
		if(total % 10 == 0) {
		System.out.print("Valid Card");
		}

		else { 
		System.out.print("Invalid Card");
		}
		

				
		//System.out.print(total);

				
		//4388576018402626

		//4388576018410707
		}
}