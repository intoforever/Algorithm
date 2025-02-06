class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            String foodNum = String.valueOf(i);
            sb.append(foodNum.repeat(food[i] / 2));
        }
        
        return sb.toString() + "0" + sb.reverse().toString();
    }
}