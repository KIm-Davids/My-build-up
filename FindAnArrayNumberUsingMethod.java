import java.util.Scanner;
public class FindAnArrayNumberUsingMethod {
	public static boolean contains(int[] array, int item) {


	for(int n : array){
	if(item == n) {

		return true;
	}
     }

	return false;

    }


	

	public static void main(String[] args) {
	
	int[] arrayListOfNumbers = {
				     1789, 2035, 1899, 1456, 2013, 
        			     1458, 2458, 1254, 1472, 2365, 
        			     1456, 2265, 1457, 2456
				    };	
	

	System.out.println(contains(arrayListOfNumbers, 17));

	System.out.println(contains(arrayListOfNumbers, 14));

	}
}