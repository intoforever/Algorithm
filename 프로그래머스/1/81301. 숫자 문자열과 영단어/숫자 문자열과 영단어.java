import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        try {
            answer = Integer.parseInt(s);
        } catch (Exception e) {
            NumberGame ng = new NumberGame();
            answer = ng.getOriNumber(s);
        }
        return answer;
    }
}

class NumberGame {
    private Map<String, Integer> map;
    
    public NumberGame() {
        this.map = new HashMap<>();
        
        this.map.put("zero", 0);
        this.map.put("one", 1);
        this.map.put("two", 2);
        this.map.put("three", 3);
        this.map.put("four", 4);
        this.map.put("five", 5);
        this.map.put("six", 6);
        this.map.put("seven", 7);
        this.map.put("eight", 8);
        this.map.put("nine", 9);
    }
    
    public int getOriNumber(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                continue;
            }
            
            sb2.append(c);
            
            if (map.containsKey(sb2.toString())) {
                sb.append(map.get(sb2.toString()));
                sb2.setLength(0);
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}