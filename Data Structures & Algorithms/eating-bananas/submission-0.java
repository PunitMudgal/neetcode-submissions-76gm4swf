class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > e) {
                e = piles[i];
            }
        }

        int ans = e;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (check(piles, h, mid)) {
                ans = mid; // could be the answer
                e = mid - 1; // try lower number
            } else
                s = mid + 1; // try bigger number
        }
        return ans;
    }

    // check if koko can fininsh with speed mid
    private boolean check(int[] piles, int h, int k) {
        int totalTime = 0;
        for (int banana : piles) {
            // totalTime += Math.ceil(banana / k);
            totalTime += (banana + k - 1) / k;
        }
        if (totalTime <= h)
            return true;
        else
            return false;
    }
}
