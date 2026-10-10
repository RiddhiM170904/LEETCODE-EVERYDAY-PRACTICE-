class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        if(s.length()<=1) return true;
        while(start<end){
            int left = s.charAt(start);
            int right = s.charAt(end);
            if(!Character.isLetterOrDigit(left)) start++;
            else if(!Character.isLetterOrDigit(right)) end--;
            else{
                if(Character.toLowerCase(left)!=Character.toLowerCase(right)) return false;
                else{
                    start++;
                    end--;
                }
            }
        }
        return true;   
    }
}