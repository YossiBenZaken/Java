package java11;

public class Stack3 {
	private String [] arr;
	private int sp;
	
	public Stack3()
	{
		arr=new String[100];
		sp=-1;
	}
	public void Push(String item)
	{
		if(sp>99)
			System.out.println("Stack is full");
		else
			arr[++sp]=item;
	}
	
	public String Pop()
	{
		return arr[sp--];
	}

	public boolean IsEmpty()
	{
		if(sp==-1)
			return true;
		return false;
	}
	public String Top()
	{
		return arr[sp];
	}
}
