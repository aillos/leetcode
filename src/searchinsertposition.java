class Solution {
    public int searchInsert(int[] nums, int target) {
                if (nums[0]>target)return 0;
        if (nums[nums.length-1]<target)return nums.length;
        int left = 0;
        int right = nums.length - 1;
        int insertPos = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                insertPos = left;
            } else {
                right = mid - 1;
                insertPos = mid;
            }
        }

        return insertPos;
    }
}
