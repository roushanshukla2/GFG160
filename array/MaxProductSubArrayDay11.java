package array;

public class MaxProductSubArrayDay11 {
	int maxProductGreedy(int[] arr) {
        int  leftToRight=1;
        int rightToLeft=1;
		int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
        	if(leftToRight==0)
        		leftToRight=1;
        	if(rightToLeft==0)	
        		rightToLeft=1;
        	leftToRight*=arr[i];
        	int j=arr.length-i-1;
        	rightToLeft*=arr[j];
        	maxProduct=Math.max(Math.max(leftToRight,rightToLeft), maxProduct);
        }
		return maxProduct;
    }
	
	int maxProductBruteForce(int[] arr) {
		int result=1;
		//updating soon;
		return result;
	}
	int maxProductOptimal(int[] arr) {
		int result=1;
		//updating soon;
		return result;
	}
}
