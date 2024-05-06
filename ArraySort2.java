import java.util.Arrays;
public class ArraySort2 {

	public static void main(String[] args) {


	int[] array = {2,9,3,1,6};

	int count = 0;
	int counter = 0;
	for(counter = 0; counter < array.length; counter++) {
		for(count = 0; count < array.length; count++){

			if(array[count] < array[counter]) {
			array[count] = array[counter];

			}
		}
			
	}
			System.out.print(array[counter]);


}
}