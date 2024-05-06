import java.util.Scanner;
	public class FactoringNumbers2 {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number to check the factor");
		int num1 = input.nextInt();

		FactorsOfNum1 findfactors = new FactorsOfNum1();
		
		int result = findfactors.factor(num1);
		System.out.println(result);
		}
}