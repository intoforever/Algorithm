class Solution {
    public int[] solution(int[] answers) {
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;
        
        for(int i=0; i<answers.length; i++){
            
            //1번 수포자
            if(answers[i] == first[i%first.length]){
                firstCnt++;
            }
            
            // 2번 수포자
            if(answers[i] == second[i%second.length]){
                secondCnt++;
            }
            
            // 3번 수포자
            if(answers[i] == third[i%third.length]){
                thirdCnt++;
            }
        }
        
        
        if(firstCnt == secondCnt){
            if(secondCnt > thirdCnt){
                int[] answer = {1,2};
                return answer;
            }
        } else if(secondCnt == thirdCnt){
            if(secondCnt > firstCnt){
                int[] answer = {2,3};
                return answer;
            }
        } else if(firstCnt == thirdCnt){
            if(firstCnt > secondCnt){
                int[] answer = {1,3};
                return answer;
            }
        }
        
        if(firstCnt != secondCnt && firstCnt != thirdCnt){
            int max = Math.max(Math.max(firstCnt, secondCnt), thirdCnt);
            
            if(max == firstCnt){
                int[] answer = {1};
                return answer;
            } else if(max == secondCnt){
                int[] answer = {2};
                return answer;
            } else if(max == thirdCnt){
                int[] answer = {3};
                return answer;
            }
        }
        
        
        int[] answer = {1,2,3};    
        return answer;
    }
}