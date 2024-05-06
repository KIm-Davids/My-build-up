import java.util.Scanner;
	public class EStoreCollections {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);


		System.out.println("Welcome to E-StorePro ");
	
		System.out.println("Please enter Customer name: ");
		String name = input.next();

		System.out.println();
	
		String[] items = new String[4];
		int[] price = new int[4];

		int i = 1;
		int total = 0;
		double discount = 0;
		double calculateDiscount = 0;

		for(i = 1; i <=3; i++) {
		System.out.println("What is the name of the item? ");
		items[i] = input.next();
		 		
		System.out.println("How much is it ?");
		price[i] = input.nextInt();
		
		total += price[i];

		
		}		

		System.out.println();
		System.out.printf("Customer Name: %s%n", name);
		System.out.println("Total item" + "\t" + "cost");
		System.out.println(items[1] + "\t\t" + price[1]);
		System.out.println(items[2] + "\t\t" + price[2]);
		System.out.println(items[3] + "\t\t" + price[3]);

		System.out.println();
		System.out.println("Total cost = " + total);
		System.out.println();

		if(price[1] > 200) {
		
		calculateDiscount = total * 0.10;
		discount = total - calculateDiscount;
		
		System.out.println("Discounted cost: " + discount);
		System.out.println("Thanks for your patronage!");
		}

		if(price[1] <= 200) 
		
		System.out.println("""
		Discount = 0.0
		Thanks for your patronage!""");
		
				
		
		
				

		}
}