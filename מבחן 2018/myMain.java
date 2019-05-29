package test2018;

public class myMain {
	public static int f1(Stack<Integer> s1)
	{
		Stack<Integer> s2 = new Stack<Integer>();
		int num=0,count=0,maxc=0,max=0;
		while(!s1.IsEmpty())
		{
			num = s1.Top();
			count =0;
			while(!s1.IsEmpty())
			{
				if(num == s1.Top()) {
					count++;
					s1.Pop();
				}
				else
				{
					s2.Push(s1.Pop());
				}
			}
			if(count>maxc)
			{
				max = num;
				maxc=count;
			}
			while(!s2.IsEmpty())
			{
				s1.Push(s2.Pop());
			}
		}
		return max;
	}
	public static boolean f2(List<Integer> l1)
	{
		Node <Integer> p = l1.GetFirst();
		int num1,num2;
		while(p.GetNext()!=null) {
			num1=p.GetInfo();
			num2=p.GetNext().GetInfo();
			p=p.GetNext();
			if(p.GetNext()!=null && (num1+num2) != p.GetNext().GetInfo())
			{
				return false;
			}
		}
		return true;
	}
	public static int f3(Queue q1,Queue q2)
	{
		int flag=0;
		Queue q3 = new Queue();
		int num,temp,min=-1;
		while(!q1.IsEmpty())
		{
			num=q1.Remove();
			while(!q2.IsEmpty())
			{
				temp=q2.Remove();
				q3.Insert(temp);
				if(temp == num)
					if(flag==0)
					{
						min = temp;
						flag=1;
					}
					else if(min>temp)
						min=temp;
			}
			while(!q3.IsEmpty()) q2.Insert(q3.Remove());
		}
		return min;
	}
	public static void main(String[] args) {
		/*Stack<Integer> s1 = new Stack<Integer>();
		s1.Push(5);
		s1.Push(4);
		s1.Push(2);
		s1.Push(4);
		s1.Push(5);
		s1.Push(4);
		System.out.println(f1(s1));
		List <Integer> list1=new List<Integer>();
		Node<Integer> p1=null;
		p1=list1.Insert(p1, 5);
		p1=list1.Insert(p1, 5);
		p1=list1.Insert(p1, 10);
		p1=list1.Insert(p1, 15);
		p1=list1.Insert(p1, 25);
		p1=list1.Insert(p1, 40);
		System.out.println(f2(list1));
		Queue Q1=new Queue(),Q2=new Queue();
		Q1.Insert(3);
		Q1.Insert(7);
		Q1.Insert(13);
		Q1.Insert(20);
		Q1.Insert(47);
		Q1.Insert(70);
		Q2.Insert(3);
		Q2.Insert(20);
		Q2.Insert(65);
		Q2.Insert(70);
		Q2.Insert(75);
		System.out.println(f3(Q1,Q2));*/
	}

}
