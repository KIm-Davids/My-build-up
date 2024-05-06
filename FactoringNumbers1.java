import java.util.Scanner;
	public class FactoringNumbers1 {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number to check the factor");
		int num1 = input.nextInt();

		FactorsOfNum1 factors = new FactorsOfNum1();
		
		int result = factors.factor(num1);
		System.out.print(result);
		}
}