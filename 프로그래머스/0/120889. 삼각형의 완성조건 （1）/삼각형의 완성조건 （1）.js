function solution(sides) {
    var answer = 2;
    
    var side1 = sides[0];
    var side2 = sides[1];
    var side3 = sides[2];
    
    var max = side1;
    
    for(var i=1; i<sides.length; i++){
        if(sides[i] > max){
            max = sides[i];
        }
    }
    
    if(max == side1){
        if(side1 < side2+side3){
            answer = 1;
            return answer;
        }
    } else if(max == side2) {
        if(side2 < side1+side3){
            answer = 1;
            return answer;
        }
    } else if(max == side3) {
        if(side3 < side1+side2){
            answer = 1;
            return answer;
        }
    }
    
    return answer;
}