import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombination {

	char[][] letters = new char[][] {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
		{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

		public static void main(String ar[]) {
			LetterCombination lc = new LetterCombination();
			System.out.println(lc.letterCombinations("2"));
		}

		public List<String> letterCombinations(String digits) {
			Queue<String> queue = new LinkedList<>();
			for(int i = 0;i<digits.length();i++) {
				int ch = Integer.parseInt(digits.charAt(i)+"");
				if (queue.isEmpty()) {
					queue.add("");
				}
				Queue<String> newQ = new LinkedList<>();
				while(!queue.isEmpty()) {
					String temp = queue.poll();
					for(int j=0;j<letters[ch-2].length;j++) {
						String str = temp + letters[ch-2][j];
						//System.out.println(temp);
						newQ.add(str);
					}
				}
				queue.addAll(newQ);
			}
			return new LinkedList<>(queue);
		}


}
