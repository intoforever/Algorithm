function solution(my_string) {
    var answer = 0;
    var _my_string = my_string.split("");
    
    for(var s of _my_string){
        var num = parseInt(s);
        if(isNaN(num)){
            continue;
        }
        answer += parseInt(num);
    }
    
    return answer;
}