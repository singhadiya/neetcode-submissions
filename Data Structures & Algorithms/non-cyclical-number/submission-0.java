class Solution {
    private Set<Integer>s = new HashSet<>();

    public boolean isHappy(int n) {
        if(n == 1) return true;
        
        s.add(n);
        int square_sum = 0;
        //  System.out.println("n : "+n);
        while(n>=10){
            square_sum += (n%10)*(n%10);
            // System.out.print(" ," + n%10);
            // System.out.println(" square_sum : "+square_sum);
             n = n/10;
        }
        // System.out.println(" ," + n%10);
        square_sum += n*n;
        if(s.contains(square_sum)) return false;
        return isHappy(square_sum);
    }
}
