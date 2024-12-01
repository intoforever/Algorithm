import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // answer 배열 초기화
        int cLen = commands.length;
        int[] answer = new int[cLen];
        
        // k번째 값
        int kValue = -1;
        
        // 탐색
        for (int z = 0; z < cLen; z++) {
            int[] com = commands[z];
            kValue = getKValue(array, com); // 정렬 포함
            
            answer[z] = kValue;
        }
        
        // 결과 반환
        return answer;
    }
    
    /*
     * k번째 value를 구하는 함수
     */
    private int getKValue(int[] array, int[] command) {
        // idx 구하기
        int i = command[0] - 1;
        int j = command[1]; // copyOfRange를 쓰기 위해 -1 안함, 자동 제외
        int k = command[2] - 1;
        int val = -1; // array의 각 요소는 1 이상, 구분
        
        // 새 배열
        int[] temp = Arrays.copyOfRange(array, i, j);
        
        // 정렬
        int tLen = temp.length;
        for (int a = 0; a < tLen; a++) {
            int min = temp[a];
            
            for (int b = a + 1; b < tLen; b++) {
                if (min > temp[b]) {
                    temp[a] = temp[b];
                    temp[b] = min;
                    min = temp[a];
                }
            }
        }
        
        // k번째 값
        val = temp[k];
        
        return val;
    }
}