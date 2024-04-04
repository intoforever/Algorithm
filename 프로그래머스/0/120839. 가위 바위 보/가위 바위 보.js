function solution(rsp) {
    var answer = [];
    var _rsp = rsp.split("");
    
    for (var r of _rsp) {
        if (r == "2") {
            answer.push("0");
        } else if (r == "0") {
            answer.push("5");
        } else {
            answer.push("2");
        }
    }
    
    return answer.join("");
}