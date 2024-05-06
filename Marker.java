import java.util.Scanner;
	public class Marker {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Score 1\n");
	int num1 = input.nextInt();
	
	System.out.print("Enter Score 2\n");
	int num2 = input.nextInt();
	
	System.out.print("Enter Score 3\n");
	int num3 = input.nextInt();
	
	int sum = num1 + num2 + num3;

	if (sum > 50) {
	System.out.print("Student Passed\nTotal score = " + sum);
	}
	
	if (sum < 50) {
	System.out.print("Student failed\nTotal score = " + sum);
	}
	
	}
}