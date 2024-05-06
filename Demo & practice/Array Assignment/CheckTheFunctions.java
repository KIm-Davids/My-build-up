import java.util.Scanner;
	public class CheckTheFunctions {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		
		int i = 0;

		int[] numbers = new int[10];

		
		System.out.print("Enter a number");
		

		for(i = 0; i<numbers.length; i++){

		numbers[i] = input.nextInt(); 
		}

		
		//int result = ArrayTest.maximumIn(numbers);

		System.out.print("The highest number is: " + numbers[i]);

		

			
		}
}
		