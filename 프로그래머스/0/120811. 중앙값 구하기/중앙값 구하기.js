function solution(array) {
    var answer = 0;
    
    for(var i=0; i<array.length-1; i++){
        for(var j=i; j<array.length; j++){
            if (array[i] > array[j]) {
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    
    answer = array[Math.trunc(array.length/2)];
    
    return answer;
}