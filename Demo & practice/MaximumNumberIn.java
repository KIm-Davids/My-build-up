public class MaximumNumberIn{
	public static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
	
	int numbers = 1;
	
	for(int i = 1; i < numbers; i++) {
	if(secondNumber < numbers ) {
	numbers = secondNumber;
	}

	if(thirdNumber < numbers){
	numbers = thirdNumber;
	}
	
	if(firstNumber < numbers) {
	numbers = firstNumber;

	}
	}
	return numbers;
	}
}
	