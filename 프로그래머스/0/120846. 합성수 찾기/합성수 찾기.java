class Solution {
    public int solution(int n) {
        int count = 0;

        for(int i = 4; i <= n; i++) {
            if(isComposite(i)) {
                count++;
            }
        }

        return count;
    }

    boolean isComposite(int number) {
        for(int i = 2; i < number / 2 + 1; i++) {
            if(number % i == 0) {
                return true;
            }
        }

        return false;
    }
}