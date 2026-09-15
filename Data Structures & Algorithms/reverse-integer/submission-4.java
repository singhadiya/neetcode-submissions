class Solution {
    public int reverse(int x) {

        int MAX = (int)Math.pow(2,31)-1;
        int MIN = (-1)*(int)Math.pow(2,31);
        int res = 0;
        int rem = 0;
        System.out.println("MAX/10 : "+MAX/10);
        System.out.println("MIN/10 : "+MIN/10);
        System.out.println("Math.abs(x) : "+Math.abs(x));
        while(x > 9 || x < -9){
            rem = x%10;
            x = x/10;
            res = res*10+rem;
            System.out.println("rem : "+rem + " , res : "+res);
            if((res==MAX/10 && x > MAX%10)||res>MAX/10){
                System.out.println("1 res : "+res+" , x : "+x);
                return 0;
            }
            if((res==MIN/10 && x < MIN%10)||res<MIN/10){
                System.out.println("2 res : "+res+" , x : "+x);
                return 0;
            }
        }
        res = res*10+x;
        return res; 
    }
}
