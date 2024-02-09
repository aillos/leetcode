class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i<nums.length;){
            int x = 1+findEndingIndex(nums, nums[i]) - i;
            if (nums.length/2 < x) return nums[i];
            i += x;
        }

        return 0;
    }
        public int findEndingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int midpoint = start + (end-start) / 2;
            if (nums[midpoint] <= target) {
                start = midpoint+1;
            } else {
                end = midpoint-1;
            }
            if (nums[midpoint] == target) index = midpoint;
        }

        return index;
    }
}
