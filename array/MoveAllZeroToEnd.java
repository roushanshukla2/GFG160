package array;

public class MoveAllZeroToEnd {
	public int[] moveZero(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) {
				for(int j=i;i<arr.length;j++)
				{
					if(arr[j+1]!=0)
					{
						arr[i]=arr[j];
						arr[j]=0;
					}
				}
			}
		}
		return arr;
	}
}
