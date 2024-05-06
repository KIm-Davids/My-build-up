import java.util.Scanner;
	public class TaskThree {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num2 = 0;
		int counter= 0;
		int sum= 0;
		int num1 = 0;
		int num3 = 0;
		int sum2 = 0;


		for(counter= 2; counter<= 10; counter++) {

		System.out.print("Enter a number: ");
		num1 = input.nextInt();


		sum += num1;
		}

		num3 = sum /2;
		num2 = sum / 10;
		
		//System.out.println(sum);
		//System.out.println(num2);
		System.out.print(sum);
		
	}
}