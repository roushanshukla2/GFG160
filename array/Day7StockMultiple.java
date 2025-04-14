package array;

/*
 Initialize:
min = Integer.MAX_VALUE
profit = 0
lastProfit = 0
Loop through the array:
Keep tracking the lowest price (min) until prices rise.
Find a peak where price stops rising.
Calculate profit = peak - min
If profit > lastProfit, update lastProfit = profit
Repeat this pattern.
 */
class Day7StockMultiple {

	public int maximumProfit(int prices[]) {
        int n=prices.length;
        int i=0,profit=0;
        
        while(i<n-1)
        {
            while(i<n-1 && prices[i+1] <= prices[i])
                i++;
            if(i==n-1)
                break;
            int buy= prices[i++];
            while(i<n && prices[i]>=prices[i-1])
                i++;
            int sell= prices[i-1];
            
            profit+=sell-buy;
        }
        return profit;
    }

}
