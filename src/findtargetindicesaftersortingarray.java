class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int [] result = new int [2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);

        List<Integer> list = new ArrayList<>();
        if (result [0] != -1 && result[1] != -1) {
            for (int i=result[0]; i<=result[1]; i++) {
                list.add(i);
            }
        }
        return list;
    }

    public int findStartingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int midpoint = start + (end-start) / 2;
            if (nums[midpoint] >= target) {
                end = midpoint-1;
            } else {
                start = midpoint+1;
            }
            if (nums[midpoint] == target) index = midpoint;
        }

        return index;
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
