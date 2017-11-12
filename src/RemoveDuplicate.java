
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println(rd.removeDuplicates(new int[] {1,2,3,3,3,4,4,5,6,7,7,7,7,7,9}));
	}
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return 1;
        int location = 1;
        int num = nums[0];
        for(int i = 1;i<nums.length;i++) {
        	if(num != nums[i]) {
        		num = nums[i];
        		nums[location] = nums[i];
        		location++;
        	}
        	
        }
        printArray(nums);
        return location;
    }

	void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
}
