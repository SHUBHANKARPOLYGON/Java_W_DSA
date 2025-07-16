package lec17;

public class word_search {
	
	public static boolean find(int row,int col, char[][]board,int i,String word, int[][] arr) {
		if(i==word.length()) {
			return true;
		}
		
		if(row<0||row>=board.length||col<0||col>=board[0].length) {
			return false;
		}
		if(board[row][col]!=word.charAt(i) || arr[row][col]==1) {
			return false;
		}
		arr[row][col]=1;
		
		boolean up=find(row-1,col,board,i+1,word,arr);
		boolean down=find(row+1,col,board,i+1,word,arr);
		boolean left=find(row,col-1,board,i+1,word,arr);
		boolean right=find(row,col+1,board,i+1,word,arr);
		
		arr[row][col]=0;
		return(up||down||left||right);
	}

	public static void main(String[] args) {
		char[][] board={{'A','B','C','E'},
					   {'S','F','C','S'},
					   {'A','D','E','E'}};
		
		String word="ABCCED";
		int arr[][]=new int[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean check=find(i,j,board,0,word,arr);
					if(check==true) {
						System.out.println(true);
						return;
					}
				}
			}
		}
	}
}
