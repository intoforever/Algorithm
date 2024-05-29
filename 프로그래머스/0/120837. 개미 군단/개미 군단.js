function solution(hp) {
    var answer = 0;
    
    var a = 5;
    var b = 3;
    var c = 1;
    
    var leftover;
    
    answer = Math.trunc(hp/a);
    console.log(answer);
    leftover = hp%a;
    console.log(leftover);
    
    answer = answer + Math.trunc(leftover/b);
    console.log(answer);
    leftover = leftover%b;
    console.log(leftover);
    
    answer = answer + Math.trunc(leftover/c);
        
    
    return answer;
}