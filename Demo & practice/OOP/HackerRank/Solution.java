import java.util.Scanner;
public class Solution{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Arithmetic addition = new Arithmetic();

		System.out.print("Enter first number");
		int numberOne = input.nextInt();

		System.out.print("Enter secod number");
		int numberTwo = input.nextInt();

		System.out.print(addition.add(numberOne, numberTwo));

		}
}