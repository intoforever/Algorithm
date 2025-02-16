import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        MyWords mw = new MyWords(cards1, cards2, goal);
        
        if (mw.getPossibility()) {
            answer = "Yes";
        }
        
        return answer;
    }
}

class MyWords {
    private String[] cards1;
    private String[] cards2;
    private Map<String, Integer> goalMap;
    private Map<String, Integer> compareMap;
    
    public MyWords(String[] cards1, String[] cards2, String[] goal) {
        this.cards1 = cards1;
        this.cards2 = cards2;
        this.goalMap = new HashMap<>();
        this.compareMap = new HashMap<>();
        
        for (int i = 0; i < goal.length; i++) {
            goalMap.put(goal[i], i + 1);
        }
    }
    
    public int[] getIdxArr(String[] cards) {
        int[] arr = new int[cards.length];
        
        for (int i = 0; i < cards.length; i++) {
            arr[i] = goalMap.getOrDefault(cards[i], 11);
        }
        
        return arr;
    }
    
    public boolean getPossibility() {
        boolean cards1Result = checkGoalMap(cards1);
        boolean cards2Result = checkGoalMap(cards2);
        
        return cards1Result && cards2Result;
    }
    
    public boolean checkGoalMap(String[] cards) {
        int[] arr = getIdxArr(cards);
        int[] temp = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(temp);
        
        String prev = cards[0];
        String cur;
        for (int i = 0; i < arr.length; i++) {
            // 순서를 건너뛴게 있는 경우 (먼저 호출되거나 없는 단어인데 건너뛴 경우)
            if (temp[i] != arr[i]) {
                return false;
            }
            
            cur = cards[i];
            
            // goal에 없는 단어인 경우
            if (!goalMap.containsKey(cur)) {
                continue;
            }
            
            compareMap.put(cur, compareMap.getOrDefault(cur, 0) + 1);
            
            // 0번째는 skip
            if (i == 0) {
                continue;
            }
            
            // 동시에 나온 경우
            if (compareMap.get(prev) > 1) {
                return false;
            }
                
            prev = cur;
        }
        
        return true;
    }
    
}