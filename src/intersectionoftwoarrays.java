class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer>result = new HashSet<>();

        for (int i=0; i<nums2.length; i++) {
            if (binarySearch(nums1, nums2[i])){
                result.add(nums2[i]);
            }
        }

        int[] finished = new int[result.size()];
        int count = 0;
        for (int i : result) {
            finished[count] = i;
            count++;
        }
        return finished;
    }

    public boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
            
        }
    return false; 
    }
}
