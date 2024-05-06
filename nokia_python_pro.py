user_input = print( "Welcome to Nokia 3310\nPRESS ANY NUMBER TO CONTINUE\n")  

phone_book = print("1. Phone book")

print("2. Messages" ) 

print("3. Chat") 

print("4. Call register") 

print("5. Tones") 

print("6. Settings") 

print("7. Call divert") 

print("8. Games") 

print("9. Calculator") 

print("10. Reminder") 

print("11. Clock") 

print("12. Profiles") 


first = int(input("\n"))

match first:
	
	case 1:
		
		print("1. Search")
		
	case _:
		print("Done")