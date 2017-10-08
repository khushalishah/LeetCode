
public class NumberComplement {
	
	public static void main(String args[]) {
		NumberComplement nc = new NumberComplement();
		System.out.println(nc.findComplement(5));
	}

	public int findComplement(int num) {
		System.out.println(Integer.numberOfLeadingZeros(num));
		System.out.println(Integer.toBinaryString(~num));
		return (int)Long.parseLong(Integer.toBinaryString(~num),2);       
    }
	
	byte convertDecimalToBinary(int num){
		return Byte.parseByte(Integer.toBinaryString(num));
	}
	
}
