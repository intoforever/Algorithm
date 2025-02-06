import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int x = 0; x < commands.length; x++) {
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            int len = j - i + 1;
            
            int[] newArr = new int[len];
            System.arraycopy(array, i - 1, newArr, 0, len);
            Arrays.sort(newArr);
            
            answer[x] = newArr[k - 1];
        }
        
        return answer;
    }
}