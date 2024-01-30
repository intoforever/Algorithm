import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /* 약수 구하기 */
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++)        
            if(n%i == 0)
                list.add(i);
        
        answer = list.size();
        
        return answer;
    }
}