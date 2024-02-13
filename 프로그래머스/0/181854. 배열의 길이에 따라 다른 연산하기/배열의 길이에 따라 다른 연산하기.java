class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        
        if(len%2 == 1)
            for(int i=0; i<len; i++){
                if(i%2 == 0){
                    answer[i] = arr[i]+n;
                    continue;
                }
                answer[i] = arr[i];
            }
        else
            for(int i=0; i<len; i++){
                if(i%2 == 1){
                    answer[i] = arr[i]+n;
                    continue;
                }
                answer[i] = arr[i];
            }
        
        return answer;
    }
}