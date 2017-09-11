package assignment;

public class Arrays 
{
	int []arr;
	public Arrays(int []arr)
	{
		this.arr=arr;
	}
	public int[] sorted()
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		return arr;
	}	
}