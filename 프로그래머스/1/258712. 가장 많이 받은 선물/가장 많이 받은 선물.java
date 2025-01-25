import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Integer> idxMap = getIdxMap(friends);
        Map<String, List<List<Integer>>> scoreMap = initMap(friends);
        
        checkScore(idxMap, scoreMap, gifts);
        Map<String, Integer> giftPoints = getGiftPoints(idxMap, scoreMap, friends);
        
        for (String key : friends) {
            int cnt = 0;
            
            for (int i = 0; i < scoreMap.get(key).size(); i++) {
                if (i == idxMap.get(key)) {
                    continue;
                }
                
                int givePoint = scoreMap.get(key).get(i).get(0);
                int receivePoint = scoreMap.get(key).get(i).get(1);
                
                if (givePoint > receivePoint) {
                    cnt++;
                } else if (givePoint == receivePoint) {
                    int giftPoint1 = giftPoints.get(key);
                    int giftPoint2 = giftPoints.get(friends[i]);
                    
                    if (giftPoint1 > giftPoint2) {
                        cnt++;
                    }
                }
            }
            
            if (answer < cnt) {
                answer = cnt;
            }
        }

        return answer; // 선물을 가장 많이 받을 친구가 받을 선물의 수
    }
    
    private Map<String, Integer> getIdxMap(String[] friends) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        return map;
    }
    
    private Map<String, List<List<Integer>>> initMap(String[] friends) {
        Map<String, List<List<Integer>>> map = new HashMap<>();
        
        for (String f1: friends) {
            List<List<Integer>> list = new ArrayList<>();
            map.put(f1, list);
            
            for (String f2 : friends) {
                List<List<Integer>> bigList = map.get(f1);
                List<Integer> miniList = new ArrayList<>();
                
                miniList.add(0); // 선물 준 스코어
                miniList.add(0); // 선물 받은 스코어
                bigList.add(miniList);
            }
        }
        
        return map;
    }
    
    private void checkScore(Map<String, Integer> idxMap, Map<String, List<List<Integer>>> scoreMap, String[] gifts) {
        for (String g : gifts) {
            String[] arr = g.split(" ");
            String giver = arr[0];
            String receiver = arr[1];
            int idx1 = idxMap.get(receiver);
            int idx2 = idxMap.get(giver);
            
            int giveScore = scoreMap.get(giver).get(idx1).get(0);
            int receiveScore = scoreMap.get(receiver).get(idx2).get(1);
            
            scoreMap.get(giver).get(idx1).set(0, ++giveScore); // 준 사람에게 점수 기록
            scoreMap.get(receiver).get(idx2).set(1, ++receiveScore); // 받은 사람에게 점수 기록
        } 
    }
    
    private Map<String, Integer> getGiftPoints(Map<String, Integer> idxMap, Map<String, List<List<Integer>>> scoreMap, String[] keys) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String key : keys) {
            int point = 0;
            
            for (int i = 0; i < scoreMap.get(key).size(); i++) {
                point += scoreMap.get(key).get(i).get(0); // 준 점수
                point -= scoreMap.get(key).get(i).get(1); // 받은 점수
            }
            
            map.put(key, point);
        }
        
        return map;
    }
}