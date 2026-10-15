class Solution {
    public int sumCounts(List<Integer> nums) {
        // int[] arr = nums.stream().mapToInt(Integer::intValue).toArray();
        int n = nums.size();
        int sum = 0;
        for(int i=0;i<n;i++){
            HashSet<Integer> h = new HashSet<>();
            for(int j=i;j<n;j++){
                h.add(nums.get(j));
                int count = h.size();
                sum += count*count;
            }
        }
        return sum;
    }
}