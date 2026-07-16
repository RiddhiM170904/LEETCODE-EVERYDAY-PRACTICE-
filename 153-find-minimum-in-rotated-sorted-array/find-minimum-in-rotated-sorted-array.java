class Solution {
    public int findMin(int[] nums) {
        if(nums.length <= 1) return nums[0];

        int n = nums.length;

        int l = 0, h =n-1;
        while(l<h){
            int m = l + (h-l)/2;

            if(nums[m]<= nums[h]){
                h = m;
            }else{
                l = m +1;
            }
        }
        return nums[l];
    }
}