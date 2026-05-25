class Solution {
    public void sortColors(int[] nums) {

        // bucket/count array
        int[] counts = {0, 0, 0};

        // count frequency of 0,1,2
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        // fill original array
        int index = 0;

        for (int j = 0; j < counts.length; j++) {

            for (int k = 0; k < counts[j]; k++) {
                nums[index] = j;
                index++;
            }
        }
    }
}