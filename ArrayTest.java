import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArraysEquals;
import java.util.Arrays;

public class ArrayTest {
	@Test
	public void testToCheckThatTheHighestProductNumber () {

	int[] result = ArrayExercises.findTheMaximum(new int[]{6,9,1,2,3});

	int expectedResult = 54;
	
	assertArrayEquals(expectedResult, result);

	}
}