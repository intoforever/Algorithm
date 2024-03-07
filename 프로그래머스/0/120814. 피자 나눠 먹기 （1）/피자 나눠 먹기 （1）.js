function solution(n) {
    var answer = 0;
    
    if(Math.trunc(n/7) == 0){
        answer = 1;
    }else if(Math.trunc(n%7) == 0){
        answer = Math.trunc(n/7);
    }else if(Math.trunc(n%7) < 7){
        answer = Math.trunc(n/7) + 1;
    }
    
    return answer;
}