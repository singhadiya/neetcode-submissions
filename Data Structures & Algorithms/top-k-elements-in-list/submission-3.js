class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map();
        for(let num of nums){
            if(map.has(num)){
                map.set(num,map.get(num)+1);
            }else{
                map.set(num,1);
            }
        }
        let arr = [];
        map.forEach((v,k)=>{
            arr.push([v,k]);
        })
        arr.sort((a,b)=>b[0]-a[0]);
    
        let ans = [];
        let counter = 0;
        while(counter <k){
            ans.push(arr[counter][1]);
            counter++;
        }
        return ans;
    }
}
