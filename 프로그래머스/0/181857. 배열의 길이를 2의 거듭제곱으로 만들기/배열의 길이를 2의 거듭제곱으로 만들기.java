class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        int len = arr.length;
        
        for (int i = 1; i < len; i++) {
            if (Math.pow(2, i) >= len) {
                cnt = i;
                break;
            }
        }
        
        int[] answer = new int[(int) Math.pow(2, cnt)];
        
        for (int i = 0; i < answer.length; i++) {
            int value = 0;
            
            if (i < arr.length) {
                value = arr[i];
            }
            
            answer[i] = value;
        }
        
        return answer;
    }
}