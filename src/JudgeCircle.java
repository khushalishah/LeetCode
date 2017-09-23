
public class JudgeCircle {
	
	int x,y;

	public static void main(String args[]) {
		JudgeCircle jc = new JudgeCircle();
		System.out.println(jc.judgeCircleRoute("LLLL"));
	}
	
	public boolean judgeCircleRoute(String moves) {
		
		x=0;
		y=0;
		
		for(int i=0;i<moves.length();i++) {
			char move = moves.charAt(i);
			switch(move) {
			case 'L':
				x = x - 1;
				break;
			case 'R':
				x = x+1;
				break;
			case 'U':
				y = y +1;
				break;
			case 'D':
				y = y - 1;
				break;
				
			}
			
		}
		if(x==0 && y==0) {
			return true;
		}
        return false;
    }
	
}
