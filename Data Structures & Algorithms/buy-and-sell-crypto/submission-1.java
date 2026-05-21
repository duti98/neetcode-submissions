class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i=0; i<prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }

        /*for (int i=0; i<prices.length; i++) {
            for (int k=i+1; k<prices.length; k++) {
                if ((prices[k] - prices[i]) > profit) {
                    profit = (prices[k] - prices[i]);
                }
            }
        }*/
        return profit;
    }
}
