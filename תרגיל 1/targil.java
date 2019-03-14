package yossibz;

import java.util.*;
public class targil {
	public static void kefel()
	{
		for(int i=1;i<=10;System.out.print("\n\n"),i++)
			for(int j=1;j<=10;System.out.print("\t"+ (i*j)),j++);
	}
	public static void prime() {
		int j;
		for(int i=2;i<=20;i++) {
			for(j=2;j<i;j++)
				if(i%j == 0) break;
			if(i==j)
				System.out.print(i + " ");
		}
	}
	public static void special() {
		int help;
		for(int i=1000;i<=9999;i++)
		{
			help = (i / 100) + (i%100);
			help *=help;
			if(help == i)
				System.out.print(" "+ i);
		}
	}
	public static void Piramid(int num)
	{
		int j;
		for(int i=1;i<=num;System.out.print("\n"),i++)
		{
			for(j=1;j<=num-i;System.out.print(" "),j++);
			for(j=1;j<=i;System.out.print(j),j++);
			for(j=i-1;j>=1;System.out.print(j),j--);
		}
	}
	public static void main(String[] args) {
		//kefel();
		//prime();
		//special();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=in.nextInt();
		in.close();
		Piramid(num);
	}

}
