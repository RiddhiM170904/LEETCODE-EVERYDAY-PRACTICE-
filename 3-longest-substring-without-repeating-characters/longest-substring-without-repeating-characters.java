class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            int curr = 0;
            int j =i;
            h.clear();
            while(j!=s.length()){
                if(!h.contains(s.charAt(j))){
                    h.add(s.charAt(j));
                    curr++;
                    j++;
                }else{
                    max = Math.max(curr,max);
                    break;
                }
            }
            max = Math.max(curr,max);
        }
        return max;
    }
}