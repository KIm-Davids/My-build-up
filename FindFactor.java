import java.util.Scanner;
	public class FindFactor {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int num1 = input.nextInt();

	int factor = 0;


	for(int i = 1; i <= num1; i++) {
	
	if(num1 % i == 0){
	
	System.out.print(factor);
	System.out.print("  ");
}
	factor += i;

	}
	
	}
}