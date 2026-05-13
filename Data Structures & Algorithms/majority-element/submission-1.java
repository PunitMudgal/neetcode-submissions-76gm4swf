class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0, res = 0;

        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);

            if (map.get(num) > maxCount) {
                res = num;
                maxCount = map.get(num);
            }
        }
        return res;
    }
}