class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int length = position.length;
        int ans = 1;
        if(length == 1) return ans;

        List<int []>cars = new ArrayList<>();
        for(int i=0; i<length; i++){
            cars.add(new int[]{position[i],speed[i]});
        }
        Collections.sort(cars,(a,b)->b[0]-a[0]);
        // for(int [] a : cars){
        //     System.out.print(" "+a[0]+","+a[1]);
        // }
        double time = 1.0*(target - cars.get(0)[0])/cars.get(0)[1];
        for(int i=1;i<length;i++){
            if(1.0*(target - cars.get(i)[0])/cars.get(i)[1]>time){
                time = 1.0*(target - cars.get(i)[0])/cars.get(i)[1];
                ans++;
            }
        }
        return ans;
    }
}
