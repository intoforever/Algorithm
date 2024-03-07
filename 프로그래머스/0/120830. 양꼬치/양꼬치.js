function solution(n, k) {
    var answer = 0;
    var freeDrink = Math.trunc(n/10);
    
    answer = n*12000 + k*2000 - freeDrink*2000;
    
    return answer;
}