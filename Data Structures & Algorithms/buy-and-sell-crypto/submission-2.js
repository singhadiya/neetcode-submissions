class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        const length = prices.length;
        let profit = 0;
        if(length == 1){
            return profit;
        }
        let buyValue = prices[0];
        for(let i=1; i<length; i++){
            buyValue = Math.min(buyValue,prices[i]);
            profit = Math.max(profit,prices[i]-buyValue);
        }
        return profit;
    }
}
