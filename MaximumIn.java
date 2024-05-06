import java.util.Scanner;
public class MaximumIn {
	public static void main(String[] args) {
	//public static int maximum(int num1) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number");
	int num1 = input.nextInt();
		
	int array[] = {num1};
	
	int i;

	int max = array[0];

	for(i = 1; i < array.length; i++) {
	
	if(array[i] > max) {
	max = array[i];
		}
	}
	return max;
	}
}

