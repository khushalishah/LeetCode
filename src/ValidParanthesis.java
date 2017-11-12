import java.util.Stack;

public class ValidParanthesis {

	public static void main(String args[]) {
		ValidParanthesis vp = new ValidParanthesis();
		System.out.println(vp.isValid("()"));
	}

	public boolean isValid(String s) {
		if(s.equals(""))
			return true;
		if(s.length()%2!=0)
			return false;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == ']') {
				if(!stack.isEmpty()) {
					char bh = stack.pop();
					if(bh != '[')
						return false;
				}else {
					return false;
				}
			}else if(ch == '}') {
				if(!stack.isEmpty()) {
					char bh = stack.pop();
					if(bh != '{')
						return false;
				}else {
					return false;
				}
			}else if(ch == ')') {
				if(!stack.isEmpty()) {
					char bh = stack.pop();
					if(bh != '(')
						return false;
				}else {
					return false;
				}
			}else
				stack.push(ch);
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

}
