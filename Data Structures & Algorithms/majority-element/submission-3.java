class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
        // because given in question that majority exists more than n/2 times in
        // array so its sure after sorting number would be at n/2.
    }
}