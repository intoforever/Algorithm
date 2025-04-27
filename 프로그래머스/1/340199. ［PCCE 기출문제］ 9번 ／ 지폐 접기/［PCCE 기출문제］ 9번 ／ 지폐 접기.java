class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletX = Math.min(wallet[0], wallet[1])
            , walletY = Math.max(wallet[0], wallet[1])
            , billX = Math.min(bill[0], bill[1])
            , billY = Math.max(bill[0], bill[1]);
        
        while (walletX < billX || walletY < billY) {
            billY /= 2;
            answer++;
            if (billX > billY) {
                int temp = billY;
                billY = billX;
                billX = temp;
            }
        }
        
        return answer;
    }
}