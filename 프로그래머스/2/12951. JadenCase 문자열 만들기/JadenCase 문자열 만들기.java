class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        // 문자열 순회
        boolean isStartOfWord = true; // 단어의 시작 여부를 판단
        for (char c : s.toCharArray()) {
            if (c == ' ') { // 공백인 경우
                sb.append(c);
                isStartOfWord = true; // 단어 시작 플래그 갱신
            } else if (isStartOfWord) { // 단어의 첫 글자
                sb.append(Character.toUpperCase(c));
                isStartOfWord = false;
            } else { // 단어의 나머지 글자
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}