import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        HonorClass honorClass = new HonorClass(k, score);
        
        return honorClass.checkAnnounceScore();
    }
}

class HonorClass {
    private int[] answer;
    private int[] temp;
    private int[] score;
    private int min;
    private int k;
    
    public HonorClass(int k, int[] score) {
        this.answer = new int[score.length];
        this.temp = new int[k];
        this.score = score;
        this.k = k;
        
        int num = score[0];
        
        this.answer[0] = num;
        this.temp[0] = num;
        this.min = num;
    }
    
    public int[] checkAnnounceScore() {
        for (int i = 1; i < this.score.length; i++) {
            int num = this.score[i];
            
            if (i < this.k) {
                this.temp[i] = num;
                
                if (this.min > num) {
                    this.min = num;
                }
                
                this.answer[i] = min;
                
                if (i == this.k - 1) {
                    Arrays.sort(this.temp);
                }
                
                continue;
            }
            
            if (this.temp[0] < num) {
                this.temp[0] = num;
                Arrays.sort(this.temp);
                
                this.min = this.temp[0];
            }
            
            this.answer[i] = this.min;
        }
        
        return answer;
    }
}