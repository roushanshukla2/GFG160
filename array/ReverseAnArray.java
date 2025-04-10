package array;

import java.util.Arrays;

public class ReverseAnArray {
	public void reverseArray(int arr[]) {
		int start=0;
		int last=arr.length-1;
        if(arr.length<2)
        {
        	System.out.println(Arrays.toString(arr));
        	return;        
        }
        	while(start<=last)
        {
        	int temp=arr[start];
        	arr[start]=arr[last];
        	arr[last]=temp;
        	start++;
        	last--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
