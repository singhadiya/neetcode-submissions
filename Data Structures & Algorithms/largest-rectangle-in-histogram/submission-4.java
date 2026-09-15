class Solution {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int ans = heights[0];
        if(length == 1) return ans;
        int index = 0;
        Stack<int []>s = new Stack<>();
        s.push(new int[]{0,heights[0]});
        for(int i=1;i<length;i++){
            index = i;
             while(!s.isEmpty() && s.peek()[1]>heights[i]){
                ans = Math.max(ans,s.peek()[1]*(i-s.peek()[0]));
                index = s.pop()[0];
            }
            s.push(new int[]{index,heights[i]});
        }
        while(!s.isEmpty()){
            ans = Math.max(ans,s.peek()[1]*(length-s.peek()[0]));
            s.pop();
        }
        return ans;
    }
}
