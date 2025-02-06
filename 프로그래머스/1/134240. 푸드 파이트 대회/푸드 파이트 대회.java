class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int foodNum = food[i];
            
            for (int j = 0; j < foodNum / 2; j++) {
                sb.append(i);
            }
        }
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb.toString());
        sb2.append(0);
        sb2.append(sb.reverse().toString());
        
        return sb2.toString();
    }
}