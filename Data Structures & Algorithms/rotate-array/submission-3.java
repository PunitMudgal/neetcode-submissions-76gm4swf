public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1); // first rotate whole array
        //arr=8,7,6,5,4,3,2,1  k=4
        reverse(nums, 0, k - 1); // then rotate till k first portion
        // 5,6,7,8,  4,3,2,1
        reverse(nums, k, n - 1); // rotate second portion
        // 5,6,7,8,  1,2,3,4
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}