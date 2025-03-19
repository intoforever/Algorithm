class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0], maxX = dots[0][0], minY = dots[0][1], maxY = dots[0][1];
        
        for (int i = 1; i < dots.length; i++) {
            int x = dots[i][0], y = dots[i][1];
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        
        int v = Math.abs(maxX - minX);
        int h = Math.abs(maxY - minY);
        
        return  v * h;
    }
}