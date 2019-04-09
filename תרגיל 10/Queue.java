package queue;

public class Queue<T> {
	private T[] t;
	private int front,rear;
	public Queue() {
		t=(T[]) new Object[100];
		front=0;
		rear=-1;
	}
	public void Insert(T num)
	{
		if(rear<99)
		{
			t[++rear]=num;
		}
		else
		{
			System.out.printf("Queue full");
		}
	}
	
	public T Remove()
	{
		T x;
		x=t[front++];
		return x;
	}
	
	public boolean IsEmpty()
	{
		if(rear<front)
			return true;
		return false;
	}
}
