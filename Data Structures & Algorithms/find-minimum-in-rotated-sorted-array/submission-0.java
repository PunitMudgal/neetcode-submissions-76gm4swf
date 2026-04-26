class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        int lowestNum = Integer.MAX_VALUE;
        while (s <= e) {
            // If already sorted, take leftmost and break
            if (nums[s] <= nums[e]) {
                lowestNum = Math.min(lowestNum, nums[s]);
                break;
            }
            int m = s + (e - s) / 2;
            lowestNum = Math.min(lowestNum, nums[m]);
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else if (nums[m] < nums[e]) {
                e = m - 1;
            }
        }
        return lowestNum;
    }
}
