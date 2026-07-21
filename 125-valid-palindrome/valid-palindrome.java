class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str ="";
        for(int i =0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))|| Character.isDigit(s.charAt(i))){
                str += s.charAt(i);
            }
        }
        int m =0;
        int n = str.length()-1;
        while(m<=n){
            if(str.charAt(m)!=str.charAt(n)){
                return false;
            }
            else{
                m++;
                n--;
            }
        }
        return true;
    }
}