import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> charToMinPress = buildCharacterMap(keymap);
        
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            result[i] = calculatePressCount(targets[i], charToMinPress);
        }
        
        return result;
    }
    
    private Map<Character, Integer> buildCharacterMap(String[] keymap) {
        Map<Character, Integer> charToMinPress = new HashMap<>();
        
        for (String keys : keymap) {
            char[] chars = keys.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                int pressCount = i + 1;
                
                Integer currentMin = charToMinPress.get(ch);
                if (currentMin == null || pressCount < currentMin) {
                    charToMinPress.put(ch, pressCount);
                }
            }
        }
        
        return charToMinPress;
    }
    
    private int calculatePressCount(String target, Map<Character, Integer> charToMinPress) {
        int totalPress = 0;
        
        for (char ch : target.toCharArray()) {
            Integer pressCount = charToMinPress.get(ch);
            if (pressCount == null) {
                return -1;
            }
            totalPress += pressCount;
        }
        
        return totalPress;
    }

}