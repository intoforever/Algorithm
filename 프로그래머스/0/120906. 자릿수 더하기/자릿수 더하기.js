function solution(n) {
    var answer = 0;
    
    var _n = n.toString();
    var nums = _n.split("");
    
    for(var num of nums){
        answer += parseInt(num);
    }
    
    return answer;
}