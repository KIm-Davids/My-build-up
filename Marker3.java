import java.util.Scanner;
	public class Marker3 {
		public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int number1 = 1;

	System.out.print("Welcome to Student Grade");
	
	String prompt = """

	Enter 1 to Calculate Grade
	Enter 2 to exit
		""";

	String prompt1 = """
	Enter your name:
	""";

switch(number1) {
	case 1 -> {
	System.out.println("\nLoading\n" + prompt);
	int input1 = input.nextInt();

	System.out.println("\nEnter your name: ");
	String name = input.next();
	
	System.out.println("\nEnter your score 1: ");
	int num1 = input.nextInt();
	
	System.out.println("Enter your score 2: ");
	int num2 = input.nextInt();
	
	System.out.println("Enter score 3: ");
	int num3 = input.nextInt();
	
	int sum = num1 + num2 + num3;
		
	int amt1 = 40;
	int amt2 = 49;

	int amt3 = 50;
	int amt4 = 69;

	int amt5 = 70;
	int amt6 = 79;

	int amt7 = 80;
	int amt8 = 100;

	if (sum>= 0 && sum<=49) {
	System.out.print(name + "'s Final Grade is D, and your score is " + sum);
	}

	if(sum >= 50 && sum<69) {
	System.out.print(name +"'s Final Grade is C, and your score is " + sum);
		}
	
	if(sum>=70 && sum<=79) {
	System.out.print(name + "'s Final Grade is B, and your score is " + sum);
	}
	
	if(sum>=80 &&sum<=100) {
	System.out.print(name + "'s Final Grade is A, and your score is " + sum);
	}	

	if (sum>100){
	System.out.print("Invalid Score\nCannot calculate your score is " + sum);
	}				    

}
}
			

		
	

		}
	     }
	  
	
		