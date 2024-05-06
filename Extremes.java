import java.util.Scanner;
	public class Extremes {
		public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("How many numbers will we be calculating? ");
	int num = input.nextInt();


	for (int counter = 0; counter==num; counter++) {

	System.out.print("Enter 10 numbers: ");
	int num1 = input.nextInt();

	System.out.print("Enter 10 numbers: ");
	int num2 = input.nextInt();

 	int max = Math.max(num,num2);
	int min = Math.max(num,num2);
	
	if(num > num2 ) {
	System.out.print(num);
	}

	if(num <= num2) {
	System.out.print(num);
	}



}
}
}
	

	