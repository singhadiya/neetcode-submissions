class Solution {
    public int trap(int[] height) {
        int[]left = new int[height.length];
        int[]right = new int[height.length];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i-1]);
            right[height.length-1-i]=Math.max(right[height.length-i],height[height.length-i]);
        }
        int ans = 0;
        for(int i=0;i<height.length;i++){
            ans += Math.min(left[i],right[i])-height[i]>0?Math.min(left[i],right[i])-height[i]:0;
        }
        return ans;  
    }
}
