// solving using hashmaps
class Solution {
    public boolean search(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else map.put(num, 1);
        }

        if(map.containsKey(target))return true;
        else return false;
    }
}