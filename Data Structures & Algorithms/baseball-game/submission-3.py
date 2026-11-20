class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        num = 0
        for op in operations:
            if op == "+":
                num += stack[-1] + stack[-2]
                stack.append(stack[-1] + stack[-2])
            elif op == "D":
                num += stack[-1] * 2
                stack.append(stack[-1] * 2)
            elif op == "C":
                num -= stack[-1]
                stack.pop()
            else:
                num += int(op)
                stack.append(int(op))
        return num



