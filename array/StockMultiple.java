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
class StockMultiple {

    static int maximumProfitMultiple(int[] prices) {
    	
    	
    	int n = prices.length;
        int i = 0, profit = 0;

        while (i < n - 1) {

            // Step 1: Find the local minimum (buy point)
            while (i < n - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }
            if (i == n - 1) break; // reached end
            int buy = prices[i++];

            // Step 2: Find the local maximum (sell point)
            while (i < n && prices[i] >= prices[i - 1]) {
                i++;
            }
            int sell = prices[i - 1];

            // Step 3: Add profit
            profit += sell - buy;
        }

        return profit;
//    	 wrong

        
    }
}
