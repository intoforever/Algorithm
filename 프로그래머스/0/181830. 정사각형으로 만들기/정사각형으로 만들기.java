class Solution {
    public int[][] solution(int[][] arr) {
        int hLen = arr.length, vLen = arr[0].length;
        
        if (hLen == vLen) {
            return arr;
        }
        
        int len = Math.max(hLen, vLen);
        int[][] answer = new int[len][len];
        
        for (int i = 0; i < hLen; i++) {
            for (int j = 0; j < vLen; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}