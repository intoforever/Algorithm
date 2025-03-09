import java.util.Map;

class Solution {
    public long solution(String numbers) {
        String[] numbersArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbersArr.length; i++) {
            numbers = numbers.replaceAll(numbersArr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}