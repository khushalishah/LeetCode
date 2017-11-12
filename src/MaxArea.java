
public class MaxArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxArea ma = new MaxArea();
		System.out.println(ma.maxArea(new int[] {2,1}));
	}
	
	public int maxArea(int[] height) {
		int len = height.length, low = 0, high = len -1 ;  
		   int maxArea = 0;  
		   while (low < high) {  
		     maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));  
		     if (height[low] < height[high]) {  
		       low++;  
		     } else {  
		       high--;  
		     }  
		   }  
		   return maxArea; 
	}

	/*public int maxArea(int[] height) {
		int max = 0;
		int maxDist = 0;
		int maxAvg = 0;
		for(int i=0;i<height.length;i++) {
			int x1 = height[i];
			if(x1==0)
				continue;
			for(int j=0;j<i;j++) {
				int x2 = height[j];
				if(x2==0)
					continue;
				int dist = i-j;
				int avg = x1>x2?x2:x1;
				if(avg>maxAvg || dist>maxDist) {
					double temp = avg*dist;
					if(temp>max) {
						max = avg*dist;
						maxAvg = avg;
						maxDist = dist;
					}
				}
			}
		}
		return max;
	}*/

}
