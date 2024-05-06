import java.util.Scanner;
	public class Demo1 {
		public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
		int number = 0;		

	while(number<=1000)
	   {
	     System.out.print("Enter a number: ");
		number = input.nextInt();
	   	number++;
	   }
		int sum = number + number;
		System.out.println("Good Work! ");
	}
}