class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int foodNum = food[i];
            
            if (foodNum < 2) {
                continue;
            }
            
            for (int j = 0; j < foodNum / 2; j++) {
                sb.append(i);
            }
        }
        
        String one = sb.toString();
        String two = sb.reverse().toString();
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(one);
        sb2.append(0);
        sb2.append(two);
        
        return sb2.toString();
    }
}