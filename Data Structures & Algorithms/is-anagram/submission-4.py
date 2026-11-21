class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        reversed = s[::-1]
        revArr = list(reversed)
        for i, char in enumerate(s):
            if char == revArr[i]:
                continue
            else:
                return False
        return True

