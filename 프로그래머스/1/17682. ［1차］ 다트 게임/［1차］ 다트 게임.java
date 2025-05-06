import java.util.*;
class Solution {
    
    public static int turn = 3;
    public Result[] results;
    
    public int solution(String dartResult) {
        int answer = 0;
        results = new Result[turn];
        int strIdx = 0, currentTurn = 0;
        String[] arr = dartResult.split("");
        
        for (int i = 0; i < arr.length; i++) {
            // 1. *옵션 확인
            if ("*".equals(arr[i])) {
                doubleOpt(currentTurn);
                strIdx = i + 1;
                continue;
            }
            // 2. #옵션 확인
            if ("#".equals(arr[i])) {
                minusOpt(currentTurn);
                strIdx = i + 1;
                continue;
            }
            // 3. 점수+보너스 확인 && turn 체크 --> 점수 잘라
            if ("S".equals(arr[i]) || "D".equals(arr[i]) || "T".equals(arr[i])) {
                results[currentTurn] = new Result(dartResult.substring(strIdx, i + 1));
                strIdx = i + 1;
                currentTurn++;
            }
        }
                
        // 최종 점수 환산
        for (Result r : results) {
            answer += r.score;
        }
        return answer;
    }
    
    public void doubleOpt(int turn) {
        for (int i = turn > 2 ? turn - 2 : 0; i < turn; i++) {
            results[i].score = (results[i].score * 2);
        }
    }
    
    public void minusOpt(int turn) {
        results[turn-1].score = (results[turn-1].score * -1);
    }
    
    // 내부 중첩 클래스로 구현
    private static class Result {
        private int score;
        
        public Result(String score) {
            this.score = calScore(score);
        }
        
        private int calScore(String str) {
            int len = str.length();
            score = Integer.parseInt(str.substring(0, len - 1));
            checkArea(str.substring(len - 1));
            return score;
        }
        
        private void checkArea(String area) {
            switch(area) {
                case "S":
                    break;
                case "D":
                    score = (int) Math.pow(score, 2);
                    break;
                case "T":
                    score = (int) Math.pow(score, 3);
                    break;
                default:
                    break;
            }
        }
    }
}