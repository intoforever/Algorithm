import java.util.*;

class Solution {
    // 스테이지 번호와 실패율(혹은 원하는 값을 저장하는 클래스)
    static class StageInfo {
        int stage;
        double failureRate;
        
        StageInfo(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }
    
    public int[] solution(int N, int[] stages) {
        int totalPlayers = stages.length;
        // 각 스테이지별 도전한 플레이어 수(스테이지 N+1은 클리어한 플레이어이므로 카운트하지 않음)
        int[] stageCount = new int[N + 2];
        for (int s : stages) {
            stageCount[s]++;
        }
        
        StageInfo[] stageInfos = new StageInfo[N];
        int remaining = totalPlayers;
        // 1번 스테이지부터 N번 스테이지까지 실패율 계산
        for (int i = 1; i <= N; i++) {
            double failureRate = 0;
            if (remaining > 0) {
                failureRate = (double) stageCount[i] / remaining;
            }
            stageInfos[i - 1] = new StageInfo(i, failureRate);
            remaining -= stageCount[i];
        }
        
        // 실패율 내림차순, 실패율이 같다면 스테이지 번호 오름차순으로 정렬
        Arrays.sort(stageInfos, new Comparator<StageInfo>() {
            @Override
            public int compare(StageInfo a, StageInfo b) {
                if (b.failureRate > a.failureRate) return 1;
                else if (b.failureRate < a.failureRate) return -1;
                else return Integer.compare(a.stage, b.stage);
            }
        });
        
        // 정렬된 순서대로 스테이지 번호를 배열에 담아서 반환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageInfos[i].stage;
        }
        return answer;
    }
}
