
public class RegExMatching {


	public static void main(String args[]) {
		RegExMatching reg = new RegExMatching();
		System.out.println(reg.isMatch("daba", "*a"));
		String s = "aab";
		System.out.println(s.matches("c//*a//*b"));
	}
	
	public boolean isMatch(String s, String p) {
		int j=0;
		
		if(s.length()==0) {
			if(p.equals("*"))
				return true;
			else 
				return false;
		}
		
		if(p.equals(""))
			return true;
		
		for(int i=0;i<s.length();i++) {
			char sch = s.charAt(i);
			char pch;
			if (j>=p.length())
				return false;
			else
				pch = p.charAt(j);
			
			if(pch == '.')
				j++;
			else if(pch == '*') {
				if(j+1 <p.length()) {
					if(s.charAt(i)==p.charAt(j+1)) {
						j++;
						i--;
					}
				}
			}else if(sch == pch)
				j++;
			else {
				return false;
			}
		}
		if(p.length()>s.length()) {
			if(!p.contains("*"))
			return false;
			else if(s.charAt(s.length()-1) != p.charAt(p.length()-1) && p.charAt(p.length()-1)!='.')
				return false;
			else if(!p.replaceAll("//*", "").equals(s))
				return false;
			else 
				return true;
		}
		return true;
	}

	/*public boolean isMatch(String s, String p) {
		boolean result = true;
		int i = 0,j=0;
		int sl = s.length();
		int pl = p.length();
		int lastIndexStar = -1;

		if(p.equals("."))
			if(sl==1)
				return true;
			else 
				return false;
		if(p.equals("*"))
			return true;
		if(p.equals(".*") || p.equals("*.") && sl>0)
			return true;

		while(i<sl && j<pl) {

			char schar = s.charAt(i);
			char pchar = p.charAt(j);

			if(schar == pchar) {
				i++;
				j++;
			}else if(pchar == '.') {
				i++;
				j++;
			}else if(pchar == '*') {
				lastIndexStar = j;
				j++;
				if(s.charAt(i)!=p.charAt(j))
					i++;
			}else {
				if(lastIndexStar != -1) {
					j = lastIndexStar + 1;
					i++;
				}
				else
					return false;
			}

		}
		if(sl!=pl) {
			if(i < sl-1 && p.charAt(pl-1) != '*')
				return false;
			else if(j < pl-1)
				return false;
		}
		return result;
	}*/

}
