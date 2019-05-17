package zazu;

public class mymain {
	public static int CountT(BinTreeNode<Integer> t, int x)
	{
		if(t!=null) {
			if(t.getInfo() == x)
				return 1+CountT(t.GetLeft(),x) + CountT(t.GetRight(),x);
			return CountT(t.GetLeft(),x) + CountT(t.GetRight(),x);
		}
		return 0;
	}
	public static int SumEven(BinTreeNode<Integer> t)
	{
		if(t!=null)
			if(t.getInfo()%2==1)
				return t.getInfo() + SumEven(t.GetLeft()) + SumEven(t.GetRight());
			else return SumEven(t.GetLeft()) + SumEven(t.GetRight());
		return 0;
	}
	public static boolean HaveEight(BinTreeNode<Integer> t) {
		if(t!=null)
		{
			if(HaveEight(t.GetLeft())==true || HaveEight(t.GetRight())==true)
				return true;
			if(t.getInfo() == 8) return true;
		}
		return false;
	}
	public static int CountLeaves(BinTreeNode<Integer> t) {
		if(t!=null)
		{
			if(t.GetLeft() == null && t.GetRight() == null)
				return 1;
			else return CountLeaves(t.GetLeft())+CountLeaves(t.GetRight());
		}
		return 0;
	}
	public static void main(String[] args) {
		BinTreeNode<Integer> t7 = new BinTreeNode<Integer>(7);
		BinTreeNode<Integer> t6 = new BinTreeNode<Integer>(6);
		BinTreeNode<Integer> t5 = new BinTreeNode<Integer>(5);
		BinTreeNode<Integer> t4 = new BinTreeNode<Integer>(4);
		BinTreeNode<Integer> t3 = new BinTreeNode<Integer>(t6,3,t7);
		BinTreeNode<Integer> t2 = new BinTreeNode<Integer>(t4,2,t5);
		BinTreeNode<Integer> t1 = new BinTreeNode<Integer>(t2,1,t3);
		//System.out.println(SumEven(t1));
		//System.out.println(CountT(t1,3));
		//System.out.println(HaveEight(t1));
		System.out.println(CountLeaves(t1));
	}

}
