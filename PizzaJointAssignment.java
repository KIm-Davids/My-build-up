import java.util.ArrayList;
import java.util.Scanner;
	public class PizzaJointAssignment {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
				
		int[] sapaSize = {4, 2_000};
		int[] smallmoney = {6, 2_400};
		int[] bigBoys = {8, 3_000};
		int[] odogwu = {12, 4_200};

		int total = 0;
		String pizzaType = null;
		int numberToBuy = 0;
		int remainder = 0;	
		int price = 0;


		System.out.print("""

		PIZZA\t   NUMBER OF SLICES\tPRICE PER BOX
		Sapa size\t4\t\t2,000
		Small Money\t6\t\t2,400
		Big boys\t8\t\t3,000
		Odogwu\t\t12\t\t4,200

			""");

		System.out.println("Number of people ");
		int numberOfPeople = input.nextInt();
	
	


		while(true) {
			System.out.println("Pizza size");
			pizzaType = input.next();


			if(pizzaType.equals("odogwu") & numberOfPeople % 12 > 0) {
				odogwuRemainder(numberOfPeople);
				break;
				}
												
			if(pizzaType.equals("odogwu") & numberOfPeople % 12 == 0) {
				odogwu(numberOfPeople);
				break;
			}

			if(pizzaType.equalsIgnoreCase("sapa") & numberOfPeople % 4 > 0 ) {
				sapaRemainder(numberOfPeople);
				break;
			
			}
			
			
			if(pizzaType.equalsIgnoreCase("sapa") & numberOfPeople % 4 == 0) {
				sapa(numberOfPeople);
				break;
			
			}
			if(pizzaType.equalsIgnoreCase("bigboys") & numberOfPeople % 8 > 0 ) {
				bigboys(numberOfPeople);
				break;
			
			}


			if(pizzaType.equalsIgnoreCase("bigboys") & numberOfPeople % 8 == 0) {
				bigboys(numberOfPeople);
				break;
			
			}
			

			if(pizzaType.equalsIgnoreCase("smallmoney") & numberOfPeople % 6 > 0 ) {
				smallMoney(numberOfPeople);
				break;
			
			}

			if(pizzaType.equalsIgnoreCase("smallmoney") & numberOfPeople % 6 == 0) {
				smallMoneyRemainder(numberOfPeople);
				break;
			
			}
			

			else {			
				System.out.print("\n");
				System.out.println("Error wrong input\nPlease try again");
			}
		
		}
	}


			public static void odogwu(int collectInput) {
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] odogwu = {12, 4_200};
	
				total = collectInput  /  odogwu[0];
				price = total * odogwu[1];
				System.out.println("Number of boxes of pizza to buy = " + total);
				System.out.print("price = " + price);
			}	

			public static void odogwuRemainder(int collectInput) {
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] odogwu = {12, 4_200};


				total = collectInput  /  odogwu[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * odogwu[0];
				remainder = remainder - collectInput;
				price = numberToBuy * odogwu[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + numberToBuy);
				System.out.println("Number of left over slices = " + remainder);
				System.out.print("price = " + price);
				
			}

			public static void sapa(int collectInput) {
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] sapaSize = {4, 2_000};

				total = collectInput  /  sapaSize[0];
				price = total * sapaSize[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + total);
				System.out.print("price = " + price);

			}

			public static void sapaRemainder(int collectInput) {
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] sapaSize = {4, 2_000};

				total = collectInput  /  sapaSize[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * sapaSize[0];
				remainder = remainder - collectInput;
				price = numberToBuy * sapaSize[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + numberToBuy);
				System.out.println("Number of left over slices = " + remainder);
				System.out.print("price = " + price);

			}
			

			public static void bigboys(int collectInput){
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] bigBoys = {8, 3_000};
	
				total = collectInput  /  bigBoys[0];
				price = total * bigBoys[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + total);
				System.out.print("price = " + price);
		
			}
		
			public static void bigboysRemainder(int collectInput){
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] bigBoys = {8, 3_000};

				total = collectInput  /  bigBoys[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * bigBoys[0];
				remainder = remainder - collectInput;
				price = numberToBuy * bigBoys[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + numberToBuy);
				System.out.println("Number of left over slices = " + remainder);
				System.out.print("price = " + price);

			}


			public static void smallMoney(int collectInput){
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] smallMoney = {6, 3_000};

				total = collectInput  /  smallMoney[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * smallMoney[0];
				remainder = remainder - collectInput;
				price = numberToBuy * smallMoney[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + numberToBuy);
				System.out.println("Number of left over slices = " + remainder);
				System.out.print("price = " + price);

			}

			public static void smallMoneyRemainder(int collectInput){
				int total = 0;
				String pizzaType = null;
				int numberToBuy = 0;
				int remainder = 0;	
				int price = 0;
				int[] smallMoney = {6, 3_000};

				total = collectInput  /  smallMoney[0];
				price = total * smallMoney[1];
				System.out.print("\n");
				System.out.println("Number of boxes of pizza to buy = " + total);
				System.out.print("price = " + price);
			}
				















		
		
							
		
}