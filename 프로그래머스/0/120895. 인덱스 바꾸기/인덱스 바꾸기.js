function solution(my_string, num1, num2) {
    var answer = '';
    
    var _my_string = my_string.split("");
    var temp = _my_string[num1];
    _my_string[num1] = _my_string[num2];
    _my_string[num2] = temp;
    
    answer = _my_string.join('');
    
    return answer;
    
}// class ends