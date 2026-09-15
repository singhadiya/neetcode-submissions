class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]dp = new int[amount+1];
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int coin : coins){
                if(i == coin){
                    dp[i] = 1;
                }if(i < coin ){
                    if(dp[i]==0){
                        dp[i] = -1;
                    }
                }else{
                    if(dp[i]==0){
                        if(dp[i-coin]==-1){
                            dp[i]=-1;
                        }else{
                            dp[i]=dp[i-coin]+1;
                        }   
                    }else if(dp[i]==-1){
                        if(dp[i-coin]==-1){
                            dp[i]=-1;
                        }else{
                            dp[i]=dp[i-coin]+1;
                        } 
                    }else{
                         if(dp[i-coin]!=-1){
                            dp[i] = Math.min(dp[i],dp[i-coin]+1);
                        }
                    }
                }
            }
        }
        return dp[amount];
    }
}
