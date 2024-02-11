class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int a1 = 0;
        int a2 = 0;
        int answer = 0;
        
        if(arr1.length < arr2.length)
            answer = -1;
        else if(arr1.length > arr2.length)
            answer = 1;
        else{
            for(int n:arr1)
                a1 += n;
        
            for(int m:arr2)
                a2 += m;
            
            if(a1>a2) answer = 1;
            else if(a1<a2) answer = -1;
            else answer = 0;
        }
        
        
        return answer;
    }
}