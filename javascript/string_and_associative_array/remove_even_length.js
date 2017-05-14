

function evenLengthStrings(arr){
	// for(var i=0; i<undefined;i++){
	// 	// console.log(arr[i].length)
	// 	if(arr[i].length%2 == 0){
	// 		arr.splice(i,1)
	// 		console.log(i)
	// 	}
	// }
	// console.log(arr[4])

	var i = 0;
	while( arr[i] != undefined){
		console.log(arr[i]);
		if(arr[i].length % 2 == 0){
			arr.splice(i,1)
		}

		i++;
	}

	console.log(arr)
}


arr = ["Nope!", "Its", "Kris", "starting" ]
evenLengthStrings(arr)