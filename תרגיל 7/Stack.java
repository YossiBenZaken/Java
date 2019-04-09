package java11;

public class Stack {
	private int [] arr;
	private int sp;
	
	public Stack()
	{
		arr=new int[100];
		sp=-1;
	}
	public void Push(int item)
	{
		if(sp>99)
			System.out.println("Stack is full");
		else
			arr[++sp]=item;
	}
	
	public int Pop()
	{
		return arr[sp--];
	}

	public boolean IsEmpty()
	{
		if(sp==-1)
			return true;
		return false;
	}
	public int Top()
	{
		return arr[sp];
	}
}
