import java.util.Arrays;
import java.util.Scanner;
public class SevenSegmentTester {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	String[][] column = {{" ___ ","___ ","___"}, {"_","_","_"},{"_","_","_"}};
	String[][] row = {{"|","|","|"},{"|","|","|"}};
	
	System.out.print("Enter binary code ");
	String number = input.next();
	
		
		
	
			if(number.equals("11111111")) {
			 System.out.print(" AA\n");
		   	 System.out.print("F  B\n");
			 System.out.print("F  B\n");
			 System.out.print(" GG\n");
			 System.out.print("E  C\n");
			 System.out.print("E  C\n");
			 System.out.print(" DD\n");
			}
			
			
			
			if(number.equals("11111101")) {
		     System.out.print(" AA\n");
		   	 System.out.print("F  B\n");
			 System.out.print("F  B\n");
		//	 System.out.print(" GG\n");
			 System.out.print("E  C\n");
			 System.out.print("E  C\n");
			 System.out.print(" DD\n");
			}
			
			
			if(number.equals("01100001")) {
		     System.out.print("    A\n");
		   	 System.out.print("  A B\n");
			 System.out.print("    B\n");
		//	 System.out.print(" GG\n");
			 System.out.print("    C\n");
			 System.out.print("    C\n");
			 System.out.print("    D\n");
			}
			if(number.equals("11011011")) {
			 System.out.print(" AA\n");
		   	 System.out.print("   B\n");
			 System.out.print("   B\n");
			 System.out.print(" GG\n");
			 System.out.print("E   \n");
			 System.out.print("E   \n");
			 System.out.print(" DD\n");
			}
			
			if(number.equals("11110011")) {
			 System.out.print("  AA\n");
		   	 System.out.print("    B\n");
			 System.out.print("    B\n");
			 System.out.print("  GG\n");
			 System.out.print("    C\n");
			 System.out.print("    C\n");
			 System.out.print("  DD\n");
			}
			
			if(number.equals("01100111")) {
			 System.out.print(" \n");
		   	 System.out.print("F  B\n");
			 System.out.print("F  B\n");
			 System.out.print(" GG\n");
			 System.out.print("   C\n");
			 System.out.print("   C\n");
			 System.out.print("   \n");
			}
			
			if(number.equals("10110111")) {
			 System.out.print("  AA\n");
		   	 System.out.print(" F   \n");
			 System.out.print(" F   \n");
			 System.out.print("  GG\n");
			 System.out.print("    C\n");
			 System.out.print("    C\n");
			 System.out.print("  DD\n");
			}
			
			if(number.equals("10111111")) {
			 System.out.print(" AA\n");
		   	 System.out.print("F   \n");
			 System.out.print("F   \n");
			 System.out.print(" GG\n");
			 System.out.print("E  C\n");
			 System.out.print("E  C\n");
			 System.out.print(" DD\n");
			}
			
			if(number.equals("11100001")) {
			 System.out.print(" AA\n");
		   	 System.out.print("   B\n");
			 System.out.print("   B\n");
			 System.out.print("   \n");
			 System.out.print("   C\n");
			 System.out.print("   C\n");
			 System.out.print("  \n");
			}
			
			if(number.equals("11110111")) {
			 System.out.print(" AA\n");
		   	 System.out.print("F  B\n");
			 System.out.print("F  B\n");
			 System.out.print(" GG\n");
			 System.out.print("   C\n");
			 System.out.print("   C\n");
			 System.out.print(" DD\n");
			}
			
		
			
	if(number.equals("11101111")) {
	System.out.print("""
						 XX
						X  X
						X  X
						 XX  
						X  X
						X  X
						  
						 """);
			}
			
			
	if(number.equals("00111111")) {
	System.out.print("""
						 
						X  
						X  
						 XX  
						X  X
						X  X
						 XX 
						 """);
			}
			
			
		if(number.equals("10011101")) {
		System.out.print("""
								 XX
								X  
								X  
								   
								X  
								X  
								 XX 
								 """);
					}
					
	if(number.equals("00011011")) {
	System.out.print("""
						 
						  
						  
						 XX  
						X  
						X  
						 XX 
						 """);
			}
		}
	}	
