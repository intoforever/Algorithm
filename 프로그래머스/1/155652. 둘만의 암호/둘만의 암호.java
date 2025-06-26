import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        init(map, list, skip);
        
        // s에 있는 문자열 순회하면서 pool의 hash
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int value = map.get(arr[i]) + index;
            sb.append(list.get(value % list.size()));
        }
        
        return sb.toString();
    }
    
    public void init(Map<Character, Integer> map, List<Character> list, String skip) {
        char[] charArr = skip.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charArr) {
            set.add(c);
        }
        
        char c = 97; // 'a'
        int idx = 0;
        for (int i = 0; i < 26; i++, c++) {
            if (set.contains(c)) {
                continue;
            }
            map.put(c, idx++);
            list.add(c);
        }
    }
}