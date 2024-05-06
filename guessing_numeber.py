number_to_guess = int(input("Guess a number between 1 - 10 "))

for numbers in range(1, 3):
	if(wrong_number != 10):
		second_try = int(input("Pls try again"))
		print("you did not guess correctly")

	if(WINNING_NUMBER == 10):
		print("You won!")
		break


