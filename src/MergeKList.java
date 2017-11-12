
public class MergeKList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeKList list = new MergeKList();
		ListNode l1 = list.new ListNode(-1);
		ListNode l2 = list.new ListNode(6);
		ListNode l3 = list.new ListNode(2);
		l1.next = list.new ListNode(5);
		l1.next.next = list.new ListNode(11);
		l2.next = list.new ListNode(10);
		ListNode l4 = null;
		ListNode[] lists = new ListNode[] {null,l1,null,l2};
		ListNode result = list.mergeKLists(lists);
		while(result!=null) {
			System.out.print(result.val+", ");
			result = result.next;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==0)
			return null;
		if(lists.length==1)
			return lists[0];
		int size = (lists.length);
		if(lists.length%2!=0)
			size--;
		ListNode[] newList = new ListNode[lists.length%2==0?(lists.length/2):(lists.length/2+1)];
		int index = 0;
		for(int i=0;i<size;i=i+2) {
			if(lists[i]==null && lists[i+1]==null) {
				continue;
			}else if(lists[i] == null) {
				newList[index] = lists[i+1];
			}else if(lists[i+1] == null) {
				newList[index] = lists[i];
			}else {
				newList[index] = mergeTwoList(lists[i],lists[i+1]);
			}
			index++;
		}
		if(lists.length%2!=0) {
			newList[newList.length-1] = lists[lists.length-1];
		}
		return mergeKLists(newList);
	}

	ListNode mergeTwoList(ListNode l1,ListNode l2) {
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

	void printListNode(ListNode li){
		while(li!=null) {
			System.out.print(li.val+", ");
			li = li.next;
		}
		System.out.println();
	}

	/*public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0){
			return null;
		}
		ListNode result = new ListNode(0);
		ListNode li = result;

		ArrayList<ListNode> alist = new ArrayList<>(Arrays.asList(lists));
		alist.removeAll(Collections.singleton(null));

		int location = 0;


		while(!alist.isEmpty()) {

			int smallest = Integer.MAX_VALUE;

			for(int i=0;i<alist.size();i++) {
				ListNode e = alist.get(i);
					if(e.val<smallest) {
						smallest = e.val;
						location = i;
					}
			}

			ListNode small = alist.get(location);
			li.next = small;
			li = li.next;
			alist.remove(small);
			if(small.next!=null) {
				alist.add(location, small.next);
			}
		}

		return result.next;
	}*/

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

}
