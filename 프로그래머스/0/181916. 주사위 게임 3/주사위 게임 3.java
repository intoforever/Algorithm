import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        DiceGame diceGame = new DiceGame(a, b, c, d);
        int cases = diceGame.getCase();
        
        if (cases == 1) {
            answer = diceGame.processFirstCase();
        } else if (cases == 2) {
            answer = diceGame.processSecondCase();
        } else if (cases == 3) {
            answer = diceGame.processThirdCase();
        } else if (cases == 4) {
            answer = diceGame.processFourthCase();
        } else if (cases == 5) {
            answer = diceGame.processFifthCase();
        }
        
        return answer;
    }
}

class DiceGame {
    int a;
    int b;
    int c;
    int d;
    
    int[] keys;
    Map<Integer, Integer> map;
    int size;
    
    public DiceGame(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        
        this.keys = new int[4];
        keys[0] = a;
        keys[1] = b;
        keys[2] = c;
        keys[3] = d;
        
        this.map = new HashMap<>();
        for (int key : keys) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        this.size = map.keySet().size();
    }
    
    public int getCase() {
        int cases = 0;
        
        if (this.size == 1) {
            cases = 1;
        } else if (this.size == 2) {
            if (this.map.get(this.a) != 2) {
                cases = 2;
            } else {
                cases = 3;
            }
        } else if (this.size == 3) {
            cases = 4;
        } else if (this.size == 4) {
            cases = 5;
        }
        
        return cases;
    }
    
    public int processFirstCase() {
        return 1111 * this.a;
    }
    
    public int processSecondCase() {
        int p = 0;
        int q = 0;
        
        for (int key : map.keySet()) {
            if (map.get(key) == 3) {
                p = key;
            } else {
                q = key;
            }
        }
        
        return (int) Math.pow((10 * p + q), 2);
    }
    
    public int processThirdCase() {
        int p = 0;
        int q = 0;
        List<Integer> list = new ArrayList<>(map.keySet());
        
        p = list.get(0);
        q = list.get(1);
        
        return (p + q) * Math.abs(p - q);
    }
    
    public int processFourthCase() {
        int p = 0;
        int q = 0;
        int r = 0;
        
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                p = key;
            } else if (q == 0) {
                q = key;
            } else {
                r = key;
            }
        }
        
        return q * r;
    }
    
    public int processFifthCase() {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }
}