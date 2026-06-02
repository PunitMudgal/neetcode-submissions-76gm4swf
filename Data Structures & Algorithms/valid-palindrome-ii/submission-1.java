class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return check(s.substring(0, l) + s.substring(l + 1))
                    || check(s.substring(0, r) + s.substring(r + 1));
            }
            l++;
            r--;
        }
        return true;
    }
    static boolean check(String s) {
        int f = 0, e = s.length() - 1;
        while (f <= e) {
            if (s.charAt(f) != s.charAt(e)) {
                return false;
            }
            f++;
            e--;
        }
        return true;
    }
}