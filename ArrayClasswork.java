import java.util.Arrays;
public class ArrayClasswork {
	public static void main(String[] args) {
		
	
	
	int result = 0;	
	int result1 = 0;
	int result2 = 0;
	int result3 = 0;
	int result4 = 0;
	int result5 = 0;
	int counter = 0;
	int total = 0;
	

	for(counter = 0; counter < 5; counter++) {
	
	int[] arrays = {2,4,5,1,6};
	result += arrays[counter];
	result1 = result - arrays[0];
	result2 = result - arrays[1];
	result3 = result - arrays[2];
	result4 = result - arrays[3];
	result5 = result - arrays[4];
	}

	for(counter = 0; counter < 1; counter++) {	
	int[] finalResult = {result1,result2,result3,result4,result5};
	total = finalResult[counter];
	System.out.print(Arrays.toString(finalResult));
		}
		
		
	}
}