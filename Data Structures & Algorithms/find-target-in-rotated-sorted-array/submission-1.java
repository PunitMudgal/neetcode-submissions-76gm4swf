class Solution {
    public int search(int[] nums, int target) {
        int maxNum = 0, index=0;

        // find max number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                index = i;
            }
        }

        int s = target < nums[0] ? index+1: 0, e = target >= nums[0] ? index : nums.length-1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target == nums[m])
                return m;
            else if (target < nums[m])
                e = m - 1;

            else
                s = m + 1;
        }
        return -1;
    }
}
