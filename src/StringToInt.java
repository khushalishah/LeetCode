
public class StringToInt {

	public static void main(String ar[]) {
		StringToInt s = new StringToInt();
		System.out.println(s.myAtoi("1"));
	}

	public int myAtoi(String str) {
		str = str.trim();
		int mul = 1;
		if(!str.equals("")) {
			if(str.charAt(0) == '+')
				str = str.substring(1, str.length());
			else if(str.charAt(0) == '-') {
				str = str.substring(1, str.length());
				mul = -1;
			}
		}else {
			return 0;
		}
		long result = 0;
		boolean removeZero = true;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				break;
			}else if(ch == '0' && removeZero)
				continue;
			else {
				result = result * 10 + Character.getNumericValue(ch);
				if(result>Integer.MAX_VALUE) {
					if(mul != -1)
						return Integer.MAX_VALUE;
					else
						return Integer.MIN_VALUE;
				}

				removeZero = false;
			}
		}
		return (mul==-1 && result!=0)?(int) (result*mul):(int)result; 
	}

}
