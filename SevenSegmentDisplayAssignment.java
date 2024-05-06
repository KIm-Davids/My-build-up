import java.util.Arrays;
import java.util.Scanner;
	public class SevenSegmentDisplayAssignment {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] onOrOff = new int[2];
		int[] array = new int[10];
		
		System.out.println("Enter binary code");
		String binaryNumber = input.next();
	//	int	number = 0;
	//	int counter = 0;
		
	//	for(counter = 0; counter < binaryNumber.length(); counter++) {
	//		array[counter] = binaryNumber.charAt(counter) - '0';
	//		number = array[counter];
			//System.out.print(number);
		//}	
		while(binaryNumber.charAt(7) == '1' && binaryNumber.length() <= 8) {
		if(binaryNumber.charAt(0) == '1') {
		System.out.print("  AA\n");
		}
		else{
			System.out.print("\n");
		}
		if(binaryNumber.charAt(1) == '1' & binaryNumber.charAt(5) == '0') {
		System.out.print("    B\n");
		System.out.print("    B\n");
		System.out.print("    B\n");
		System.out.print("    B\n");
		}
		else{
			System.out.print(""); 
		}
	
		if(binaryNumber.charAt(1) == '1' & binaryNumber.charAt(5) == '1') {
		System.out.print("F    B\n");
		System.out.print("F    B\n");
		System.out.print("F    B\n");
		System.out.print("F    B\n");
		}
		else {
			  System.out.print("");
		}
		if(binaryNumber.charAt(6) == '1' & binaryNumber.charAt(1) == '0') {
		System.out.print("F\n");
		System.out.print("F    \n");
		System.out.print("F    \n");
		System.out.print("F    \n");
		}
		if(binaryNumber.charAt(6) == '1') {
		System.out.print("  GG\n");
		}
		
		if(
		binaryNumber.charAt(2) == '1' & binaryNumber.charAt(4) == '0') {
		System.out.print("    C\n");
		System.out.print("    C\n");
		System.out.print("    C\n");
		System.out.print("    C\n");
		}
		else {
			 System.out.print("");
		}
		if(binaryNumber.charAt(4) == '1' & binaryNumber.charAt(2) == '0') {
		System.out.print("E    \n");
		System.out.print("E    \n");
		System.out.print("E    \n");
		System.out.print("E    \n");
		}
		if(binaryNumber.charAt(2) == '1' & binaryNumber.charAt(4) =='1') {
		System.out.print("E    C\n");
		System.out.print("E    C\n");
		System.out.print("E    C\n");
		System.out.print("E    C\n");
		}
		else {
		System.out.print("");
		}
		
		//else {
		//	System.out.print("");
		//}
		if(binaryNumber.charAt(3) == '1') {
		System.out.print("  DD\n");
		}
		else {
		System.out.print("  ");
		}
		break;
	}
	
		
			//for 1
			
			
		
		
		
		
		//	if(onOrOff == 1) {
				
			
			
			
			
			
			
			
			
		
			
			
		
		
		}
	}
		
		
		