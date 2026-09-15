class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        res[len-1]=0;
        int counter;
        for(int i=0;i<len-1;i++){
            counter = 0;
            for(int j=i+1;j<len;j++){
               if(temperatures[j]>temperatures[i]){
                counter = j-i;
                break;
               }
            }
            res[i]=counter;
        }
        return res;
    }
}
