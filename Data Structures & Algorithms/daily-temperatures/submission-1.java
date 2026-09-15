class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<int []>s = new Stack<>();
        
        for(int i=0; i<length; i++){
            while(!s.isEmpty() && s.peek()[1] < temperatures[i]){
                int [ ]temp = s.pop();
                res[temp[0]] = i-temp[0];
            }
            s.push(new int[]{i,temperatures[i]});  
        }

        return res;    
    }
}
