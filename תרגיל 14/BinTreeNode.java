package zazu;

public class BinTreeNode<T> {
	private T value;
	private BinTreeNode<T> left,right;
	public BinTreeNode(T v)
	{
		value = v;
		left = right = null;
	}
	public BinTreeNode(BinTreeNode<T> l,T v,BinTreeNode<T> r)
	{
		value = v;
		left = l;
		right = r;
	}
	public BinTreeNode<T> GetLeft()
	{
		return left;
	}
	
	public BinTreeNode<T> GetRight()
	{
		return right;
	}
	public T getInfo()
	{
		return value;
	}
	public void setInfo(T v)
	{
		value=v;
		
	}
	public void setLeftSon(BinTreeNode<T> l)
	{
		left=l;
	}
	public void setRightSon(BinTreeNode<T> r)
	{
		right=r;
	}

	public void Print()
	{
		
		System.out.println(value);
	}
}
