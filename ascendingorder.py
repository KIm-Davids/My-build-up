user_input = int(input("Enter your number"))
user_input2 = int(input("Enter your number"))
user_input3 = int(input("Enter your number"))

number = user_input
number2 = 0
number3 = 0

if user_input2 < user_input3:
	number2 = user_input2

if user_input3 < number:
	number2 = user_input3

if number < user_input2:
	number2 = number


if user_input2 > number:
	number3 = user_input2

if user_input3 > user_input2:
	number3 = user_input3

if number > user_input3:
	number3 = number


if user_input2 == number:
	number4 = user_input2

if user_input3 == user_input2:
	number4 = user_input3

if number == user_input3:
	number4 = number


print("The number arranged in ascending order is " + str(number2) + str(number3) + str(number4))


	
	
