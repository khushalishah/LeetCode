import java.util.Arrays;

public class MaximumBinaryTree {

	public static void main(String args[]) {
		MaximumBinaryTree tree = new MaximumBinaryTree();
		TreeNode node = tree.constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
		System.out.println(node.val);
		System.out.println(node.left.val);
		System.out.println(node.right.val);
	}

	//Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if(nums.length==0)
			return null;
		else if(nums.length==1) {
			return new TreeNode(nums[0]);
		}
		else {
			int max = nums[0];
			int location = 0;
				for(int i=1;i<nums.length;i++) {
					if(nums[i]>max) {
						max = nums[i];
						location = i;
					}
				}
				TreeNode node = new TreeNode(max);
				if(location != 0) {
					node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, location));
				}
				if (location != nums.length) {
					node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, location+1,nums.length));
				}
				return node;
			
		}
	}
	
	void printArray(int[] arr) {
		for(int a:arr) {
			System.out.print(a+",");
		}
	}

}
