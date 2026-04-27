class Solution {
    public int search(int[] nums, int target) {
       int pivot = searchPivot(nums);

        int result = findTargetValue(nums, 0, pivot, target);
        if(result != -1) return result;

        return findTargetValue(nums, pivot+1, nums.length-1, target);
    }

    public static int searchPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid< end && nums[mid] > nums[mid + 1]) {
                return mid;

            } if ( mid> start&& nums[mid] < nums[mid - 1]) {
                return mid - 1;

            } if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return -1;
    }

     static int findTargetValue(int[] nums, int start, int end, int target){
        while(start<=end){
        int mid = start +(end - start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) 
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
     }   
}