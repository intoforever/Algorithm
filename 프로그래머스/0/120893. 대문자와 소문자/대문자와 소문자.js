function solution(my_string) {
    var _my_string = my_string.split("");
    var answer = [];
    
    for(var m of _my_string){
        if (m === m.toUpperCase()) {
            answer.push(m.toLowerCase());
        } else {
            answer.push(m.toUpperCase());
        }
    }
    
    answer = answer.join("");    
    
    return answer;
}