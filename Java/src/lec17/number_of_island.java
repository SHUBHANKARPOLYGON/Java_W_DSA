package lec17;

public class number_of_island {

	public static void main(String[] args) {
		char [][] grid= {
				{'1','1','1','1','0'},
				{'1','1','1','1','0'},
				{'0','1','0','0','0'},
				{'0','0','0','0','0'}
		};
		int count=0;
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				
				if(grid[i][j]=='1') {
					count++;
					fill_OneToZero(grid,i,j);
				}
			}
		}
		System.out.println(count);
	}
	public static void fill_OneToZero(char grid[][],int row, int col) {
		if(row<0 || row>=grid.length ||col<0 ||col>=grid[0].length||grid[row][col]=='0')
			return;
		
		grid[row][col]='0';
		
		fill_OneToZero(grid,row-1,col); //up
		fill_OneToZero(grid,row+1,col);//down
		fill_OneToZero(grid,row,col-1);//left
		fill_OneToZero(grid,row,col+1);//right
	}

}
