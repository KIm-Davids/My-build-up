import java.util.Scanner;
	public class HelloWorld {
		public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	int num = input.nextInt();


	for (int counter = 1; counter <= num; ++counter) {
		if (num % counter == 0) {
		int sum = counter +1;
		System.out.println(sum + " "); 
	    }
	}
    }
}