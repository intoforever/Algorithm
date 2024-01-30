class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffeePrice = 5500;
        
        for(int i=0; i<answer.length; i++){
            if(i == 0){
                answer[i] = money/coffeePrice;
                continue;
            }
            
            answer[i] = money%coffeePrice;
            break;
        }
        
        // answer[0] = money/5500;
        // answer[1] = money%5500;
        
        return answer;
    }
}