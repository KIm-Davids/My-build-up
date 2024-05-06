import java.util.Scanner;
	public class EStoreProMax1 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to E-StorePro ");

		System.out.println("Please enter your name: ");
		String name = input.nextLine();
	
		System.out.println("Enter percentage to calculate: ");
		int percentage = input.nextInt();

		name = name;
		String applied = "applied";
		int i = 0;
		int total = 0;
		int cost = 0;
		double num1 = 0;
		
		
		do
		{
		System.out.println("Please enter cost for item " + i + " or -1 to quit" + ": " );	
		cost = input.nextInt();
		
		if(cost == -1) {
			break;	
	
		} 

		total += cost;

		i++;
                } while(cost != -1);
		
		
		if(total >= 200) {
			int num = total * percentage / 100;
			num1 = total - num;	
		}
		
	
		System.out.printf("Customer Name: %s%nNumber of Items bought: %d%nPercentage discount: %d%nOriginal Cost: %d%nDiscounted cost: %.0f%nThanks for your patronage !", name, i, percentage, total, num1);
	
	
	}
}