function findPair(arr, target){
    // console.log(arr, target);
    for(let i = 0; i< arr.length -1; i++){
        for(let j = i+1; j < arr.length; j++){
            if(arr[i] + arr[j] == target){
                return([arr[i],arr[j]]);
            }
        }
    }
    return 0
}
console.log(findPair([5,2,3,4,5] ,10));