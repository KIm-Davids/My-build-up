user_list = [7,4,2,3,4]
let maximum = 0;
let minimum = user_list[0];

for(counter = 0; counter  < user_list.length; counter++){

	if(user_list[counter] > maximum) {
		maximum = user_list[counter];
	}
}

console.log(maximum)


for(index = 0; index < user_list.length; index++) {
//	minimum = user_list[0]

	if(user_list[index] < minimum) {
		minimum = user_list[index];
	}
}
console.log(minimum);

let result = maximum - minimum;
console.log(`The result is = ${result}`)


user_list2 = [9,2,1,8,6];
maximum2 = 0;
minimum2 = 0;



for(counter2 = 0; counter2 < user_list2.length; counter2++) {

	if(user_list2[counter2] > maximum) {
		maximum = user_list2[counter2];
	}
}
console.log(maximum)

for(index2 = 0; index2 < user_list2.length; index2++) {
		
	if(user_list2[index2] < minimum) {
		minimum = user_list2[index2];
	}
}

console.log(minimum)

result2 = maximum - minimum;

console.log(`The second result ${result2}`)








