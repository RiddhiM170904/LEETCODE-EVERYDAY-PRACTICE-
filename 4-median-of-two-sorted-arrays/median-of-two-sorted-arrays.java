class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c = nums1.length + nums2.length;
        int arr[] = new int[c];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            arr[i+nums1.length]=nums2[i];
        }
        Arrays.sort(arr);
        if(c%2!=0){
            return (double) arr[c/2 ];
        }else{
            return (double) (arr[c/2]+arr[c/2-1])/2;
        }
    }
}