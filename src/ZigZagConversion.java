
public class ZigZagConversion {


	public static void main(String ar[]) {
		ZigZagConversion zz = new ZigZagConversion();
		System.out.println(zz.convert("ABCDE", 3));
	}

	public String convert(String s, int numRows) {
		if(numRows==1)
			return s;
		else if(numRows == 2)
			return "ACB";
		int length = s.length();
		char[] arr = new char[length];
		int row = 0,j=0;
		double line = (numRows/2.0);

		for(int i=0;i<length;i++,j++) {
			if(((numRows+1)*j+row)>=length) {
				row++;
				j=0;
			}

			arr[i] = s.charAt((numRows+1)*j+row);
			//System.out.print(arr[i]);
			if(row==line && numRows>1) {
				int temp = (numRows+1)*(j)+row+((numRows-1)/2)+1;
				if(temp<=s.length()) {
					i++;
					arr[i] = s.charAt(temp);
					//System.out.print(arr[i]);
				}

			}
		}
		return String.valueOf(arr);
	}
}
