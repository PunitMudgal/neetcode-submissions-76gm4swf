class Solution {
    public boolean isPalindrome(String s) {
    String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return checkPalindrome(newStr, 0, newStr.length()-1);
    }
    static Boolean checkPalindrome(String str, int start, int end){
        if(start>end){
            return true;
        }
        if(str.charAt(start) == str.charAt(end)) return checkPalindrome(str, start+1, end-1);
        else return false;
    }
}
