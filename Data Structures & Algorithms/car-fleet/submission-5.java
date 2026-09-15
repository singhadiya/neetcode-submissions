class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        double max=0;
        int count=0;
        double time=0;
        int len = position.length;
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        for(int i=0 ; i<len ; i++){
            time = (double)(target - pair[i][0])/pair[i][1];
            if(time > max){
                count++;
                max = Math.max(time,max);
            }
            System.out.println("index : "+i+",time : "+time+", count : "+count);
        }
        return count;
    }
}
