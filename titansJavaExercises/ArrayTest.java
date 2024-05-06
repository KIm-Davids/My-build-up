import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class ArrayTest {
	@Test
	public void testToCheckThatTheHighestProductNumber () {

	int[] result = ArrayExercises.findTheMaximum(new int[]{6});
	System.out.print(Arrays.toString(result));
	int[] expectedResult = {72};
	
	assertArrayEquals(expectedResult, result);

	}
}