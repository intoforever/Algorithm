import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(numlist);
        
        for (int num : numlist) {
            int val = Math.abs(n - num);
            sb.append(num);
            sb.append("-");
            map.put(val, map.getOrDefault(val, "") + sb.toString());
            sb.setLength(0);
        }
        
        int[] answer = new int[numlist.length];
        int[] keys = map.keySet().stream().mapToInt(i->i).toArray();
        Arrays.sort(keys);
        int idx = 0;
        for (int key : keys) {
            String[] arr = map.get(key).split("-");
            for (int j = arr.length - 1; j >= 0; j--) {
                int val = Integer.parseInt(arr[j]);
                answer[idx++] = val;
            }
        }
        
        return answer;
    }
}