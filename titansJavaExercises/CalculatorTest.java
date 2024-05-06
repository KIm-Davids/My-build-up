import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	@Test
	public void restThatCalculatorCanAddTwoPositiveNumbers() {

	
	int sum = Calculator.add(-2,-2);

	int expectedSum = -4;
	//assertion
	assertEquals(expectedSum, sum);
	}


	@Test
	public void testThatCalculatorCanSubtract() {

	int result = Calculator.subtract(3,2);

	int expectedResult = 1;
	//assertion
	assertEquals(expectedResult, result);
	}

	@Test
	public void testThatCalculatorCanAddNegativeNumbers() {
	
	int result = Calculator.negativNumbers(-2,-2);
	
	int expectedResult = -4;
	//assertion
	assertEquals(expectedResult,result);

	}

	@Test
	public void multiplyNumbersWithoutUsingMultiplySymbol() {

	

	
	int result = Calculator.multiplyNumber(7,7);

	int expectedResult = 49;
	//assertion
	assertEquals(expectedResult, result);
	cle

}




}



