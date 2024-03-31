function solution(n, numlist) {
    var answer = [];
    var idx = 0;
    
    for (var num of numlist){
        if (num%n == 0) {
            answer[idx++] = num;
        }    
    }

    return answer;
}