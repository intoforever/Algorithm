function solution(n) {
    var answer = [];
    var idx = 0;
    for(var i=0; i<n; i++){
        if((i+1) % 2 == 1){
            answer[idx++] = i+1;
        }
    }
    return answer;
}