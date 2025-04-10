package array;

public class MaxCircularSumDay12 {
	
	    // Kadane's Algorithm to find max subarray sum
	    private int kadanes(int[] a) {
	        int sum = a[0], answer = a[0];
	        for (int i = 1; i < a.length; i++) {
	            sum += a[i];
	            if (sum < a[i])
	                sum = a[i];
	            answer = Math.max(answer, sum);
	        }
	        return answer;
	    }

	    // Function to find maximum circular subarray sum.
	    public int circularSubarraySum(int arr[]) {
	        if (arr.length == 0)
	            return 0;

	        int maxNormal = kadanes(arr);  // Case 1: non-wrapping max
	        int totalSum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            totalSum += arr[i];
	            arr[i] = -arr[i]; // Invert for min subarray
	        }

	        int maxWrap = totalSum + kadanes(arr); // totalSum - minSubarray
	        if (maxWrap == 0)
	            return maxNormal;

	        return Math.max(maxNormal, maxWrap);
	    }

}
