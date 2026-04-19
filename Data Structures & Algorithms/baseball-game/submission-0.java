class Solution {
    public int calPoints(String[] operations) {
        Deque<String> stack = new ArrayDeque<>();
        int sum = 0;

        for (String op : operations) {
            if (op.equals("D")) {
                int doubtlePrvs = Integer.parseInt(stack.peek()) * 2;
                stack.push(String.valueOf(doubtlePrvs));
                sum = sum + doubtlePrvs;
            } else if (op.equals("C")) {
                String prev = stack.pop();
                sum = sum - Integer.parseInt(prev);
            } else if (op.equals("+")) {
                int last = Integer.parseInt(stack.pop());
                int secondLast = Integer.parseInt(stack.peek());
                int twosum = last + secondLast;
                String strSum = String.valueOf(twosum);
                stack.push(String.valueOf(last));
                stack.push(strSum);
                sum = sum + twosum;
            } else {
                stack.push(op);
                sum = sum + Integer.parseInt(op);
            }
        }
        return sum;
    
    }
}