import java.util.ArrayList;
import java.util.Scanner;
	public class PizzaJointArrayListVersion {
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
				
		int[] sapaSize = {4, 2_000};
		int[] smallMoney = {6, 2_400};
		int[] bigBoys = {8, 3_000};
		int[] odogwu = {12, 4_200};

		int total = 0;
		String pizzaType = null;
		int numberToBuy = 0;
		int remainder = 0;	
		int price = 0;


		System.out.println("Number of people ");
		int numberOfPeople = input.nextInt();

		while(true) {
			System.out.println("Pizza size");
			pizzaType = input.next();

			if(pizzaType.equalsIgnoreCase("odogwu") ) {
				total = numberOfPeople  /  odogwu[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * odogwu[0];
				remainder = remainder - numberOfPeople;
				price = numberToBuy * odogwu[1];
				break;
			}		
			if(pizzaType.equalsIgnoreCase("sapa") ) {
				total = numberOfPeople  /  sapaSize[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * sapaSize[0];
				remainder = remainder - numberOfPeople;
				price = numberToBuy * sapaSize[1];
				break;

			}
			if(pizzaType.equalsIgnoreCase("smallmoney") ) {
				total = numberOfPeople  /  smallMoney[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * smallMoney[0];
				remainder = remainder - numberOfPeople;
				price = numberToBuy * smallMoney[1];
				break;

			}		
			if(pizzaType.equalsIgnoreCase("bigboys") ) {
				total = numberOfPeople  /  bigBoys[0];
				numberToBuy = total + 1;
				remainder = numberToBuy * bigBoys[0];
				remainder = remainder - numberOfPeople;
				price = numberToBuy * bigBoys[1];
				break;

			}
			else{
				System.out.print("\n");
				System.out.println("Error wrong input\nPlease try again");
			}
		}
		
		System.out.print("\n");
		System.out.println("Number of boxes of pizza to buy = " + numberToBuy);
		System.out.println("Number of left over slices = " + remainder);
		System.out.print("price = " + price);
																	
		}
}