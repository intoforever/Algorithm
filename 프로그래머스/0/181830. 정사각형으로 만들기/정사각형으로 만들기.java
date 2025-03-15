class Solution {
    public int[][] solution(int[][] arr) {
        int tempLen1 = arr.length;
        int tempLen2 = arr[0].length;
        if (tempLen1 == tempLen2) {
            return arr;
        }
        
        int len = tempLen1 >= tempLen2 ? tempLen1 : tempLen2;
        int[][] answer = new int[len][len];
        
        if (tempLen1 < tempLen2) {
            for (int i = 0; i < tempLen1; i++) {
                answer[i] = arr[i];
            }
        } else if (tempLen1 > tempLen2) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < tempLen2; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}