class Solution {
    public int solution(String[] spell, String[] dic) {
        int cnt = spell.length;
        for (String d : dic) {
            cnt = spell.length;
            for (String s : spell) {
                if (d.contains(s)) {
                    cnt--;
                }
            }
            if (cnt == 0) {
                return 1;
            }
        }
        
        return 2;
    }
}