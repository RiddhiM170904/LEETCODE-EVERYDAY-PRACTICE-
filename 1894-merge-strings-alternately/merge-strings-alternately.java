class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int min = Math.min(n1,n2);
        String ans = "";

        for(int i=0;i<min;i++){
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }
        if(n1>n2){
            ans += word1.substring(min);
        }else{
            ans += word2.substring(min);
        }
        return ans;
    }

}