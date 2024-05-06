import java.util.Scanner;
	public class ArrayPracticeJenny {
		public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		String[] array = new String[6];
				
		int counter = 0;
		
		for(counter = 0; counter < array.length; counter++) {


		System.out.println("Enter the names");
		array[counter] = input.next();
		String names = array[counter];
		
		

		}
		for(counter = 0; counter < array.length; counter++){

		System.out.println(array[counter]);
		}
		
		
		}
}