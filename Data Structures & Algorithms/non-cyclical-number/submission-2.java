class Solution {
    public boolean isHappy(int n) {
       Set<Integer>s = new HashSet<>();
       while(!s.contains(n) && n !=1){
        s.add(n);
        int temp = 0;
        while(n>9){
            temp += (n%10)*(n%10);
            n = n/10;
        }
        temp += n*n;
        n = temp;
       }
       if(n==1) return true;
       return false;
    }
}
