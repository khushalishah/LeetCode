
public class ReshapeMatrix {


	public static void main(String args[]) {
		ReshapeMatrix rm = new ReshapeMatrix();
		int[][] temp = rm.matrixReshape(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}},42,5);
		rm.printMatrix(temp);
		rm.printMatrix(rm.matrixReshape(new int[][] {{1,2},{5,6}}, 1, 4));
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        
        if((row!=r && col!=c) && row*col == r*c) {
        	int newM[][] = new int[r][c];
        	int i=0,j=0;
        	
        	for(int k=0;k<r;k++) {
        		for(int l=0;l<c;l++) {
        			if(j==col) {
        				j=0;
        				i++;
        			}
        			newM[k][l] = nums[i][j];
        			j++;
        		}
        	}
        	
        	
        	
        	return newM;
        }else {
        	return nums;
        }
    }
	
	void printMatrix(int[][] node) {
		for(int i=0;i<node.length;i++) {
			for(int j=0;j<node[0].length;j++) {
				System.out.print(node[i][j]);
			}
			System.out.println();
		}
	}
	
}
