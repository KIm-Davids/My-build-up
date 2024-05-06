import java.util.Arrays;
public class FireDrillAssignment{
	public static int[] performFunction(int[] collectInput) {
		
		int counter = 0;
		int userInput = collectInput.length + 3;
		int[] newArray = new int[userInput];
		
		for(counter = 0; counter < collectInput.length; counter++) {
			newArray[counter + 3] = collectInput[counter + 2];
		}
		return newArray;
}




	public static void main(String[] args) {
		
		int counter = 0;
		int[] array = {4,5,8};
		//	for(counter = 0;counter < array.length; counter++) {
			System.out.print(Arrays.toString(performFunction(array)));
			
		
		
		}
	}