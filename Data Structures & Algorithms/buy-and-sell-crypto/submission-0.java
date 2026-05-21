class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        /*for (int i=0; i<prices.length; i++) {
            int price = nums[i];
            if ((map.get()))
            int difference
        }*/
        for (int i=0; i<prices.length; i++) {
            for (int k=i+1; k<prices.length; k++) {
                if ((prices[k] - prices[i]) > profit) {
                    profit = (prices[k] - prices[i]);
                }
            }
        }
        return profit;
    }
}
