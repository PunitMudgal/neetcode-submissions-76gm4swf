class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longestSeq = 1;
    if(nums.length>1) return 0;
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else map.put(nums[i], 1);
        }

        for(int j=0; j<nums.length; j++){
            while(map.containsKey(nums[j]+1) && map.get(nums[j]+1) == 1 ){
                longestSeq++;
                break;
            }
        }
        return longestSeq;
    }
}
