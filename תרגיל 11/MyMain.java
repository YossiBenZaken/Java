package hw13;

public class MyMain {
	public static int Sum(List <Integer> list)
	{
		int sum=0;
		Node <Integer> p=list.GetFirst();
		while(p!=null)
		{
			sum+=p.GetInfo();
			p=p.GetNext();
		}
		return sum;
	}
	public static int MinNumber(List <Integer> list)
	{
		Node <Integer> p=list.GetFirst();
		int min=p.GetInfo();
		while(p!=null) {
			if(p.GetInfo()<min)
			{
				min = p.GetInfo();
			}
			p=p.GetNext();
		}
		return min;
	}
	public static int MaxNumber(List <Integer> list)
	{
		Node <Integer> p=list.GetFirst();
		int max=p.GetInfo();
		while(p!=null) {
			if(p.GetInfo()>max)
			{
				max = p.GetInfo();
			}
			p=p.GetNext();
		}
		return max;
	}
	public static void PrintUpAvg(List <Integer> list) {
		int count=0;
		Node <Integer> p=list.GetFirst();
		double avg=Sum(list);
		while(p!=null)
		{
			count++;
			p=p.GetNext();
		}
		p=list.GetFirst();
		avg/=count;
		while(p!=null)
		{
			if(p.GetInfo()>avg) {
				System.out.print(p.GetInfo()+" ");
			}
			p=p.GetNext();
		}
		System.out.println();
	}
	public static void  DeleteOdd(List <Integer> list) {
		Node <Integer> p=list.GetFirst();
		while(p.GetInfo()%2==0) {
			list.Remove(p);
			p=list.GetFirst();
		}
		while(p.GetNext() != null) {
			if(p.GetNext().GetInfo()%2==0)
			{
				list.Remove(p.GetNext());
			}
			else
				p=p.GetNext();
		}
	}
	public static boolean HaveNumber(List <Integer> list,int num)
	{
		Node <Integer> p1=list.GetFirst();
		while(p1!=null) {
			if(p1.GetInfo()==num)
				return false;
			p1=p1.GetNext();
		}
		return true;
	}
	public static List<Integer> MaxMinList(List <Integer> list){
		List <Integer> list2 = new List<Integer>();
		Node <Integer> p2=list2.GetFirst();
		int max = MaxNumber(list);
		int min = MinNumber(list);
		System.out.println(max+" "+min);
		for(int i=min+1;i<max;i++)
		{
			if(HaveNumber(list,i))
			{
				p2=list2.Insert(p2, i);
			}
		}
		return list2;
	}
	public static List<Integer> ReverseList(List<Integer> list){
		List <Integer> list2=new List<Integer>();
		Node <Integer> p=list.GetFirst(),p2=list2.GetFirst();
		Stack <Integer> s=new Stack<Integer>();
		while(p!=null)
		{
			s.Push(p.GetInfo());
			p=p.GetNext();
		}
		while(!s.IsEmpty())
			p2=list2.Insert(p2, s.Pop());
		return list2;
	}
	public static void DeleteListIndex(List<Integer> list) {
		Node <Integer> p1=list.GetFirst();
		for(int i=1;p1!=null;i++)
		{
			if(p1.GetInfo() % i == 0) {
				p1=list.Remove(p1);
			}
			else p1=p1.GetNext();
		}
	}
	public static List<Integer> Avg(List<Integer> L1,List<Integer> L2){
		List <Integer> L3=new List<Integer>();
		Node <Integer> p1=L1.GetFirst(),p2=L2.GetFirst(),p3=L3.GetFirst();
		int sum,count;
		while(p2!=null)
		{
			sum=0;
			count=p2.GetInfo();
			while(count-->0)
			{
				sum+=p1.GetInfo();
				p1=p1.GetNext();
			}
			p3=L3.Insert(p3, sum/p2.GetInfo());
			p2=p2.GetNext();
		}
		return L3;
	}
	public static void main(String[] args) {
		List <Integer> list1=new List<Integer>(),list2=new List<Integer>();
		Node <Integer> p1,p2;
		p1=list1.Insert(null, 80);
		p1=list1.Insert(p1, 35);
		p1=list1.Insert(p1, 90);
		p1=list1.Insert(p1, 85);
		p1=list1.Insert(p1, 55);
		p1=list1.Insert(p1, 75);
		p1=list1.Insert(p1, 60);
		p1=list1.Insert(p1, 80);
		p1=list1.Insert(p1, 90);
		p2=list2.Insert(null, 3);
		p2=list2.Insert(p2, 2);
		p2=list2.Insert(p2, 4);
		//List <Integer> list2=MaxMinList(list1);
		//List <Integer> list2=ReverseList(list1);
		//System.out.println(list2.PrintList());
		//System.out.println("Sum = " + Sum(list1));
		//System.out.println("Min = " + MinNumber(list1));
		//System.out.println("Min = " + MaxNumber(list1));
		//PrintUpAvg(list1);
		//System.out.println(list1.PrintList());
		//DeleteOdd(list1);
		//System.out.println(list1.PrintList());
		//DeleteListIndex(list1);
		System.out.println(Avg(list1,list2).PrintList());
	}

}
