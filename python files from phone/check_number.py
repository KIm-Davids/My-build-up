from python_functions import length
from python_functions import two_length
from python_functions import replace
from python_functions import find_long_word
from python_functions import odd_index
from python_functions import minimum
from python_functions import input_two


def test_length_python_functions():
        assert length("semicolon") == 9
        
def test_two_length_python_functions():        
        assert two_length('semicolon') == 'seon'
        assert two_length('on') == 'onon'
        assert two_length('o') == "" 
        
def test_replace_python_functions():
        assert replace('abc') == 'abcing'
        assert replace('string') == 'stringly'
        assert replace('on') == 'on'
        
def test_find_long_word_python_functions():

	word_inputted = ["welcome", "out", "weather", "mobile", "Breakfast", "journey"]

	long_word, long_length = find_long_word(word_inputted) 
   
	assert long_word == 'Breakfast' and long_length == 9

def test_odd_index_python_functions():

	assert odd_index('semicolon') == 'eioo'

def test_minimum_python_functions():
	
	minimum = [8,4,9,2,5,7,3]   
	assert minimum == "2"     

def test_input_two_python_functions():
	
	assert input_two('hello',3) == 'hellohellohello'
	assert input_two('hi',4.5) == 'hi'

def test_maximum_python_functions():

	number_inputted = [8,4,9,2,5,7,3]
	maximum_numbers = maximum(number_inputted)
	assert maximum_numbers == 9






