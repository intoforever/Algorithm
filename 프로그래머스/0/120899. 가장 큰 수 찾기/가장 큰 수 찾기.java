

class Solution {
    public int[] solution(int[] array) {
        
        int max = array[0];
        int idx = 0;
        int[] answer = new int[2];
        
        for(int i=0; i<array.length; i++)
            if(array[i]>max){
                max = array[i];
                idx = i;
            }
        
        answer[0] = max;
        answer[1] = idx;
        
        return answer;
    }
}