score = int(input("Enter your score"))

if score >= 80 and score < 100:
	print("Your exam grade is A")

elif score >= 65 and score <= 79:
	print("Your exam grade is B")

elif score >= 50 and score <= 64:
	print("Your exam grade is C")

elif score >= 40 and score <= 49:
	print("Your exam grade is D")

elif score >= 100:
	print("Your a criminal, how can you get above 100")