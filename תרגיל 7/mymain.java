package java11;

public class mymain {

	public static int sum(Stack s1)
	{
		int sum=0;
		int temp;
		Stack s2=new Stack();
				
		while(s1.IsEmpty()!=true)
		{
			temp=s1.Pop();
			sum=sum+temp;
			s2.Push(temp);
		}
		while(s2.IsEmpty()!=true)
		{
			s1.Push(s2.Pop());
		}
		return sum;
	}
	public static int Max(Stack s1) {
		int max=s1.Pop(),temp;
		while(!s1.IsEmpty())
		{
			temp =s1.Pop();
			if(temp>max)
				max=temp;
		}
		return max;
	}
	public static Stack BigNumber(Stack s1)
	{
		Stack s2 = new Stack();
		int max=0,temp;
		if(!s1.IsEmpty())
		{
			temp = s1.Pop();
			max = temp;
			s2.Push(temp);
		}
		while(s1.IsEmpty()!=true)
		{
			temp=s1.Pop();
			if(temp > max)
				max=temp;
			s2.Push(temp);
		}
		while(s2.IsEmpty()!=true)
		{
			temp = s2.Pop();
			if(temp != max)
				s1.Push(temp);
		}
		s1.Push(max);
		return s1;
	}
	public static Stack EvenNumbers(Stack s1)
	{
		int temp;
		Stack s2=new Stack();
		while(s1.IsEmpty()!=true)
		{
			temp=s1.Pop();
			if(temp%2==0)
				s2.Push(temp);
		}
		return s2;
	}
	public static Stack2 chars(Stack3 s1)
	{
		Stack2 s2 = new Stack2();
		String temp;
		while(!s1.IsEmpty())
		{
			temp = s1.Pop();
			s2.Push(temp.charAt(0));
		}
		return s2;
	}
	public static void main(String[] args) {
		
		Stack3 s1=new Stack3();
		s1.Push("Yossi");
		s1.Push("Dima");
		s1.Push("Elinor");
		s1.Push("Nadav");
		Stack2 s2 = chars(s1);
		while(!s2.IsEmpty()) {
			System.out.println(s2.Pop());
		}
	}

}
