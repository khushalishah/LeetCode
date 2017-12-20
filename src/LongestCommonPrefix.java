//Problem 14
public class LongestCommonPrefix {

	public static void main(String args[]) {
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(new String[] {"abc","ab","abd"}));
	}
	
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++) {
        	String temp = strs[i];
        	while(!temp.startsWith(sb.toString())) {
        		sb = new StringBuilder(sb.substring(0, sb.length()-1));
        	}
        }
        return sb.toString();
    }
	
}
