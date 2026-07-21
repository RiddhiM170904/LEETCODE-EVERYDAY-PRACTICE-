class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int size =0;
        int max = 0;
        int right =0;
        HashSet<Character> set = new HashSet<>();// for identifying duplicate characters
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){//check for duplicates 
                set.add(ch);
                max = Math.max(max,right-left+1);//length badhao 
                right++;
            }else{
                set.remove(s.charAt(left));//remove agr duplicate mile tohh
                left++;
            }
        }
        return max;//max subarray kii length return krr do
        //if not present 0 aa jayega
    }
}