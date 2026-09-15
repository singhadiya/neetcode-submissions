class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean []dp = new boolean[length+1];
        dp[0] = true;
        for(int i=0;i<length;i++){
            for(String wd :wordDict){
                int l = wd.length();
                if(i+1>=l && dp[i-l+1] &&  s.substring(i-l+1,i+1).equals(wd)){
                    dp[i+1]=true;
                    break;
                }
            }
            for(boolean d : dp){
            System.out.print(d+" ");
            }
            System.out.println();
        }
        return dp[length];
        
    }
}
