package test2018;

public class Queue {
	private int[] Tor;
	private int front;
	private int rear;
	
	public Queue()
	{
		Tor=new int[100];
		front=0;
		rear=-1;
	}
	
	public void Insert(int num)
	{
		if(rear<99)
		{
			Tor[++rear]=num;
		}
		else
		{
			System.out.printf("Queue full");
		}
	}
	
	public int Remove()
	{
		int x;
		x=Tor[front++];
		return x;
	}
	
	public boolean IsEmpty()
	{
		if(rear<front)
			return true;
		return false;
	}

}