import java.util.Stack;

public class PalindromNumber {

	public static void main(String arp[]) {
		PalindromNumber n = new PalindromNumber();
		System.out.println(n.isPalindrome(121));
	}
	
	public boolean isPalindrome(int x) {
		if(x<0)
			return false;
		String str = String.valueOf(x);
		int length = str.length();
		if(length==1)
			return true;
		while(length != 1 || length != 0) {
			if(str.charAt(0)!=str.charAt(length-1))
				return false;
			if(length==2 || length==3)
				return true;
			str = str.substring(1, length-1);
			length = str.length();
		}
		return true;
	}

	/*public boolean isPalindrome(int x) {
		Stack<Integer> stack = new Stack<>();
		if(x<0) {
			if(x == Integer.MIN_VALUE)
				return false;
			else
				x = x*-1;
		}
		String s = String.valueOf(x);
		if(s.length()==1)
			return true;
		boolean odd = true;
		if(s.length()%2==0)
			odd = false;
		int check = s.length()/2;
		do{
			stack.push(x%10);
			x = x/10;
		}while(stack.size()!=check);
		if(odd) {
			x = x/10;
		}
		boolean flag = true;
		while(x>0) {
			if(x%10 != stack.pop())
				return false;
			x = x/10;
		}
		return true;
	}*/

}
