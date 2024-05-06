import java.util.Arrays;
public class ArrayExercises {
	public static int[] findTheMaximum(int[] collectInput) {

	//int[] collectInput = {6,-9,-8,2,3};
	int finalResult = 0;
	int[] result = new int[collectInput.length];
	int[] maximum = new int[1];
	int j = 0;
	int i = 0;

	for(i = 0; i < collectInput.length; i++) {

		for( j = 0; j < collectInput.length; j++) {

			result[j] = collectInput[j] * collectInput[i];

			if(collectInput[j] == collectInput[i]) continue;
				
			
			for(int k = 0; k < collectInput.length; k++){
			if(result[j] > maximum[0]){
			maximum[0] = result[j];
			
						}
					}
				}
			}
			return maximum;
		
	
			
		
			
	}
		
	
}