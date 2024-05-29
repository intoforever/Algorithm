function solution(hp) {
    var answer = 0;
    var leftover = hp;
    var general = 5;
    var army = 3;
    var worker = 1;
    
    var array = [general, army, worker];
    
    for (var a of array) {
        answer += Math.trunc(leftover/a);
        leftover %= a;
    }
    
    return answer;
}