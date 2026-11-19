class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        greatestElem = -1
        ans = []
        for i in reversed(arr):
            ans.append(greatestElem)
            greatestElem = max(i, greatestElem)
        return ans[::-1]          # reverse back to original order