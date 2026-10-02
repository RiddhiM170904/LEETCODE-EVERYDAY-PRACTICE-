class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int n : piles){
            high = Math.max(high,n);
        }
        while(low<high){
            int mid = low + (high - low)/2;
            if(caneat(h,piles,mid)){
                high = mid;
            }else low = mid + 1;
        }
        return low;
    }
    public boolean caneat(int h,int[] piles,int mid){
        int hours = 0 ;
        for(int num : piles){
            hours += (int) Math.ceil((double) num/mid);
        }
        return hours<=h;
    }
}