class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        int pivot = s;
        int result = binarySearch(nums, target, 0, pivot - 1);
        if (result != -1) {
            return true;
        } else {
            int result2 = binarySearch(nums, target, pivot, nums.length - 1);
            if (result2 != -1)
                return true;
            else
                return false;
        }
    }
    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}