package array;

import java.util.Arrays;

public class LeftRotateByD {
    static void rotateArr(int arr[], int d) {
       
    	int n=arr.length;
    	// Reverse the first d elements
    	reverse(arr,0,d-1);
        	
        // Reverse the remaining n-d elements
        reverse(arr,d,n-1);
        
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[], int start, int end)
    {
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
    
    
    public static void main(String[] args) {
        rotateArr(new int[]{1, 2, 3, 4, 5, 6}, 2);
    }
}