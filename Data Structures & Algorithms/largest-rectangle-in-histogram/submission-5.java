class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>p = new Stack<>();
        Stack<Integer>q = new Stack<>();
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            int height = heights[i];
            if(p.isEmpty()){
                p.push(height);
                continue;
            }
            if(p.peek()<=height){
                p.push(height);
                continue;
            }
            while(!p.isEmpty()&&p.peek()>height){
                q.push(p.pop());
            }
            for(int j=0;j<q.size();j++){
                 p.push(height);
            }
            p.push(height);

            while(q.isEmpty()==false){
                ans = Math.max(ans,q.size()*q.peek());
                q.pop();
            }
        }
        while(p.isEmpty()==false){
            q.push(p.pop());
        }
        while(q.isEmpty()==false){
                ans = Math.max(ans,q.size()*q.peek());
                q.pop();
            }
        return ans;
    }
}
