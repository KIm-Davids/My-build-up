from minimum_number_function import minimum_number
from maximum_number_function import maximum_number

def test_minimum_number_minimum_number_function():

	number_inputted = ((1,2,3))

	assert minimum_number(number_inputted) == 1
	

def test_maximum_number_maximum_number_function():

	number = 1,2,3

	assert maximum_number(number) == 3
