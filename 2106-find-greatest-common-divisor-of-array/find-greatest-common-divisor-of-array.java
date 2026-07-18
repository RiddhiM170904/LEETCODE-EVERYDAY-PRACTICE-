class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        int m = Math.max(a,b);
        int ans =1;
        if(a==b){
            return a;
        }
        for(int i=1;i<m;i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        return ans;
    }
}