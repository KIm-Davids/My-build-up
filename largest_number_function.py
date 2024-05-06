def minimum_number(number_inputted):
	minimum = number_inputted[0]

	for number in number_inputted:
		if number > minimum:
			minimum = number
		return number