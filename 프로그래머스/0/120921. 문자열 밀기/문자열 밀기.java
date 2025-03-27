class Solution {
    public int solution(String A, String B) {
        String sentence = B.repeat(2);
        return sentence.indexOf(A);
    }
}