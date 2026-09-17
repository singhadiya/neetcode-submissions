class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        int leftmax = height[left];
        int rightmax = height[right];
        while(left<right){
            if(leftmax<rightmax){
                ans+= leftmax-height[left]>0?leftmax-height[left]:0;
                leftmax = Math.max(leftmax,height[left+1]);
                left++;

            }else{
                ans+= rightmax-height[right]>0?rightmax-height[right]:0;
                rightmax = Math.max(rightmax,height[right-1]);
                right--;
            }
        }
        // int[]left = new int[height.length];
        // int[]right = new int[height.length];
        // for(int i=1;i<height.length;i++){
        //     left[i]=Math.max(left[i-1],height[i-1]);
        //     right[height.length-1-i]=Math.max(right[height.length-i],height[height.length-i]);
        // }
        // int ans = 0;
        // for(int i=0;i<height.length;i++){
        //     ans += Math.min(left[i],right[i])-height[i]>0?Math.min(left[i],right[i])-height[i]:0;
        // }
        return ans;  
    }
}
