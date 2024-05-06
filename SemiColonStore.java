import java.util.Scanner;
public class SemicolonStore {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//System.out.println("What is the customer's Name ?");
	  	//String customerName = input.next();

	   	String customerName = askCustomerName();
		String userBuy = questionUserBuy();
                double perUnit = howManyPieces();
		int howManyUnit = howManyUnit();
                addMoreItems();
              	double discount = discountAmount();


                 System.out.print(
                """
                 SEMICOLON STORES
                 MAIN BRANCH
                 LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                 TEL: 03293828343 
                """); 
                 System.out.println("Customer name: " + customerName);
   	      }
       		public static String askCustomerName(){
         	Scanner input = new Scanner(System.in);
          	System.out.println("What is the customer's Name ?");
	  	String customerName = input.next();
                return customerName; 
                }

		private static String questionUserBuy() {
		Scanner input = new Scanner(System.in);
		System.out.println("What did the user buy ?");
		String userBuy = input.next();
	         return userBuy;
                }

		private static double howManyPieces() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many pieces? ");
		int howManyPieces = input.nextInt();
                 return howManyPieces;
	      }


		private static int howManyUnit() {
		Scanner input = new Scanner(System.in);
		System.out.println("How much per unit? ");
		int howManyUnit = input.nextInt();
                return howManyUnit;
               }
		private static void addMoreItems() {
		Scanner input = new Scanner(System.in);
		System.out.println("Add more items? ");
		String addMoreItems = input.next();
	
	



		if(addMoreItems.equals("yes")) {
			questionUserBuy();
		}
		if(addMoreItems.equals("no")) {
			cashierName();
		}


		}


		private static void cashierName() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name? (Cashier name)");
		String cashierName = input.next();
			
		}


		private static double discountAmount() {
		Scanner input = new Scanner(System.in);
		System.out.println("How much discount will he get? ");
		double discount = input.nextDouble();
		return discount;
		}
		

		

   }