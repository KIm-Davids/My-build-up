public class MaximumNumberCopy {
	public static int smallestNumber(int numbers, int secondNumber, int thirdNumber) {
	
	int smallestNumber = 0;
	
	for(int i = 0; i < numbers; i++) {
	if(secondNumber < numbers ) {
	numbers = secondNumber;
	}

	if(thirdNumber < numbers){
	numbers = thirdNumber;
	}
	else {
		numbers = 0;
	}
	}
	return numbers;
	}
}
	