class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 2; i < nums.length; i++) {
            int num1 = nums[i - 2];
            for (int j = i; j < nums.length; j++) {
                int num2 = nums[j - 1];
                for (int k = j; k < nums.length; k++) {
                    int num3 = nums[k];
                    answer += checkIfPrime(num1, num2, num3);
                }
            }
        }

        return answer;
    }
    
    public int checkIfPrime(int num1, int num2, int num3) {
        boolean isPrime = true;
        int num = num1 + num2 + num3;
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}