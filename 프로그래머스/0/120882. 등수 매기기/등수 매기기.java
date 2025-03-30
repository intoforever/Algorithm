import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] temp1 = new double[score.length];
        double[] temp2 = new double[score.length];
        Map<Double, Integer> map = new HashMap<>();
        
        for (int i = 0; i < score.length; i++) {
            double val = (score[i][0] + score[i][1]) / 2.0;
            temp1[i] = val;
            temp2[i] = val;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        Arrays.sort(temp1);
        int grade = 1;
        int quantity = 0;
        double previous = -1;
        for (int i = temp1.length - 1; i >= 0; i--) {
            if (temp1[i] == previous) {
                continue;
            }
            previous = temp1[i];
            quantity = map.get(temp1[i]);
            map.put(temp1[i], grade);
            grade += quantity;
        }

        for (int i = 0 ; i < temp2.length; i++) {
            answer[i] = map.get(temp2[i]);
        }
        
        return answer;
    }
}