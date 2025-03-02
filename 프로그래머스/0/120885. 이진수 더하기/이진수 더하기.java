class Solution {
    public String solution(String bin1, String bin2) {
        int intBin1 = Integer.parseInt(bin1, 2);
        int intBin2 = Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(intBin1 + intBin2);
    }
}