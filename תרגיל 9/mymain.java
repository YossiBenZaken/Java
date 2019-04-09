package mytor;

public class mymain {
	public static double Avg(Queue q1) {
		Queue q2 = new Queue();
		int sum=0,count=0,temp;
		while(!q1.IsEmpty())
		{
			count++;
			temp = q1.Remove();
			sum+=temp;
			q2.Insert(temp);
		}
		while(!q2.IsEmpty())
			q1.Insert(q2.Remove());
		return sum/(count*1.0);
	}
	public static Queue SortQ2(Queue q1,Queue q2) {
		Queue q3 = new Queue();
		while(!q1.IsEmpty() && !q2.IsEmpty())
		{
			q3.Insert(q2.Remove());
			q3.Insert(q1.Remove());
		}
		while(!q1.IsEmpty()){
			q3.Insert(q1.Remove());
		}
		while(!q2.IsEmpty()){
			q3.Insert(q2.Remove());
		}
		while(!q3.IsEmpty())
			q2.Insert(q3.Remove());
		return q2;
	}
	public static Queue SortQueue(Queue q1) {
		Queue q2 = new Queue();
		Queue q3 = new Queue();
		int min,temp;
		while(!q1.IsEmpty())
		{
			min=q1.Remove();
			while(!q1.IsEmpty())
			{
				temp=q1.Remove();
				if(min>temp)
				{
					q2.Insert(min);
					min = temp;
				}
				else {
					q2.Insert(temp);
				}
			}
			q3.Insert(min);
			 while (!q2.IsEmpty())
	                q1.Insert(q2.Remove());
		}
		return q3;
	}
	public static Queue NewSort(Queue q1) {
		Queue q2 = new Queue();
		Queue q3 = new Queue();
		int temp,temp2;
		while(!q1.IsEmpty())
		{
			temp=q1.Remove();
			q2.Insert(temp);
			while(!q1.IsEmpty())
			{
				temp2=q1.Remove();
				if(temp!=temp2)
					q3.Insert(temp2);
			}
			while(!q3.IsEmpty())
				q1.Insert(q3.Remove());
		}
		return q2;
	}
	public static void main(String[] args) {
		Queue q1 = new Queue();
		Queue q3 = new Queue();
		q1.Insert(10);
		q1.Insert(10);
		q1.Insert(50);
		q1.Insert(20);
		q1.Insert(50);
		q1.Insert(100);
		q3=NewSort(q1);
		while(!q3.IsEmpty())
		{
			System.out.println(q3.Remove());
		}
	}

}
