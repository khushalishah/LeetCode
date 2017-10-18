
public class PalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromicSubString ps = new PalindromicSubString();
		System.out.println(ps.longestPalindrome("babadada"));
	}

	public String longestPalindrome(String s) {
		if (s.length()==1)
			return s;
		else if (s.length()==0)
			return "";
		String result=s.substring(0,1);
		int n = s.length();

		for(int i=0;i<n;i++) {
			char key = s.charAt(i);

			for(int j=n-1;j>=i+1;j--) {
				char comp = s.charAt(j);
				if(key == comp) {
					//characters match
					int k=i,l=j;
					boolean found = true;
					while(k<l) {
						if(s.charAt(++k) != s.charAt(--l)) {
							found = false;
							break;
						}
					}
					if(found) {
						String temp = s.substring(i, j+1);
						if(temp.length()>result.length())
							result = temp;
						break;
					}
				}
			}

		}

		return result;

	}

}
