class Solution {
    public int maximumCount(int[] nums) {
       int start = 0, end = nums.length-1;
       int pos = 0, neg = 0;

       while (start <= end) {
          int mid = (start + end)/2;
          if (nums[mid] > 0) {
             pos = nums.length - mid;
             end = mid - 1;
          }
          if (nums[mid] <= 0) {
              start = mid + 1;
          }
       } 
 
       int first = 0, last = nums.length-1;
        while (first <= last) {
          int mid = (first + last)/2;
          if (nums[mid] < 0) {
             neg = mid + 1;
             first = mid + 1;
          }
          if (nums[mid] >= 0) {
              last = mid - 1;
          }
       } 
       return Math.max(pos,neg);
    }
}
