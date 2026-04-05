class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return null;
        for(int i=0;i<nums.length;i++){
            int nextNum = target - nums[i];
            for(int j=i+1; j < nums.length; j++){
              if(nums[j]==nextNum){
                return new int[]{i, j};
              }
            }
        }
        return null;
    }
}
