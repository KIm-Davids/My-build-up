public class AverageOf {
	public static float average(float firstNumber, float secondNumber, float thirdNumber) {

	float number = 1;
	float sum = 0;
	float average = 0;

	
	for(int counter = 0; counter < firstNumber; counter++) {
	sum = firstNumber + secondNumber + thirdNumber;
	average = sum / 3;
	}
	return average;
	}
}