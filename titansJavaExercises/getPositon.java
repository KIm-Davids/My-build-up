public class getPositon {
public static int[] fillArrayFunction(int[] collectInput) {
	int[] array = new int[collectInput.length];
			
			for(int counter = 0; counter < collectInput.length; counter++) {
				array[counter] = 1;
			}
				return array;
			
		}
			
		public static int[] getPosition(int[] array){
		int[] positionArray = new int[array.length];
		int[] fillArray = fillArrayFunction(array);
		for(int count = 0; count < array.length; count++){
			for(int counter = 0; counter <array.length; counter++){
				if(array[counter] > array[count]){
					fillArray[count] += 1;
				}
		
		
		
		}
				
		}
				return fillArray;
		}
	
}	
