import java.util.Scanner;
public class SortArray {
	public static void main(String[] main) {

	Scanner input = new Scanner(System.in);

	int[] array = {1,2,3,4,5,6,7,8,9};


	System.out.print("Enter a number");
	int number = input.nextInt();

	for(int n : array)
	if(number == n) {
	System.out.println("The number is here and the number is " + number);
	
	for(int j : array)
	if(number != j) {
	System.out.println("The number is not here pls try again");
		}
}
	}
}

