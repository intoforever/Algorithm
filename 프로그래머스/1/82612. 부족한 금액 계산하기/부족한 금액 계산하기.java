class Solution {
    public long solution(int price, int money, int count) {
        long sum = count * (count + 1) / 2;
        long totalFee = price * sum;
        long changes = money - totalFee;
        
        return Math.max(0, -1 * changes);
    }
}