
public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInt in = new RomanToInt();
		System.out.println(in.romanToInt("DCXXI"));
	}

	public int romanToInt(String s) {
		int result = 0;
		for(int i=0;i<s.length();i++) {
			char next = 'E';
			if(i!=s.length()-1)
				next = s.charAt(i+1);
			switch(s.charAt(i)) {
			case 'I':
			case 'i':
				if(next == 'V' || next == 'v') {
					result += 4;
					i++;
				}else if(next == 'X' || next == 'x'){
					result += 9;
					i++;
				}else
					result += 1;
				break;
			case 'V':
			case 'v':
				result += 5;
				break;
			case 'X':
			case 'x':
				if(next == 'L' || next == 'l') {
					result += 40;
					i++;
				}else if(next == 'C' || next == 'c'){
					result += 90;
					i++;
				}else
					result += 10;
				break;
			case 'L':
			case 'l':
				result += 50;
				break;
			case 'C':
			case 'c':
				if(next == 'D' || next == 'd') {
					result += 400;
					i++;
				}else if(next == 'M' || next == 'm') {
					result += 900;
					i++;
				}else
					result += 100;
				break;
			case 'D':
			case 'd':
				result += 500;
				break;
			case 'M':
			case 'm':
				result += 1000;
				break;
			default :
				break;
			}
		}
		return result;
	}

}
