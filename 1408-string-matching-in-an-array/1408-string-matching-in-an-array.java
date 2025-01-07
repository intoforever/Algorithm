class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            for (int i=0; i < words.length; i++) {
                if (!word.equals(words[i]) && words[i].contains(word)) {
                    set.add(word);
                }
            }
        }

        List<String> list = new ArrayList<>(set);
        
        return list;
    }
}