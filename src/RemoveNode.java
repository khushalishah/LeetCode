
public class RemoveNode {

	public static void main(String args[]) {
		RemoveNode node = new RemoveNode();
		int nums[] = new int[] {1,2,3,4,5};
		ListNode head = node.new ListNode(0);
		ListNode li = head;
		for(int num:nums) {
			li.next = node.new ListNode(num);
			li = li.next;
		}
		ListNode result = node.removeNthFromEnd(head.next, 5);
		while(result!=null) {
			System.out.print(result.val+", ");
			result = result.next;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null)
			return null;
		if(head.next==null && n==1) 
			return null;
		int length = 1;
		int totalLength = 1;
		ListNode l1 = head;
		ListNode l2 = head;

		while(l2.next!=null) {
			l1 = l1.next;
			if(l2.next.next!=null) {
				l2 = l2.next.next;
				totalLength += 2;
			}else {
				l2 = l2.next;
				totalLength++;
			}
			length++;
		}
		int count = totalLength-n;

		if(count<length) {
			l1 = head;
			if(count==0)
				return head.next;
			else {
				int total = count;
				for(int i=1;i<total;i++) {
					l1 = l1.next;
				}
				if(l1.next!=null)
					l1.next = l1.next.next;
				else
					l1.next = null;
			}
		}else {
			for(int i=length;i<count;i++) {
				l1 = l1.next;
				System.out.println(l1.val);
			}
			if(l1.next!=null)
				l1.next = l1.next.next;
			else
				l1.next = null;
		}

		return head;
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

}
