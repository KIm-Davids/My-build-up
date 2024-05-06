import java.util.Arrays;
import java.util.Scanner;
	public class SevenSegmentDisplayAssignment {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] onOrOff = new int[2];
		int[] array = new int[10];
		
		System.out.print("Enter binary code");
		String binaryNumber = input.next();
		int	number = 0;
		int counter = 0;
		
		for(counter = 0; counter < binaryNumber.length(); counter++) {
			array[counter] = binaryNumber.charAt(counter) - '0';
			number = array[counter];
			//System.out.print(number);
		}	
		
	
		onOrOff[0] = 0;
		onOrOff[1] = 1;
		
			//for a 
			
			
			if(array[0] == 1){
			System.out.println("\n___");
			}
			if(array[1] == 0) {
					System.out.print("");
			}
		
		
		
		
		//	if(onOrOff == 1) {
				
			
			
			
			
			
			
			
			
		
			
			
		
		
		}
	}
		
		
		