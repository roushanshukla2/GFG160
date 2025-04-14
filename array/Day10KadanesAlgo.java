package array;

public class Day10KadanesAlgo {
	int maxSubarraySum(int[] arr) {
        int maxResult=arr[0];
        int currentMax=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentMax=Math.max(arr[i],currentMax+arr[i]);
            maxResult=Math.max(maxResult,currentMax);
        }
            return maxResult;
    }
}
