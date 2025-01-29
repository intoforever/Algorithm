class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            if (wMax < w) {
                wMax = w;
            }
            
            if (hMax < h) {
                hMax = h;
            }
        }
        
        return wMax * hMax;
    }
}