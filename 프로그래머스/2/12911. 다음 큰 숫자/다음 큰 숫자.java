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
}