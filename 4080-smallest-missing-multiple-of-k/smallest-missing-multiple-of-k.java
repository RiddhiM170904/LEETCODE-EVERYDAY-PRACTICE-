class Solution {
    public int missingMultiple(int[] nums, int k) {
        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     set.add(num);
        // }

        // int multiple = k;

        // while (set.contains(multiple)) {
        //     multiple += k;
        // }

        // return multiple;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int m = k;

        while(set.contains(m)){
            m += k;
        }
        return m;
    }
}