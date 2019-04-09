package java11;

public class Stack2 {
	private char [] arr;
	private int sp;
	
	public Stack2()
	{
		arr=new char[100];
		sp=-1;
	}
	public void Push(char item)
	{
		if(sp>99)
			System.out.println("Stack is full");
		else
			arr[++sp]=item;
	}
	
	public char Pop()
	{
		return arr[sp--];
	}

	public boolean IsEmpty()
	{
		if(sp==-1)
			return true;
		return false;
	}
	public char Top()
	{
		return arr[sp];
	}
}
