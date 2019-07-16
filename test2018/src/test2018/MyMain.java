package test2018;

public class MyMain {
	public static Stack<Integer> f1(Stack<Integer> s1){
		Stack <Integer> Even = new Stack<Integer>();
		Stack <Integer> Odd = new Stack<Integer>();
		while(!s1.IsEmpty())
		{
			int temp = s1.Pop();
			if(temp%2==0)
				Even.Push(temp);
			else
				Odd.Push(temp);
		}
		while(!Even.IsEmpty())
		{
			s1.Push(Odd.Pop());
			s1.Push(Even.Pop());
		}
		return s1;
	}
	public static int f2(List<Integer> l)
	{
		Node<Integer> p = l.GetFirst();
		int max=p.GetInfo(),max2=p.GetNext().GetInfo();
		if(max2>=max)
		{
			int temp=max;
			max=max2;
			max2=temp;
		}
		p=p.GetNext().GetNext();
		while(p!=null)
		{
			if(p.GetInfo()>=max)
			{
				max2=max;
				max=p.GetInfo();
			}
			else if(p.GetInfo() >max2 && p.GetInfo()<=max)
			{
				max2=p.GetInfo();
			}
			p=p.GetNext();
		}
		return max2;
	}
	public static Queue f3(Queue q1,Queue q2)
	{
		Queue q3 = new Queue();
		int temp=0,num;
		Stack <Integer> s1 = new Stack<Integer>();
		while(!q1.IsEmpty())
			s1.Push(q1.Remove());
		Stack <Integer> s2 = new Stack<Integer>();
		while(!q2.IsEmpty())
			s2.Push(q2.Remove());
		Stack <Integer> s3 = new Stack<Integer>();
		while(!s1.IsEmpty() && !s2.IsEmpty())
		{
			num = s1.Pop() + s2.Pop()+temp;
			temp = num/10;
			s3.Push(num%10);
		}
		while(!s1.IsEmpty())
		{
			num = s1.Pop() + temp;
			temp = num/10;
			s3.Push(num%10);
		}
		while(!s2.IsEmpty())
		{
			num = s2.Pop() + temp;
			temp = num/10;
			s3.Push(num%10);
		}
		while(!s3.IsEmpty())
		{
			q3.Insert(s3.Pop());
		}
		return q3;
	}
	public static void main(String[] args) {
		/*Targil1
		Stack <Integer> s1 = new Stack<Integer>();
		s1.Push(5);
		s1.Push(9);
		s1.Push(2);
		s1.Push(4);
		s1.Push(8);
		s1.Push(3);
		s1 = f1(s1);
		while(!s1.IsEmpty())
			System.out.println(s1.Pop());
		List<Integer> l = new List<Integer>();
		Node<Integer> p = l.GetFirst();
		p=l.Insert(p, 3);
		p=l.Insert(p, 12);
		p=l.Insert(p,3);
		p=l.Insert(p, 12);
		p=l.Insert(p, 6);
		p=l.Insert(p, 1);
		System.out.print(f2(l));*/
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		q1.Insert(3);
		q1.Insert(4);
		q1.Insert(5);
		q1.Insert(7);
		q1.Insert(5);
		q1.Insert(8);
		q1.Insert(6);
		q1.Insert(1);
		q1.Insert(9);
		q2.Insert(6);
		q2.Insert(1);
		q2.Insert(9);
		q1=f3(q1,q2);
		while(!q1.IsEmpty())
			System.out.print(q1.Remove());
	}

}
