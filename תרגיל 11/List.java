package hw11;

public class List<T> {
private Node <T> first;
	
	public List()
	{
		first=null;
	}
	
	public void SetFirst(Node <T> f)
	{
		first=f;
	}
	public Node <T> GetFirst()
	{
		return first;
	}
	
	public Node <T> Insert (Node <T> pos, T x)
	{
		
		Node <T> temp=new Node <T>(x);
		if(pos == null)
		{
			temp.SetNext(first);
			first=temp;
		}
		else
		{
			temp.SetNext(pos.GetNext());
			pos.SetNext(temp);
		}
		return temp;
		
			
	}
	
	public Node <T> Remove(Node <T> pos )
	{
		
		if(pos==first)
		{
			first=pos.GetNext();
		}
		else
		{
			Node <T> ptr=this.GetFirst();
			while(ptr.GetNext()!=pos)
			{
				ptr=ptr.GetNext();
			}
			ptr.SetNext(pos.GetNext());
		}
		Node <T> nextpos=pos.GetNext();
		pos.SetNext(null);
		return nextpos;
						
	}
	public String PrintList()
	
	{
		Node <T> ptr=first;
		
		String str="";
		while(ptr!=null)
		{
			str+=ptr.PrintNode()  + " ";
			ptr=ptr.GetNext();
		}
		return str;
	}
}
