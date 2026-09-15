class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
        const length = height.length;
        let total = 0;
        if(length < 2){
            return total;
        }

        const leftMax = new Array(length).fill(0);
        leftMax[1] = height[0];
        const rightMax = new Array(length).fill(0);
        for(let i=2;i<length;i++){
            leftMax[i] = Math.max(height[i-1],leftMax[i-1]);
        }
        rightMax[length-2] = height[length-1];
        for(let i=length-3; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i+1]);
        }

        let h = 0
        for(let i=0; i<length; i++){
            h = Math.min(leftMax[i],rightMax[i]);
            total += h > height[i] ? h - height[i] : 0;
        }
        return total;
    }
}
