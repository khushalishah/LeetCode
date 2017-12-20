
//Problem 617
public class MergeBinaryTree {
	
	//Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	    	
	    	if (t1 == null)
	             return t2;
	         if (t2 == null)
	             return t1;
	         t1.val += t2.val;
	         t1.left = mergeTrees(t1.left, t2.left);
	         t1.right = mergeTrees(t1.right, t2.right);
	         return t1;
	    }
	    
	    
	    	
	public static void main(String ar[]) {
		MergeBinaryTree tree = new MergeBinaryTree();
		TreeNode t1 = tree.new TreeNode(1);
		t1.left = tree.new TreeNode(3);
		t1.left.left = tree.new TreeNode(5);
		t1.right = tree.new TreeNode(2);
		
		TreeNode t2 = tree.new TreeNode(2);
		t2.left = tree.new TreeNode(1);
		t2.left.right = tree.new TreeNode(4);
		t2.right = tree.new TreeNode(3);
		t2.right.right = tree.new TreeNode(7);
		
		TreeNode result = tree.mergeTrees(t1, t2);
		System.out.println(result.val);
		System.out.println(result.left.val);
		System.out.println(result.right.val);
		System.out.println(result.left.left.val);
		System.out.println(result.left.right.val);
		System.out.println(result.right.right.val);
		  
	}

}
