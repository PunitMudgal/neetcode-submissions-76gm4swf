class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        rightElem = -1
        n = len(arr)
        ans = [0] * n
        for i in range(n - 1, -1, -1):
            ans[i] = rightElem
            rightElem = max(arr[i], rightElem)
        return ans