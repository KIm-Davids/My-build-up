public class ArrayTest {
	
	public static int minimumIn(int[] minimumIn) {
	
	int minimum = 0;
	
	for(int count = 0; count < minimumIn.length; count++) {
		if(minimumIn[count] < minimum) {
			minimum = minimumIn[count];
		}
	}
		return minimum;
}
}
