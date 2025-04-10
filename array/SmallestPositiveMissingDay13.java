package array;

import java.util.Arrays;

import jdk.internal.icu.util.CodePointTrie.Small;

public class SmallestPositiveMissingDay13 {
	 public int missingNumber(int[] arr)
	 {
		 Arrays.sort(arr);
		 int result=1;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<=0)
			 {
				 continue;
			 }
			 else if(arr[i]==result)
			 {

				 result++;
			 }
		 }
		 return result;
	 }
	 
	 public int missingNumberVistedArray(int[] arr)
	 {
		 int result=arr.length;
		 boolean[] vistedArray= new boolean[result];
		 for(int i=0;i<result;i++)
		 {
			 if(arr[i]>0 && arr[i]<=result)
				 vistedArray[arr[i]-1]=true;
		}
		 for(int i=0;i<result;i++)
		 {
			 if(!vistedArray[i])
				 return i+1;
		 }
		 return result+1;
	 }
	 public static void main(String[] args) {
		SmallestPositiveMissingDay13 obj= new SmallestPositiveMissingDay13();
		System.out.println(obj.missingNumberVistedArray(new int[] { 2, -3, 4, 1, 1, 7}));
	}

}
