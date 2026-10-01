class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i : piles){
            high = Math.max(high,i);
        }
        while(low < high){
            int mid = low + (high - low)/2;

            //int h = 0;
            if(caneat(piles,h,mid)){
                high = mid;
            }else low = mid + 1;
        }
        return low;
    }
    public boolean caneat(int[] piles, int h, int mid){
        int hours = 0;
        for(int pile : piles){
            hours += (int) Math.ceil((double) pile / mid);
        }
        return hours<=h;
    }
}