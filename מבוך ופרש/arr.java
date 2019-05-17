package aaa;

public class arr {
	
	public static boolean maze(char[][]arr,int x,int y)
	{
		
		arr[x][y]='.';
		PrintArray2d(arr);
		if(x==arr.length-1)
		{
			return true;
		}
		if(x+1<arr.length && arr[x+1][y]== ' ') //down
			if(maze(arr,x+1,y))
				return true;
		if(y+1<arr[0].length && arr[x][y+1]== ' ') //right
			if(maze(arr,x,y+1))
				return true;
		if(y-1>=0 && arr[x][y-1]== ' ') //left
			if(maze(arr,x,y-1))
				return true;
		if(x-1>=0 && arr[x-1][y]== ' ') //up
			if(maze(arr,x-1,y))
				return true;
		arr[x][y]=' ';
		PrintArray2d(arr);
		return false;
		
			
	}
	
	public static void PrintArray2d(char [][]arr)
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		char [][] arr={{'#',' ','#','#','#','#','#','#'},
			           {'#',' ',' ',' ',' ',' ','#','#'},
			           {'#',' ','#',' ','#',' ',' ','#'},
			           {'#',' ','#',' ',' ','#',' ','#'},
			           {'#',' ','#','#',' ','#',' ','#'},
			           {'#',' ','#','#',' ','#',' ',' '},
			           {'#',' ',' ','#',' ',' ','#',' '},
			           {'#','#','#','#','#',' ','#','#'}};
		if(maze(arr,0,1)==true)
			System.out.println("good maze");
		else
			System.out.println("bad maze");
	}

}
