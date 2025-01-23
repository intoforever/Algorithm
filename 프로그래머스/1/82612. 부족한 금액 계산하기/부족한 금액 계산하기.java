class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        long changes = 0;
        
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        
        changes = money - (price * sum);
        return changes < 0 ? -1L * changes : 0;
    }
}