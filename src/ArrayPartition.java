import java.util.Arrays;

//Problem 561

public class ArrayPartition {
	public static void main(String args[]) {
		
	}
	
	public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	int n1 = nums[i];
        	int n2 = nums[++i];
        	
        	if(n1<=n2) {
        		sum += n1;
        	}else {
        		sum += n2;
        	}
        }
        return sum;
    }
}
