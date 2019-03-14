package yossibz;

class yossibz {
	public static void func1(int []a)
	{
		int sum=0,sum2=1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			sum2*=a[i];
		}
		System.out.println("Sum = " + sum + " Avg = " + sum/(float)a.length + " Multi = " + sum2);
	}
	public static void func2(int []a)
	{
		int i,help=a[a.length-1];
		for(i=a.length-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=help;
	}
	public static void func3(int []a)
	{
		int temp;
		for(int i=0;i<a.length;i+=2)
		{
			temp = a[i];
			a[i]=a[i+1];
			a[i+1] = temp;
		}
	}
	public static int[] func4(int []a) {
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
				c++;
		}
		int [] n = new int [c];
		for(int i=0,j=0;i<a.length;i++)
		{
			if(a[i]>=0)
				n[j++]=a[i];
		}
		return n;
	}
	public static void func5(int []a)
	{
		for(int i=a.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				a[i]+=a[j];
			}
		}
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int [] n= func4(a);
		//func1(a);
		func2(a);
		func3(a);
		func5(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}

}
