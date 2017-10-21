
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(123));
	}
	
public int reverse(int x) {
        long result = 0;
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
        	return (int) result;
        else{
        	int mul = 1;
        	if(x<0) {
        		mul = -1;
        		x = x*mul;
        	}
        	while(x>0) {
        		int temp = x%10;
        		
        		result = result*10+temp;
        		if(result>Integer.MAX_VALUE)
        			return 0;
        		x = x/10;
        	}
        	return ((mul==-1)?(int)(result*mul):(int)result);
        }
        		
        
        
    }

}
