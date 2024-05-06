import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class getPositionTest {
	@Test
		public void getThePositionTest () {
	
		int[] result = getPositon.getPosition(new int[]{-9,6,-1,2,3});

		int[] expectedResult = {5,1,4,3,2};

		assertArrayEquals(expectedResult, result);
	
		}
}