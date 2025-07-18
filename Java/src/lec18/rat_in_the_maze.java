package lec18;

public class rat_in_the_maze {
	
	//rat in the maze using backtracking
	public static void main(String[] args) {
		int mat[][]= {{1,0,0,0},
			      {1,1,0,1},
			      {1,1,0,0},
			      {0,1,1,1}};
		
		find("",0,0,mat);

	}
	public static void find(String ans, int row, int col, int mat[][]) {
		
		if(row==mat.length-1&&col==mat[0].length-1) {
			System.out.println(ans);
			return;
		}
		
		if(row<0||col<0||row>=mat.length||col>=mat[0].length||mat[row][col]==0) {
			return;
		}
		
		mat[row][col]=0;
		find(ans+"U", row-1,col,mat); //up
		find(ans+"D", row+1,col,mat); //down
		find(ans+"L", row,col-1,mat); //left
		find(ans+"R", row,col+1,mat); //right
		mat[row][col]=1;
	}

}
