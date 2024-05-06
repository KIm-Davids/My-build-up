import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {

	int[] array = {6,9,1,2,3};

	int j = 0;
	int i = 0;
	
	for(i = 0; i < array.length; i++) {
		for(j = i + 1 ; j < array.length; j++) {
			if(array[i] > array[j]){
				array[i] = array[i] + array[j];
				array[j] = array[i] - array[j];
				array[i] = array[i] - array[j];
						}
					}
	
				}
			
		
	
		

		System.out.print(Arrays.toString(array));


}
}