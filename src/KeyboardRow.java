import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {

	static String[] words = {"Hello", "Alaska", "Dad", "Peace"};
	char[][] alphabets = {{'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'},
			{'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'},
			{'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardRow kr = new KeyboardRow();
		String[] result = kr.findWords(words);
		for(String r:result) {
			System.out.println(r);
		}
	}

	public String[] findWords(String[] words) {
		ArrayList<String> result = new ArrayList<>();
		for(String word:words) {
			int firstChar = word.charAt(0);
			int level = 2;
			for(int j=0;j<alphabets[0].length;j++) {
				if(firstChar == alphabets[0][j]) {
					level = 0;
					break;
				}
			}
			for(int j=0;j<alphabets[1].length;j++) {
				if(firstChar == alphabets[1][j]) {
					level = 1;
					break;
				}
			}

			boolean flag = true;

			for(int i=1;i<word.length();i++) {
				int chars = word.charAt(i);
				boolean flag1 = false;
				for(int j=0;j<alphabets[level].length;j++) {
					if(chars == alphabets[level][j]) {
						flag1 = true;
						break;
					}
				}
				if(!flag1) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				result.add(word);
			}
		}
		return result.toArray(new String[result.size()]);
	}

}
