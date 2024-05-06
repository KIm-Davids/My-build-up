import random 

random_number = random.randrange(1, 10)


number_to_guess = int(input("Guess a number between 1 - 10 "))

while number_to_guess != random_number:
	if(number_to_guess != random_number):
		second_try = int(input("Pls try again"))
		print("you did not guess correctly")

	if(number_to_guess  == random_number):
		print("You won!")
		break


