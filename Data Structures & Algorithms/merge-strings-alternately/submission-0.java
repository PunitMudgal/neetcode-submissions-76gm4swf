class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        StringBuilder str = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }

        if (word1.length() == i)
            str.append(word2.substring(j));
        else
            str.append(word1.substring(i));

        return str.toString();
    }
}