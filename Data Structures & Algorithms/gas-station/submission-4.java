class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for(int g : gas){
            totalgas += g;
        }
        for(int c : cost){
            totalcost += c;
        }
        if(totalcost > totalgas) return -1;

        int length = gas.length;
        // int [] cache = new int[length];
        // if(length==1){
            // return 0;
        // }
        // cache[0] = gas[0] - cost[0];
        // for(int i=1; i<length; i++){
            // if(cache[i-1]>=0){
                // cache[i] = cache[i-1]+gas[i]-cost[i];
            // }else{
                // cache[i] = cache[i]+gas[i]-cost[i];
            // }
        // }
        // for(int c : cache){
            // System.out.print(c + " ");
        // }
        // int j=length-1;
        // while(j>=0){
            // if(cache[j]<0){
                // break;
            // }
            // j--;
        // }
        // return j+1;
        int extra = 0;
        int ans = 0;
        int curr = 0;
        for(int i=length-1;i>=0;i--){
            curr = gas[i]-cost[i]+extra;
            if(curr>=0){
                ans=i;
                extra = 0;
            }else{
                extra = curr;
            }
        }
        return ans;
    }
}
