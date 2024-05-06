public class ChibuzoClasswork {
	public static void main(String[] args) {
		

	int[] array = {5,2,1,4,5};
		
	int maximum = 0;
	int minimum = array[0];

	for(int counter = 0; counter < array.length; counter++) {
		
	if(array[counter] < minimum) {
	minimum = array[counter];
	}

	if(array[counter] > maximum) {
	maximum = array[counter];
	}
	}
	System.out.println("The maximum is " + maximum);
	System.out.print("The minimum is " + minimum);
	
}
}