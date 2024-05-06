public class MultiplicationTable {
	public static void main(String[] arg) {


	int result = 0;
	
	for(int counter = 1; counter <= 12; counter++) {
	System.out.println("\t\t");
	//
	

	for(int count = 1; count <= 12; count++) {

	result = count * counter;
	
	System.out.printf("%d X %d = %d\t", counter, count, result);
		}
	
}
}
}