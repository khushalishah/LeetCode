import java.util.LinkedList;

public class FriendCircle {

	LinkedList<Integer> person = new LinkedList<>();

	public static void main(String args[]) {
		FriendCircle fc = new FriendCircle();
		int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
		System.out.println(fc.findCircleNum(M));
	}

	public int findCircleNum(int[][] M) {
		int count = 0;


		for(int i=0;i<M.length;i++) {
			person.add(i);
		}
		while(person.size()!=0) {
			int p = person.remove(0);
			count++;
			findFriends(p,M);
		}

		return count;
	}

	void findFriends(int p,int[][] M) {
		for(int i=0;i<M.length;i++) {
			int f = M[p][i];
			if(f==1 && p!=i) {
					if(person.remove(Integer.valueOf(i)))
						findFriends(i,M);
			}
		}
	}

}
