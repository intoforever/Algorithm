import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger num1 = getFactorial(balls);
        BigInteger num2 = getFactorial(balls - share).multiply(getFactorial(share));
        BigInteger answer = num1.divide(num2);
        
        return answer.intValue();
    }
    
    private BigInteger getFactorial(int num) {
        if (num == 0 || num == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(getFactorial(num - 1));
    }
}