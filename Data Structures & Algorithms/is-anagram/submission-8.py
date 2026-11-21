class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        hashmaps = {}
        hashmapt = {}
        for char in s:
            if char not in hashmaps:
                hashmaps[char] = 1
            else:
                hashmaps[char] += 1
        for char in t:
            if char not in hashmapt:
                hashmapt[char] = 1
            else:
                hashmapt[char] += 1
        return hashmapt == hashmaps
