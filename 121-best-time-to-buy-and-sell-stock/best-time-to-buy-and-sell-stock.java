class Solution {
    public int maxProfit(int[] prices) {
        int minp = prices[0];
        int maxp = 0;

        for(int i=1;i<prices.length;i++){
            minp = Math.min(minp,prices[i]);
            int p = prices[i] - minp;
            maxp = Math.max(maxp,p);
        }
        return maxp;
    }
}