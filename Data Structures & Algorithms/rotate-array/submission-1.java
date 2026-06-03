class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> arr = new ArrayList<>();

        int i = k;
        while(i != nums.length){
            arr.add(nums[i]);
            i++;
        }
        for(int j =0; j<k; j++){
            arr.add(nums[j]);
        }
        for(int n=0; n<nums.length; n++){
            nums[n] = arr.get(n);
        }
    }
}