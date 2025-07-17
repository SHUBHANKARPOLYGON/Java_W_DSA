package lec18;

public class Sudoku_solver {

	public static void main(String[] args) {
		char board[][] = {
			    {'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}
			};
		fill(0,0,board);
	}
	public static void fill(int row,int col,char[][] board) {
		
		if(col==9) {
			row++;
			col=0;
		}
		
		if(row==9) {
			print(board);
			return;
			
		}
		
		
		if(board[row][col]!='.') {
			fill(row,col+1,board);
		}
		else {
			for(int i=1;i<=9;i++) {
				
				if(isSafe(i,row,col,board)==true) {
					board[row][col]=(char)((int)'0'+i);
					fill(row,col+1,board);
					board[row][col]='.';
				}
			}
		}
	}
		public static void print(char board[][]) {
			for(int i=0;i<board.length;i++) {
				for(int j=0;j<board[0].length;j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		}
		public static boolean isSafe(int num, int row, int col, char[][] board) {
			char ch=(char)('0'+num);
			
			for(int j=0;j<9;j++) {
				if(board[row][j]==ch) return false; 
			}
			
			for(int i=0;i<9;i++) {
				if(board[i][col]==ch) return false;
			}
			
			int Srow=(row/3)*3;
			int Scol=(col/3)*3;
			for (int i=Srow;i<Srow+3;i++) {
	            for (int j=Scol;j<Scol+3;j++) {
	                if (board[i][j] == ch) 
	                	return false;
	            }
	        }
		return true;
	}
}
