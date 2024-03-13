function solution(s1, s2) {
    var answer = 0;
    
    for(let s of s1){
        for(let ss of s2){
            if(s == ss){
                answer++;
            }
        }
    }
    return answer;
}