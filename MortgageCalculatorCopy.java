principal = float(input("Enter your principal amount"))

interest_rate = float(input("Enter the annual interest rate"))
		   
years = float(input("Enter the number of years"))
		   
num12 = num3 * 12;

rate = interest_rate / 100;

num4 = principal * interest_rate / 12;

num5 = rate / 12;

num6 = 1 + num5;
		
num7 = math.pow(num6,num12);

num8 = math.pow(num6,num12);

num9 = num8 - 1;

num10 = num4 * num7;

num11 = num10 / num9;
		
print("Your monthly payment is " + num11);