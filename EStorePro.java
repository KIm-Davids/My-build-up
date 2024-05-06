import java.util.Scanner;
	public class EStorePro {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to E-StorePro ");

		System.out.println("Please enter your name: ");
		String name = input.nextLine();

		System.out.println("Enter total amount of items to calculate");
		int amountOfItems = input.nextInt();
	
		name = name;
		String applied = "applied";
		int i = 1;
		int total = 0;
		int cost = 1;
		double num1 = 0;
		double num2 = 0;

		while(i <= amountOfItems) {
		System.out.println("Please enter cost for item " + i + ": " );
		cost = input.nextInt();
	
		total += cost;


		i++;
}

		System.out.println("Enter percentage to calculate: ");
		int percentage = input.nextInt();
		

		if(total >= 200) {
			double num = total * percentage / 100;
			applied = " (Discount Applied)";
			num1 = total - num;	
}
			else {			
				applied = " (Discount Not applied)";
			
		
		}
	
	System.out.printf("Customer Name: %s%nNumber of Items bought: %d%nPercentage discount: %d%nOriginal Cost: %d%nDiscounted cost: %.2f%s%nThanks for your patronage !", name, amountOfItems, percentage, total, num1, applied);
	
	
}
}