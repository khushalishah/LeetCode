//Problem 537
public class ComplexMultiplication {

	public static void main(String ar[]) {
		ComplexMultiplication cm = new ComplexMultiplication();
		System.out.println(cm.complexNumberMultiply("1+1i", "1+1i"));
	}
	
	public String complexNumberMultiply(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i=0;i<a.length();i++) {
        	char c = a.charAt(i);
        	if(c=='+') {
        		index = i;
        		break;
        	}
        	sb.append(c);
        }
        int w = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for(int i=index+1;i<a.length();i++) {
        	char c = a.charAt(i);
        	if(c=='i') {
        		break;
        	}
        	sb.append(c);
        }
        int x = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for(int i=0;i<b.length();i++) {
        	char c = b.charAt(i);
        	if(c=='+') {
        		index = i;
        		break;
        	}
        	sb.append(c);
        }
        int y = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for(int i=index+1;i<b.length();i++) {
        	char c = b.charAt(i);
        	if(c=='i') {
        		break;
        	}
        	sb.append(c);
        }
        int z = Integer.parseInt(sb.toString());
        
        return (w*y-x*z)+"+"+(w*z+x*y)+"i";
        
    }
	
}
