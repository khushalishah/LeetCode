
public class Haysack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Haysack h = new Haysack();
		System.out.println(h.strStr("mississippi" ,	"pi"));
	}
	
	public int strStr(String haystack, String needle) {
		if(needle.equals(""))
			return 0;
		if(haystack.equals(""))
			return -1;
		return haystack.indexOf(needle);
	}

	/*public int strStr(String haystack, String needle) {
		if(needle.equals(""))
			return 0;
		if(haystack.equals(""))
			return -1;
		int result = -1;
		int m = 0;
		for(int i =0;i<haystack.length();i++) {
			char ch = haystack.charAt(i);

			boolean found = true;
			
			if(ch == needle.charAt(0)) {
				result = i;
				m = i;
				for(int j=1;j<needle.length();j++) {
					i++;
					if(i>=haystack.length()) {
						return -1;
					}
					if(needle.charAt(j) != haystack.charAt(i)) {
						if(m!=result)
							i = m-1;
						else
							i = result;
						found = false;
						break;
					}
					if(haystack.charAt(i) == needle.charAt(0)) {
						m = i;
					}
				}
				if(found)
					break;
				else
					result = -1;
				
			}
			
		}
		return result;
	}*/

}
