import java.util.Scanner;
	public class GetNumbers {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of times to calculate");
		int num1 = input.nextInt();

		int i = 0;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		int num = 0;



			while(num != -1) {
			System.out.print("Enter a number to check");
			num = input.nextInt();
			
			

			
			if(num >= 1) {	
			positive++;
			}
	
			if(num < -1) {
			negative++;
			}

			if(num == 0) {
			zero++;
			}	
			i++;
			}
			System.out.println("Positive numbers = " + positive);
			System.out.println("Negative numbers = " + negative);
			System.out.println("Zero numbers = " + zero);	
					
      }
}











