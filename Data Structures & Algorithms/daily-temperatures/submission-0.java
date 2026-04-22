class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int index = 0;
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    result[i] = index;
                    break;
                } else if (j == temperatures.length - 1 && temperatures[i] < temperatures[j]) {
                    result[i] = 0;
                    break;
                }
                index++;
            }
        }
        return result;
    }
}