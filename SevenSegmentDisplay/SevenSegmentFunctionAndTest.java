import java.util.Scanner;
public class SevenSegmentFunctionAndTest {
	public static String performFunction(String collectInput) {
	
	String[] array = new String[9];
	
	
	if(collectInput.charAt(0) == 1){
	System.out.print(" AA\n");
	}
	
	if(collectInput.charAt(1) == 1){
	System.out.print("   B\n");
	System.out.print("   B\n");	
	}
	
	if(collectInput.charAt(2) == 1) {
	System.out.print("   C\n");
	System.out.print("   C\n");
	}
	 
	if(collectInput.charAt(3) == 1) {
	System.out.print(" DD\n");
	}
	
	if(collectInput.charAt(4) == 1) {
	System.out.print("E   \n");
	System.out.print("E   \n");
	}
	
	if(collectInput.charAt(5) == 1) {
	System.out.print("F   \n");
	System.out.print("F   \n");
	}
	
	if(collectInput.charAt(6) == 1) {
	System.out.print(" GG\n");
	}
		return collectInput;
	}
	
	




	//public class SevenSegmentTest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter binary code");
	String number = input.next();
	
	System.out.print(performFunction(number));
	}
	}