class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;

        while(left<=right){
            char chl = s.charAt(left);
            char chr = s.charAt(right);
            
            if(!Character.isLetterOrDigit(chl)){
                left++;
            }
            else if(!Character.isLetterOrDigit(chr)){
                right--;
            }else{
                if(Character.toLowerCase(chl)!=Character.toLowerCase(chr)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}