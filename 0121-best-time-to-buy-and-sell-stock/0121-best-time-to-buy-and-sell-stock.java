class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[prices.length-1];
        int maxProfit=0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]<max)
            {
                maxProfit=Math.max(maxProfit,Math.abs(prices[i]-max));//5
            }
            max=Math.max(max,prices[i]);//6
        }
        return maxProfit;
    }
}