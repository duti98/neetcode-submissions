class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int current = prices[0];
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < current) {
                current = prices[i];
            }
            profit = Math.max(profit, prices[i] - current);
        }
        return profit;
    }
}
