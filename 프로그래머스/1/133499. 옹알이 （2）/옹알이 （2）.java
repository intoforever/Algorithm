import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        MyBabbling mb = new MyBabbling();
        int answer = mb.cntPossibleWords(babbling);
        return answer;
    }
}

class MyBabbling {
    private Map<String, Integer> map;
    
    public MyBabbling() {
        map = new HashMap<>();
        map.put("aya", 0);
        map.put("ye", 0);
        map.put("woo", 0);
        map.put("ma", 0);
    }
    
    public int cntPossibleWords(String[] babbling) {
        List<String> keys = new ArrayList<>(map.keySet());
        int len = keys.size();
        int cnt = 0;
        int flag = 0;
        
        for (String b : babbling) {
            initMap();
            flag = 0;
            while (flag < 4) {
                for (int i = 0; i < len; i++) {
                    flag++;
                    String key = keys.get(i);
                    if (b.indexOf(key) != 0) {
                        continue;
                    }
                    if (map.get(key) == 1) {
                        continue;
                    }
                    flag = 0;
                    initMap(key);
                    b = b.substring(key.length());
                    if (b.length() == 0) {
                        flag = 4;
                        break;
                    }
                }
            }
            if (b.length() == 0) {
                cnt++;
            }
        }
        return cnt;
    }
    
    private void initMap() {
        for (String key : map.keySet()) {
            map.put(key, 0);
        }
    }
    
    private void initMap(String activeKey) {
        for (String key : map.keySet()) {
            if (key.equals(activeKey)) {
                map.put(key, 1);
                continue;
            }
            map.put(key, 0);
        }
    }
}