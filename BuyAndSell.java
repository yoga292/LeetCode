class BuyAndSell{
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else
            {
                profit=prices[i]-min;
                if(profit>maxprofit)
                {
                  maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}
