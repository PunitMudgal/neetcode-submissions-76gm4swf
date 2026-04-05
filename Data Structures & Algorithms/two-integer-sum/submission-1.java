class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) return null;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
           int nxtNum = target - nums[i];
           if(map.containsKey(nums[i])) {
            return new int[] {map.get(nums[i]), i};
           }else{
            map.put(nxtNum, i);
           }
        }
        return null;
    }
}
