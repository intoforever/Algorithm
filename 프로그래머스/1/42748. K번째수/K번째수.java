import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // add해서 한 번에 answer로 반환할 것임
        List<Integer> tempList = new ArrayList<>(); // temp
        List<Integer> answerList = new ArrayList<>(); // answer
        int[] command = {};
        int idx = 0;
        int len = 0;
        
        int i;
        int j;
        int k;
        
        // commands는 i, j, k 순서, 2차원 배열
        for (int z = 0; z < commands.length; z++) {
            command = commands[z];
            
            // idx를 구하기 위해 -1을 해줘야 함
            i = command[0] - 1;
            j = command[1] - 1;
            k = command[2] - 1;
            
            for (int y = i; y <= j; y++) {
                tempList.add(array[y]);
            }
            
            // 정렬
            Collections.sort(tempList);
            
            // k번째 추가
            answerList.add(tempList.get(k));
            
            // 초기화
            tempList.clear();
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int a = 0; a < answer.length; a++) {
            answer[a] = answerList.get(a);
        }

        return answer;
    }
}