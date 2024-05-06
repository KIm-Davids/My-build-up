def maximum_number(number_inputted):
	maximum = number_inputted[0]

	for number in number_inputted:
		if number < maximum:
			maximum = number
		return number