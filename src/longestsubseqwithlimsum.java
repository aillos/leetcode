class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        for (int i = 0; i < queries.length; i++) {
            int start = 0;
            int end = nums.length-1;
            int index = 0;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] <= queries[i]) {
                    index = mid+1;
                    start = mid+1;
                } else {
                    end = mid-1;
                }

            }
            queries[i] = index;
        }

        return queries;
    }
}
