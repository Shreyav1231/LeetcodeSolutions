class Solution {
    public int searchInsert(int[] nums, int target) {
        // searching algorithm - binary search to get O(logn)
        int left = 0;
        int right = nums.length - 1;
        return recursiveFind(target, nums, left, right);
    }
    public int recursiveFind(int target, int[] nums, int left, int right) {
        if (left <= right) {
            int middleIndex = left + (right - left) / 2;
            if (target == nums[middleIndex]) {
                return middleIndex;
            }
            if (target > nums[middleIndex]) { // lies in right half 
                return recursiveFind(target, nums, middleIndex + 1, right);
            }
            if (target < nums[middleIndex]) {
                return recursiveFind(target, nums, left, middleIndex - 1);
            }
        }
        return left;
    }
}
