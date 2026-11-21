class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l = 0
        r = len(s) -1
        arr = list(s)        
        while l <= r:
            if arr[l] == arr[r]:
                l += 1
                r -= 1
            else: return False
        return True