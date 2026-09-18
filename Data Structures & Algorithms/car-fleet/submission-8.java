class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int ans = 0;
        if(target == 0 || position.length==1) return 1;

        int[][]data = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            data[i][0]=position[i];
            data[i][1]=speed[i];
        }
        Arrays.sort(data,(a,b)->a[0]-b[0]);
        Deque<Double>stack = new ArrayDeque<>();
        for(int i=0;i<data.length;i++){
            double time = (double)(target-data[i][0])/(double)data[i][1];
            stack.push(time);     
        }
        double currentTime = stack.pop();
        while(stack.isEmpty()==false){
            if(stack.peek()>currentTime){
                ans++;
                currentTime = stack.pop();
                stack.push(currentTime);
            }else{
                stack.pop();
            }
        }
        return ++ans;
    }
}
