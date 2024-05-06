def vowels_and_consonants(words):

	vowels = ['a','e','i','o','u']
	consonants = ['b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z']
	
	vowels_counter = 0
	consonant = 0
	odd_vowels = 0
	even_words = 0

	for letters in words:
		if letters in vowels:
			vowels_counter += 1
		else:	
			consonant = consonant + 1  

		for vowels in words:
			if vowels == words:
				odd_vowels += words
			
	return (consonant,vowels_counter)





result = vowels_and_consonants('cdemi')

print(result)