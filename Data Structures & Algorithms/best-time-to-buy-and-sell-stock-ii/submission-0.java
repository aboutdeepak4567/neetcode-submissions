class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;

        while (i < prices.length - 1) {

            // find local minimum (small)
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            int buy = prices[i];

            // find local maximum (large)
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            int sell = prices[i];

            profit += (sell - buy);
        }

        return profit;
    }
}