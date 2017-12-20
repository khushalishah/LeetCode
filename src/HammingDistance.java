//Problem 461
public class HammingDistance {
	
	public static void main(String args[]) {
		System.out.println(new HammingDistance().hammingDistance(1, 4));
	}

	
	public int hammingDistance(int x, int y) {
		String binaryX = convertToBinary(x);
		String binaryY = convertToBinary(y);
				
		int xl = binaryX.length();
		int yl = binaryY.length();
		int diff = xl-yl;
		
		if(diff<0) {
			diff = -(diff);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<diff;i++) {
				sb.append("0");
			}
			binaryX = sb.toString() + binaryX;
		}else if(diff>0) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<diff;i++) {
				sb.append("0");
			}
			binaryY = sb.toString() + binaryY;
		}
		
		int dist = 0;
		for(int i=binaryX.length()-1;i>=0;i--) {
			if(binaryX.charAt(i)!=binaryY.charAt(i)) {
				dist++;
			}
		}
			
       return dist; 
    }
    
    String convertToBinary(int x){
    	StringBuilder sb = new StringBuilder();
    	while(x!=0) {
    		sb.append(x%2);
    		x = x/2;
    	}
    	return sb.reverse().toString();
    }
	
}
