let bubbleSort = (arr) => {
	for( let x = 0; x<arr.length; x++){
		for( let i=0; i< arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				let temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;		
			}
		}
	}
	return arr;	
}

let bubbleSortWithDo = (a) => {
	var swapped;
    do {
        swapped = false;
        for (var i=0; i < a.length-1; i++) {
            if (a[i] > a[i+1]) {
                var temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                swapped = true;
            }
        }
    } while (swapped);
    return a;
}

let arr = [3, 5, 2, 4, 1]
console.log(bubbleSort(arr))
console.log(bubbleSortWithDo(arr))

