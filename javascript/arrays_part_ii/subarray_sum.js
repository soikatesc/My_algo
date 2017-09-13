
function SubArrSum(arr){
	var sum = 0;
	var newarr = [];

	for(var i=0;i<arr.length;i++){
		if(arr[i]>0){
			sum += arr[i];
		}else{
			newarr.push(sum);
			sum = 0;
			newarr.push(arr[i])
		}
	}

	other_max = Math.max(...newarr);
	console.log(newarr)

	var maxindex = newarr.indexOf(other_max)
	// console.log(maxindex)

	var maxsum = 0;
	var length = 1;
	for(var i=maxindex; i<newarr.length;i++){
		console.log(newarr[i])
	}

	for(var j=maxindex; j>=0; j--){
		console.log(newarr[j])
	}

}

arr = [1,2,-4,5,-2,3,-1]
SubArrSum(arr)