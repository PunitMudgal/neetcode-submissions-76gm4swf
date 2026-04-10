class Solution {
    public int maxArea(int[] heights) {
        int s = 0, e = heights.length -1;
        int maxArea = 0;
        // for(int i = 0; i<heights.length; i++){
        while(e>s){
            int diff = e - s;
            int area = (Math.min(heights[s], heights[e]) * diff);
            maxArea = Math.max(maxArea, area);
            if(heights[s] < heights[e]) s++;
            else e--;
        }
        return maxArea;
    }
}
