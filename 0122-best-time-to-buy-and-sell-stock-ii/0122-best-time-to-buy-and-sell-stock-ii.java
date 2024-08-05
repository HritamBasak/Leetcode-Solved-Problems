class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
        return 0;

        int minprice=prices[0];
        int maxprofit=0;
        int sum=0;
        for(int i=1;i<prices.length-1;i++)
        {
            if(prices[i]<=prices[i-1] && prices[i]<=prices[i+1])
            {
                minprice=prices[i];//6
            }
            if(prices[i]>=prices[i-1] && prices[i]>=prices[i+1])
            {
                maxprofit=prices[i]-minprice;//9-6=3;
                sum+=maxprofit;
                System.out.println(sum);
                minprice=prices[i];
            }
        }
        if(prices[prices.length-1]>prices[prices.length-2])
        {
            sum+=(prices[prices.length-1]-minprice);
            return sum;
        }
        if(maxprofit==0 && sum==0)
        {
            sum=prices[(prices.length-1)]-prices[0];
        }
        return (sum<0)?0:sum;
    }
}