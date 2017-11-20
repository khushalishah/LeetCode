import java.util.HashSet;

public class IslandPerimater {

	HashSet<Integer> visited = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandPerimater per = new IslandPerimater();
		System.out.println(per.islandPerimeter(new int[][] {{1,1,1},{1,0,0}}));
	}

	public int islandPerimeter(int[][] grid) {
		int width = grid[0].length;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<width;j++) {
				if(grid[i][j] != 0) {
					return calculatePerimeter(i, j,grid);
				}
			}
		}
		return 0;
	}

	int calculatePerimeter(int row,int col,int[][] grid) {
		int count = 0;
		int no = row*grid[0].length+col;
		if(!visited.contains(no)) {
			visited.add(no);

			//check upper element
			if(row!=0) {
				if(grid[row-1][col] == 1) {
					count += calculatePerimeter(row-1, col, grid);
				}else {
					count++;
				}
			}else
				count++;

			//check lower element
			if(row!=grid.length-1) {
				if(grid[row+1][col] == 1) {
					count += calculatePerimeter(row+1, col, grid);
				}else {
					count++;
				}
			}else
				count++;

			//check left element
			if(col!=0) {
				if(grid[row][col-1] == 1) {
					count += calculatePerimeter(row, col-1, grid);
				}else {
					count++;
				}
			}else
				count++;

			//check right element
			if(col!=grid[0].length-1) {
				if(grid[row][col+1] == 1) {
					count += calculatePerimeter(row, col+1, grid);
				}else {
					count++;
				}
			}else
				count++;
			return count;
		}
		return 0;
	}

}
