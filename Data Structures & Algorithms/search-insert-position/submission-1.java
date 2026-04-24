class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1;

        while(s<=e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(s==e){
                if(target > mid) return mid+1;
                else return mid-1;
            }
            else if(nums[mid] < target)
                s = mid+1;
            else e = mid-1;
        }
        return -1;
    }
}