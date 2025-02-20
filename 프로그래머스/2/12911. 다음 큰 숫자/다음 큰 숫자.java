class Solution {
    public int solution(int n) {
        int binaryOneCnt = Integer.bitCount(n);
        int binaryOneCntForTarget = 0;
        
        while (true) {
            binaryOneCntForTarget = Integer.bitCount(++n);
            
            if (binaryOneCnt == binaryOneCntForTarget) {
                return n;
            }
        }
    }
    
    private int cntBinaryOne(int val) {
        int cnt = 0;
        char[] arr = Integer.toBinaryString(val).toCharArray();
        
        for (char c : arr) {
            if (c - '0' == 1) {
                cnt++;
            }
        }
        
        return cnt;
    }
}