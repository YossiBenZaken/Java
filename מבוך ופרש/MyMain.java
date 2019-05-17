package hw14;

public class MyMain {
	public static int Max(int [][] arr) {
		int max=arr[0][0],i,j;
		for(i=0;i<arr.length;i++)
			for(j=0;j<arr[i].length;j++) 
				if(arr[i][j]>max)
					max = arr[i][j];
		return max;
	}
	public static void PrintSumRows(int [][] arr) {
		int i,j,sum;
		for(i=0;i<arr.length;i++)
		{
			for(j=0,sum=0;j<arr[i].length;sum+=arr[i][j],j++);
			System.out.println("Sum of row "+i+" = "+sum);
		}
	}
	public static void PrintArr(char [][] arr) {
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;System.out.print(arr[i][j]+" "),j++);
			System.out.println();
		}
		System.out.println();
	}
	public static boolean Game(char [][] Board,int x,int y)
	{
		Board[x][y]='*';
		PrintArr(Board);
		if(x==Board.length-1) return true;
		if(x+1<Board.length && Board[x+1][y]==' ')
			if(Game(Board,x+1,y))
				return true;
		if(y+1<Board[0].length && Board[x][y+1]==' ')
			if(Game(Board,x,y+1))
				return true;
		if(y-1>=0 && Board[x][y-1]==' ')
			if(Game(Board,x,y-1))
				return true;
		if(x-1>=0 && Board[x-1][y]==' ')
			if(Game(Board,x-1,y))
				return true;
		Board[x][y]=' ';
		PrintArr(Board);
		return false;
	}
	public static void main(String[] args) {
		int [][] arr = {{12,1,2,3},
						{1,3,4},
						{5,9,15,14,17},
						{9,4,2}};
		char [][] Board =  {{'X',' ','X','X','X','X','X','X','X'},
							{'X',' ','X','X','X','X','X','X','X'},
							{'X',' ','X','X','X','X','X','X','X'},
							{'X',' ','X',' ',' ',' ',' ',' ','X'},
							{'X',' ',' ',' ','X',' ','X',' ','X'},
							{'X','X','X','X','X','X','X',' ','X'}};
		if(Game(Board,0,1))
			System.out.println("Good");
		else
			System.out.println("Bad");
	}
}
