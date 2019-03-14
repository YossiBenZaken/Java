package yossi;

public class main {
	public static String f1(String str) {
		String s="";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				s+='*';
			else
				s+=str.charAt(i);
		return s;
	}
	public static String f2(String str) {
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				for(int j=0;j<str.charAt(i)-48;j++)
					s+='*';
			}
			else
				s+=str.charAt(i);
		}
		return s;
	}
	public static String f3(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)>= 'a' && str.charAt(i)<='z')
				s+=str.charAt(i);
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)>= '0' && str.charAt(i)<='9')
				s+=str.charAt(i);
		return s;
	}
	public static String f4(String str,String nums) {
		String s="";
		int i=0;
		while(i<str.length() && i<nums.length())
		{
			s+=str.charAt(i);
			s+=nums.charAt(i);
			i++;
		}
		while(i<nums.length())
		{
			s+=nums.charAt(i);
			i++;
		}
		while(i<str.length())
		{
			s+=str.charAt(i);
			i++;
		}
		return s;
	}
	public static void main(String[] args) {
		String str="abc",num="12345";
		System.out.println(f4(str,num));
	}

}
