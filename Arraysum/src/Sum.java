public class Sum 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,6,7,-1,5,8,-2};
		int sum=6;
		arraySum(arr,sum);
	}
	static void arraySum(int[] arr,int sum)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					c++;
					System.out.println("sum of("+arr[i]+","+arr[j]+")are same");
				}
			}
		}
		System.out.println("total number:"+c);
	}
}
