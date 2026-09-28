class Solution {
    public int maxDepth(String s) {
        int dept = 0;
        int max = 0;

        for(char ch  : s.toCharArray()){
            if(ch=='('){
                dept++;
                max = Math.max(dept,max);
            }else if(ch==')'){
                dept--;
            }
        }
        return max;
    }
}