import java.util.HashMap;
import java.util.HashSet;

//Problem 3
public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubString ls = new LongestSubString();
		System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
	}
	
	 public int lengthOfLongestSubstring(String s) {
		 if (s.length()==0)
			 return 0;
	      int result = 1;
	      int startingLocation = 0;
    	  HashMap<Character, Integer> map = new HashMap<>();
	      for(int i=0;i<s.length();i++) {
	    	  char ch = s.charAt(i);
	    	  if(map.containsKey(ch) && map.get(ch)>=startingLocation) {
	    		  int length = i-startingLocation;
	    		  if(result<length)
	    			  result = length;
	    		  startingLocation = map.get(ch) + 1;
	    	  }else if(i==s.length()-1) {
	    		  int length = i-startingLocation+1;
	    		  if(result<length)
	    			  result = length;
	    	  }
	    	  map.put(ch, i);
	      }
	      return result;
	    }

}
