class Solution {
    public int solution(int n, String control) {
        String[] arr = control.split("");
        
        for(String a:arr){
            if(a.equals("w"))
                n += 1;
            else if(a.equals("s"))
                n -= 1;
            else if(a.equals("d"))
                n += 10;
            else if(a.equals("a"))
                n -= 10;
        }
        
        return n;
    }
}