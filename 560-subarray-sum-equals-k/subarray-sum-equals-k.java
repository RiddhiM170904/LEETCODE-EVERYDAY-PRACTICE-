class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int curr = 0;
            for(int j=i;j<n;j++){
                curr = curr + nums[j];
                if(curr==k){
                    count++;
                }
            }
        }
        return count;
    }
}