class Solution {
    public int maxProfit(int[] prices) {
        
        int profit =0;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i;j<prices.length;j++)
            {
                profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
