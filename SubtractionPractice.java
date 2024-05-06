import java.util.Scanner;
//import static SubtractionMethod.sub;
	public class SubtractionPractice {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first numbers ");
		int num1 = input.nextInt();

		System.out.println("Enter second number ");
		int num2 = input.nextInt();
	
		
		int result = SubtractionMethod.sub(num1,num2);

		System.out.print(result);
		}
}	
	