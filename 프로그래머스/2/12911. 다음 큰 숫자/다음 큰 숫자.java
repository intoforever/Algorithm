class Solution {
    public int solution(int n) {
        int answer = 0;
        int binaryOneCnt = cntBinaryOne(n);
        int binaryOneCntForTarget = 0;
        
        while (true) {
            binaryOneCntForTarget = cntBinaryOne(++n);
            
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