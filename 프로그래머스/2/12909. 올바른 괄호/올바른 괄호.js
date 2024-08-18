function solution(s){
    var answer = true;
    var flag = 0;
    
    // s를 쪼개
    var arr = s.split('');
    
    for (var a of arr) {
        if (a === '(') {
            flag++;
            continue;
        }
        flag--;
        
        if (flag === -1) {
            answer = false;
            return answer;
        }
    }
    
    if (flag > 0) {
        answer = false;
    }

    return answer;
}