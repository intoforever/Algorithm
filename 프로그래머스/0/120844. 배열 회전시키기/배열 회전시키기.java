class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        int targetIdx = -1;
        
        switch (direction) {
            // right면 끝에거 먼저 담고 0, 1, 2, ... len-1을 맨 처음
            case "right":
                targetIdx = len - 1;
                
                answer[0] = numbers[targetIdx];
                for (int i = 0; i < len - 1; i++) {
                    answer[i + 1] = numbers[i];
                }
                
                break;
                
            // left면 1번부터 먼저 다 담고 0번을 맨 마지막 0을 맨 마지막
            case "left":
                targetIdx = 0;
                
                for (int i = 0; i < len - 1; i++) {
                    answer[i] = numbers[i + 1];
                }
                answer[len - 1] = numbers[targetIdx];
                
                break;
            default:
                break;
        }
        
        return answer;
    }
}