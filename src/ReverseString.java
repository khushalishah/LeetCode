
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseWords("Let's take LeetCode contest"));
	}
	
public String reverseWords(String s) {
       String[] arr = s.split(" "); 
       StringBuilder sb = new StringBuilder();
       for(String a:arr) {
    	   sb.append(new StringBuilder(a).reverse()+" ");
       }
       return sb.substring(0, sb.length()-1).toString();
    }

}
