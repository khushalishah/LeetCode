//Problem 21
public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeList list = new MergeList();
		ListNode result = list.mergeTwoLists(null, list.new ListNode(1));
		while(result != null) {
			System.out.print(result.val+", ");
			result = result.next;
		}

	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1==null && l2==null)
			 return null;
		 ListNode result = new ListNode(0);
		 ListNode l = result;
	        while(l1!=null || l2!=null) {
	        	l.next = new ListNode(0);
	        	l = l.next;
	        	if(l1==null) {
	        		l.val = l2.val;
	        		l2 = l2.next;
	        	}else if(l2 == null) {
	        		l.val = l1.val;
	        		l1 = l1.next;
	        	}else if(l1.val>l2.val) {
	        		l.val = l2.val;
	        		l2 = l2.next;
	        	}else {
	        		l.val = l1.val;
	        		l1 = l1.next;
	        	}
	        }
	        return result.next;
	 }
	 
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

}
