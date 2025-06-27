import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 초기화
        Map<String, Integer> map = new HashMap<>();
        for (String key : keymap) {
            updateKeys(key, map);
        }
        
        // targets 확인
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String[] target = targets[i].split("");
            answer[i] = getPressCount(target, map);
        }
        
        return answer;
    }
    
    private void updateKeys(String _keys, Map<String, Integer> map) {
        String[] keys = _keys.split("");
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            int press = i + 1;
            if (!map.containsKey(key) || press < map.get(key)) {
                map.put(key, press);
            }
        }
    }
    
    private int getPressCount(String[] keys, Map<String, Integer> map) {
        int cnt = 0;
        for (String key : keys) {
            if (!map.containsKey(key)) {
                cnt = -1;
                break;
            }
            cnt += map.get(key);
        }
        return cnt;
    }
}