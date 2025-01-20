class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String bab = babbling[i];
            bab = checkCanBubble(bab);
            
            if (bab.length() == 0) {
                answer++;    
            }
        }
        
        return answer;
    }
    
    private String checkCanBubble(String word) {
        String[] canBabbleStr = {"aya", "woo", "ma", "ye"};
        int idx = -1;
        
        if (word.startsWith("aya") || word.startsWith("woo")) {
            idx = 3;
        } else if (word.startsWith("ye") || word.startsWith("ma")) {
            idx = 2;
        } else {
            return word;
        }
        
        return checkCanBubble(word.substring(idx));
    }
}