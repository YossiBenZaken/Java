package javaa;

public class Stack<T> {
	private T[] t;
	private int sp;
	public Stack()
	{
		t=(T[]) new Object[100];
		sp=-1;
	}
	public void Push(T item)
	{
		if(sp>99)
		   System.out.println("Stack is full");
		else
			t[++sp]=item;
		
	}
	public T Pop()
	{
		return t[sp--];
	}
	public boolean IsEmpty()
	{
		if(sp==-1)
			return true;
		return false;
	}
	public T Top()
	{
		return t[sp];
	}

}
