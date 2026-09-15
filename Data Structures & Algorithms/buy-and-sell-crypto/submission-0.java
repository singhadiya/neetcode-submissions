class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int max_profit = 0;
        int array_length = prices.length;
        int sell_price = prices[0];
        if(array_length==1){
            return max_profit;
        }
        int i = 1;
        while(i<array_length){
            sell_price = prices[i];
            max_profit = Math.max(max_profit,sell_price-buy_price);
            buy_price = (sell_price - buy_price < 0) ? sell_price: buy_price;
            i++; 
        }
        return max_profit;
    }
}
