class Solution {
   public int firstP(int[] nums, int target){
        int left =0;
        int right = nums.length -1;
        int firstIdx = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                firstIdx = mid;
                right = mid -1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return firstIdx;
    }
    public int lastP(int[] nums, int target){
        int left =0;
        int right = nums.length -1;
        int lastIdx = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                lastIdx = mid;
                left = mid + 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return lastIdx;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums==null){
            return new int[] {-1,-1};
        }
        int f = firstP(nums,target);
        if(f ==-1){
            return new int[] {-1,-1};
        }
        int l = lastP(nums,target);
        return new int[] {f,l};
    }
}