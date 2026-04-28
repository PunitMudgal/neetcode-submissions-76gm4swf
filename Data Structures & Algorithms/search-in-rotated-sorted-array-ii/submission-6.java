class Solution {
    public boolean search(int[] nums, int target){
        int s = 0, e = nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;

            if(nums[m] == target) return true;

            if(nums[m] > nums[s]){ // left portion
                if(nums[m] > target && target >= nums[s])
                    e = m-1;
                
                else s = m+1;
            }
            else if(nums[m] < nums[s]){ // right portion
                if(nums[m] < target && target <= nums[e])
                    s = m+1;
                    else e = m-1;
            }
            else s++;
        }
        return false;

    }
}

