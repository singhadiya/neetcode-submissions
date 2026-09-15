class Solution {
    public int trap(int[] height) {
        int len = height.length;
        if(len<3){
            return 0;
        }
        int [] left = new int [len];
        left[0]=0;
        int [] right = new int [len];
        right[len-1] = 0;
        int max=0;
        for(int i=1; i<len; i++){
            left[i] = Math.max(max,height[i-1]);
            max = Math.max(max,height[i-1]);
        }
        for(int l : left){
            System.out.println("left : "+l);
        }
        max = 0;
        for(int i = len-2; i>=0;i--){
            right[i] = Math.max(max,height[i+1]);
            max = Math.max(max,height[i+1]);
        }
        for(int r : right){
            System.out.println("right : "+r);
        }
        int ans = 0;
        int diff = 0;
        for(int i = 1;i<len-1;i++){
            diff = Math.min(left[i],right[i])-height[i];
             if(diff > 0){
                ans+=diff;
             }
        }
        return ans;
    }
}
