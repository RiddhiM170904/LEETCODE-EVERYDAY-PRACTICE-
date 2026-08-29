class Solution {
    public boolean checkGoodInteger(int n) {
        int ds = 0;
        int ss = 0;
        while(n>0){
            int temp = n%10;
            ds += temp;
            ss += temp*temp;
            n = n/10;
        }
        return (ss - ds >= 50);
    }
}