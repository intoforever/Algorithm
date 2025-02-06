import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        for (int x = 0; x < len; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            
            int[] newArr = new int[j - i + 1];
            System.arraycopy(array, i - 1, newArr, 0, j - i + 1);
            Arrays.sort(newArr);
            
            answer[x] = newArr[k - 1];
        }
        
        return answer;
    }
}