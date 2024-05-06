import java.util.Scanner;
public class SevenSegmentTest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter binary code");
	String number = input.next();
	
	System.out.print(performFunction(number));
	}
	}