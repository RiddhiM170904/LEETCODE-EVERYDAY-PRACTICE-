class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();//jisko convert krna h
        int m = word2.length();//jisme convert krna h 
        int dp[][] = new int[n+1][m+1];//2d dp banai

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){ // agar jisko convert krna h uski value " " ho - j addtions
                    dp[i][j] = j;
                }
                if(j==0){ // agar jisme convert krna ho uski value " " ho - i deletions
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){//same wali condition
                    dp[i][j] = dp[i-1][j-1];
                }
                else{//alg wali condition
                    int add = dp[i][j-1] + 1;// agr add kre tohh 2nd wali arr me kam hoga
                    int del = dp[i-1][j] + 1;// agr add kre tohh 1st wali arr me kam hoga
                    int rep = dp[i-1][j-1] + 1;// agr add kre dono me kam hoga
                    dp[i][j] = Math.min(rep,Math.min(add,del));// teeno ka min
                }
            }
        }
        return dp[n][m];
    }
}