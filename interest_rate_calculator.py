interest_rate = 20/100
amount = int(input("Enter an amount:"))
number_of_years = int(input("Enter number of years:"))





for number in range(1, number_of_years + 1):
	
	percent_gotten2 = amount * interest_rate
	#percent = percent_gotten2 + amount
	amount += percent_gotten2
	
	print(f'Year {number} you have {amount:.2f}')
