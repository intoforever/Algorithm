class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int cycle = (k - 1) * 2;
        int idx = cycle > len ? (cycle - len) % len : cycle; 
        
        return numbers[idx];
    }
}