package hw13;

public class MyMain {
	//static int count=0;
	public static int Pow(int x,int y) {
		if(y==0) return 1;
		else return x*Pow(x,y-1);
	}
	public static int Multi(int x,int y) {
		if(y==0) return 0 ;
		return x+Multi(x,y-1);
	}
	public static void Print1(int n) {
		if(n>0)
			Print1(n-1);
		for(int i=1;i<=n;System.out.print("*"),i++);
		System.out.println();
	}
	public static void Print2(int n) {
		if(n>0) {
			for(int i=1;i<=n;System.out.print("*"),i++);
			System.out.println();
			Print2(n-1);
		}
	}
	public static void Print3(String str) {
		if(str.length()>0) {
			System.out.print(str.charAt(str.length()-1));
			Print3(str.substring(0, str.length()-1));
		}
	}
	public static int howManyChar(String s,char c) {
		if(s.length()>0)
		{
			if(s.charAt(0)==c)
				return 1+howManyChar(s.substring(1),c);
			else 
				return howManyChar(s.substring(1),c);
		}
		else return 0;
	}
	public static boolean newOrder(int n) {
		return n%10 >= n/10%10 ? true:false;
	}
	public static void main(String[] args) {
		//System.out.println(Multi(2,4));
		//Print3("Yossi");
		//System.out.println(howManyChar("Yossi",'i'));
		//System.out.println(newOrder(32));
	}

}
