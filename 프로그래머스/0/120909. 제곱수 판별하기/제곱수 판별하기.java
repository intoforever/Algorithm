class Solution {
    public int solution(int n) {
        int answer = 2;
        
        if(n%Math.sqrt(n) == 0)
            answer = 1;
        
        // for(int i=2; i<n; i++)
        //     if(n/i == i && n%i == 0){
        //         answer = 1;
        //         break;
        //     }
        
        return answer;
    }
}