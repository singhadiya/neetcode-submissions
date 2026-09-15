class Solution {
    public int reverseBits(int n) {
        int sum=0;
        for(int i=0;i<31;i++){
            sum  ^=  1 & n;
            n = n>>1;
            sum = sum<<1;
            System.out.println("n : "+n+" , sum : "+sum);
        }
        sum  ^=  1 & n;
        return sum;
    }
}
