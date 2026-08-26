class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int ans = 0;

        for (String word : words) {
            int[] temp = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                temp[c - 'a']++;

                if (temp[c - 'a'] > freq[c - 'a']) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                ans += word.length();
            }
        }

        return ans;
    }
}