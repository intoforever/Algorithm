function solution(num_list) {
    var answer = [];
    var lastIdx = num_list.length-1;
    
    for (var num of num_list) {
        answer.push(num);
    }
    
    var lastOne = num_list[lastIdx];
    var beforeLastOne = num_list[lastIdx-1];
    
    if (lastOne > beforeLastOne) {
        answer.push(lastOne - beforeLastOne);
    } else {
        answer.push(lastOne*2);
    }
    
    return answer;
}