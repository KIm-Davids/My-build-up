import java.util.Scanner;
	public class TaskSeven {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int counter = 1;
		int sum = 0;
		int average = 0;
		int evenIndexes = 0;	
		


		for(counter = 2; counter <= 10; counter++) {

		System.out.print("Enter a number");
		int userInput = input.nextInt();
		
		sum += userInput

		evenIndexes += userInput;
			
		}



		average = sum / 10;

		//System.out.println(sum);
		System.out.println(average);
		System.out.print(sum);
		
	
	
		

	}
}