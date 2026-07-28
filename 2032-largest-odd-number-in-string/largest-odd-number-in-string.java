class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String str = "";
        for(int i=n-1;i>=0;i--){
            char ch = num.charAt(i);
            int a = ch - '0';
            if(a%2!=0){
                str += num.substring(0,i+1);
                break;
            }
        }
        return str;
    }
}