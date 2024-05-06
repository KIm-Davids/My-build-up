import java.util.Scanner; 
	public class NaturalNumbers1 {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO THE COUNTER GAME!!!\nENTER ANY NUMBER TO CONTINUE");
	int num1 = input.nextInt();

	int naturalNumbers = 0;
	int count = 0;
	int sum = 0;


	while(naturalNumbers != 10) {

	System.out.println("Enter a number");
	num1 = input.nextInt();

	if(num1 >= 1) {
	    naturalNumbers++;
	}
	
	sum = num1 + naturalNumbers;	

	count++;
	num1++;
	
 		}
	System.out.print("The total number = " + sum);
	}
}	