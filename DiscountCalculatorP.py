num1 = int(input("Please enter a price\n"))	
num2 = int(input("Please enter discount recieved\n"))

discountPercentage = num2 / 100 * num1

priceDiscount = num1 - discountPercentage

print("The price after discount is " + str(priceDiscount))
	
