class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int nots = 0;
        int prevNots = 0;
        for (int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                nots = nots+1;
            }else {
                if(prevNots <= nots){
                    prevNots = nots;
                    nots = 0;
                }
            }
        }
         if (prevNots >= nots) return prevNots; else return nots;
    }
}