class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for num in operations:
            if num == "+":
               stack.append(stack[-1] + stack[-2])
            elif num == "D":
                stack.append(stack[-1]*2)
            elif num == "C":
                stack.pop()
            else:
                stack.append(int(num))
        return sum(stack)