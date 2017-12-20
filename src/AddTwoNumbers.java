
public class AddTwoNumbers {

	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public static void main(String args[]) {
		AddTwoNumbers nums = new AddTwoNumbers();
		ListNode l1 = nums.new ListNode(5);
		//l1.next = nums.new ListNode(4);
		//l1.next.next = nums.new ListNode(3);

		ListNode l2 = nums.new ListNode(5);
		//l2.next = nums.new ListNode(9);
		//l2.next.next = nums.new ListNode(4);

		ListNode result = nums.addNumbers(l1, l2);
		System.out.println(result.val);
		System.out.println(result.next.val);
		//System.out.println(result.next.next.val);

	}

	public ListNode addNumbers(ListNode l1, ListNode l2) {
		return addNumbers(l1,l2,0);
	}

	public ListNode addNumbers(ListNode l1, ListNode l2,int carry) {
		if(l1==null && l2==null && carry==0) {
			return null;
		}
		ListNode result = new ListNode(0);
		int val = carry;
		if(l1!=null)
			val += l1.val;
		if(l2!=null)
			val += l2.val;
		result.val = val%10;

		if(l1!=null || l2!=null)
			result.next = addNumbers(l1==null?null:l1.next,l2==null?null:l2.next,val>9?1:0);
		return result;
	}
}
