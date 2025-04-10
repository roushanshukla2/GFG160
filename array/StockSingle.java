package array;

public class StockSingle {
	public int maximumProfitSingle(int[] prices)
	{
   	 int min=Integer.MAX_VALUE;
	 
   	int maxProfit=0;
   	for(int i=0;i<prices.length;i++)
   	{
   		
   		if(prices[i]<min)
   			min=prices[i];
   		
   		int Profit=prices[i]-min;
   		
//   		If profit > lastProfit, update lastProfit = profit
   		if(maxProfit<Profit)
   		{
   			maxProfit=Profit;
   		}
   	}
   	return maxProfit;
	}
}
