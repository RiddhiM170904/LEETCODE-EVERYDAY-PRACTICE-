class Solution {
    public int minimizedStringLength(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }

        return count;
    }
}