class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max_profit = 0;
        if(len == 1){
            return max_profit;
        }
        int buying_price = prices[0];
        int selling_price = prices[0];
        
        for(int i=1;i<len;i++){
           buying_price = Math.min(buying_price,prices[i]);
           max_profit = Math.max(max_profit,prices[i]-buying_price);
        }
        return max_profit; 
    }
}
