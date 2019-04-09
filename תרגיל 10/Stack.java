package queue;

public class Stack <T>{
	private T[] arr;
	private int sp;

	public Stack()
	{
		arr=(T[]) new Object[100];
		sp=-1;
	} 
	public void Push(T item)
	{
		if(sp>99)
		   System.out.println("Stack is full");
		else
			arr[++sp]=item;
		
	}
	public T Pop()
	{
		return arr[sp--];
	}
	public boolean IsEmpty()
	{
		if(sp==-1)
			return true;
		return false;
	}
	public T Top()
	{
		return arr[sp];
	}
}
