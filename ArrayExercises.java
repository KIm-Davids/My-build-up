import java.util.Arrays;
public class ArrayExercises {
	public static int[] findTheMaximum(int[] collectInput) {

	int[] array = {6,9,1,2,3};
	int finalResult = 0;
	int[] result = new int[array.length];
	int[] maximum = new int[2];
	int j = 0;
	int i = 0;

	for(i = 0; i < array.length; i++) {

		for( j = 0; j < array.length; j++) {

			result[j] = array[j] * array[i];

			if(array[j] == array[i]) continue;
				
			
			for(int k = 0; k < array.length; k++){
			if(result[j] > maximum[k]){
			maximum[k] = result[j];
			
						}
					}
				}
			}
			return maximum;
		
	
			
		
			
	}
		
	
}