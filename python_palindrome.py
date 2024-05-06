def reverse_word(numbers):
	string = ""

	for number in numbers:
		string = numbers + string
		if string[0] == string[-1]:
			return True
		else:
			return False



