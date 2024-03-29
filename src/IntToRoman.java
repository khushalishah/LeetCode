//Problem 12
public class IntToRoman {
	
	public static void main(String ar[]) {
		IntToRoman ir = new IntToRoman();
		System.out.println(ir.intToRoman(2014));
		
	}
	
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
        while(num!=0) {
        	if(num>=1000) {
        		sb.append("M");
        		num = num-1000;
        	}else if(num>=900) {
        		sb.append("CM");
        		num = num - 900;
        	}else if(num>=500) {
        		sb.append("D");
        		num = num - 500;
        	}else if(num>=400) {
        		sb.append("CD");
        		num = num - 400;
        	}else if(num>=100) {
        		sb.append("C");
        		num = num-100;
        	}else if(num>=90) {
        		sb.append("XC");
        		num = num - 90;
        	}else if(num>=50) {
        		sb.append("L");
        		num = num - 50;
        	}else if(num>=40) {
        		sb.append("XL");
        		num = num - 40;
        	}else if(num>=10) {
        		sb.append("X");
        		num -= 10;
        	}else if(num>=9) {
        		sb.append("IX");
        		num -= 9;
        	}else if(num>=5) {
        		sb.append("V");
        		num -= 5;
        	}else if(num>=4) {
        		sb.append("IV");
        		num -= 4;
        	}else if(num>=1) {
        		sb.append("I");
        		num -= 1;
        	}
        }
        return sb.toString();
    }

}
