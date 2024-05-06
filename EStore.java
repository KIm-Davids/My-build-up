import java.util.Scanner;
	public class EStore {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to E-Store ");

		System.out.println("Please enter your name: ");
		String name = input.nextLine();
	
		name = name;
		String applied = "Applied";
		String notApplied = "Discount Not Applied";
		int i = 1;
		int total = 0;
		int cost = 1;
		double num1 = 0;
		double num2 = 0;

		while(i <= 10) {
		System.out.println("Please enter cost for item " + i + ": " );
		cost = input.nextInt();
	
		total += cost;


		i++;


		if(total >= 200) {
			double num = total * 0.10;
			applied = " (Discount Applied)";
			num1 = total - num;	
}
			else {
				applied = " (Discount Not Applied)";

		
		}
	}
	System.out.printf("Customer Name: %s%nOriginal cost: %d%nDiscounted cost: %.2f%s%nThanks for your patronage !", name, total, num1, applied);
	
	
}
}