from python_palindrome import reverse_word

def test_palindrome_python_palindrome():
	
	assert reverse_word('neveroddoreven') == True
	assert reverse_word('neveroddorevenppp') == False   
