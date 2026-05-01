class Solution {
    public int mySqrt(int x) {
        int s = 0, e = x;
        int res = 0;

        while (e >= s) {
            int m = s + (e - s) / 2;

            if ((long) m * m > x) {
                e = m - 1;
            } else if ((long) m * m < x) {
                res = m;
                s = m + 1;
            } else
                return m;
        }
        return res;
    }
}