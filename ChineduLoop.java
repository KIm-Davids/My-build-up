public class ChineduLoop {
	public static void main(String[] args) {



	int[] array = {1,2,5,3,5};

	int j = 0;
	int counter = 0;

	int maxFrequency = 0;

	for(counter = 0; counter < array.length; counter++) {
	

	for(j = 0; j < array[counter]; j++) {

	if(array[j] == array[counter]) {
		maxFrequency = array[j];
	}
	}
	
	}

	System.out.print("The highest frequency is: " + maxFrequency);
	
}	
}