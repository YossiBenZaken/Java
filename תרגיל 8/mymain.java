package javaa;

public class mymain {
	public static boolean F1(String str) {
		for(int i=0,c=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(') c++;
			else if(str.charAt(i)==')') c--;
			if(c<0) return false;
		}
		return true;
	}
	public static String F2(String str) {
		String str_new="";
		int i=0;
		Stack<Character> s= new Stack<Character>();
		while(i<str.length()) {
			while(i<str.length() &&str.charAt(i)!=' ') {
				s.Push(str.charAt(i));
				i++;
			}
			while(!s.IsEmpty()) {
				str_new+=s.Pop();
			}
			str_new+=" ";
			i++;
		}
		return str_new;
	}
	public static void main(String[] args) {
		String M="225511",N="162";
		int i;
		boolean Flag=true;
		Stack<Character> s = new Stack<Character>();
		for(i=0;i<M.length();i+=2) {
			if(M.charAt(i) == M.charAt(i+1))
				s.Push(M.charAt(i));
		}
		i=0;
		while(!s.IsEmpty()) {
			if(N.charAt(i++)!=s.Pop()) {
				Flag = false;
			}
		}
		if(Flag) System.out.println("True");
		else System.out.println("False");
	}

}
