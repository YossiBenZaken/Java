package queue;

public class myMain {
	public static Queue<Integer> f2(Queue <Integer> q1) {
		Queue <Integer>q2=new Queue<Integer>();
		Stack <Integer>s=new Stack<Integer>();
		while(!q1.IsEmpty())
			s.Push(q1.Remove());
		while(!s.IsEmpty())
			q2.Insert(s.Pop());
		return q2;
	}
	public static Queue<Integer> f1(Queue <Integer> q1) {
		Queue <Integer>q2=new Queue<Integer>();
		Queue <Integer>q3=new Queue<Integer>();
		int temp;
		while(!q1.IsEmpty())
		{
			temp = q1.Remove();
			if(temp%2==0)
				q2.Insert(temp);
			else q3.Insert(temp);
		}
		while(!q3.IsEmpty())
			q2.Insert(q3.Remove());
		return q2;
	}
	public static void main(String[] args) {
		Queue <Integer>q1=new Queue<Integer>();
		q1.Insert(3);
		q1.Insert(10);
		q1.Insert(2);
		q1.Insert(11);
		q1.Insert(5);
		q1.Insert(4);
		q1.Insert(21);
		q1.Insert(17);
		q1.Insert(14);
		q1.Insert(6);
		q1.Insert(1);
		q1=f1(q1);
		while(!q1.IsEmpty())
			System.out.println(q1.Remove());
	}

}
