import java.util.Stack;

public class BaseBallGame {

	public static void main(String args[]) {
		BaseBallGame bg = new BaseBallGame();
		System.out.println(bg.calPoints(new String[] {"5","2","C","D","+"}));
	}
	
	public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(String element:ops) {
        	if(element.equals("C")) {
        		sum -= stack.pop();
        	}else if(element.equals("D")) {
        		int no = 2*stack.peek();
        		sum += no;
        		stack.push(no);
        	}else if(element.equals("+")) {
        		int no1 = stack.pop();
        		int no2 = stack.peek();
        		int total = no1 + no2;
        		sum += total;
        		stack.push(no1);
        		stack.push(total);
        	}else {
        		int no = Integer.parseInt(element);
        		stack.push(no);
        		sum += no;
        	}
        }
        return sum;
    }
	
}
