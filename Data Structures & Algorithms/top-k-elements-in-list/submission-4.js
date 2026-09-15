class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        // let map = new Map();
        // for(let num of nums){
        //     if(map.has(num)){
        //         map.set(num,map.get(num)+1);
        //     }else{
        //         map.set(num,1);
        //     }
        // }
        // let arr = [];
        // map.forEach((v,k)=>{
        //     arr.push([v,k]);
        // })
        // arr.sort((a,b)=>b[0]-a[0]);
    
        // let ans = [];
        // let counter = 0;
        // while(counter <k){
        //     ans.push(arr[counter][1]);
        //     counter++;
        // }
        // return ans;
        const length = nums.length;
        //let arr = Array.from({length: length+1}, () => []);
        let arr = Array.from({length : length +1},()=>[]);

        let map = new Map(); 
        for(let num of nums){
            if(map.has(num)){
                map.set(num,map.get(num)+1);
            }else{
                map.set(num,1);
            }
        }
        map.forEach((v,k)=>{
            arr[v].push(k);
        });

        let res = [];
        for(let i=length; i>=0; i--){
             if(arr[i].length>0){
                  for(let j=0; j<arr[i].length; j++){
                     res.push(arr[i][j]);{
                        if(res.length==k){
                            return res;
                        }
                     }
                  }
             }
        }
        return res;
    
    }
}
