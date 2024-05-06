def length(word_inputted):

        return len(word_inputted)
        
        
def two_length(word_inputted):

        if len(word_inputted) < 2:
            return ""
        else:
            return word_inputted[:2] + word_inputted[-2:]
            
def replace(word_inputted):
    
        if len(word_inputted) < 3:
                return word_inputted 
        elif word_inputted[-3:] == 'ing':
                return word_inputted + 'ly'
        else:
            return word_inputted[-3:] + 'ing'
            
def find_long_word(word_inputted):

	long_word = ""
	long_length = 0

	for word in word_inputted:
		if len(word) > long_length:
			long_word = word
			long_length = len(word)
	return long_word, long_length

def odd_index(word_inputted):
	word_counted = ""
	for word in range(len(word_inputted)):
		if word % 2 == 1:
			word_counted += word_inputted[word]
	return word_counted

def minimum(word_inputted):
	minimum = 0

	for number in range(word_inputted):
		if number < word_inputted:
			minimum = word_inputted[0]
	return minimum

def input_two(string,num):
	if type(string) and type(num) in [string, int]:
		return string * num
	else:
		return string

def maximum(number_inputted):
	maximum_numbers = 0
	for number in range(number_inputted):
		if number > maximum:
			maximum = number
	return maximum

	
            
    
      