first_number = int(input("Enter first number"))
second_number = int(input("Enter second number"))
third_number = int(input("Enter third number"))

summed_number = first_number + second_number + third_number

average = summed_number / 3

#product

for number in range(3):
	number *= first_number
	number *= second_number
	number *= third_number



largest = 0

if first_number > second_number:
    largest = first_number

if second_number > first_number:
    largest = second_number

if third_number > second_number:
    largest = third_number

print(largest)


Smallest = 0

if first_number < second_number:
	smallest = first_numebr

if second_number < first_number:
	smallest = second_number

if third_number < second_number:
	smallest = third_number

print(smallest)