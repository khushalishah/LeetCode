
public class NumberComplement {
	
	public static void main(String args[]) {
		NumberComplement nc = new NumberComplement();
		System.out.println(nc.findComplement(5));
	}

	public int findComplement(int num) {
		String binary = Integer.toBinaryString(num);
		String complement = Integer.toBinaryString(~num);
		complement = complement.substring(complement.length()-binary.length());
		return Integer.parseInt(complement,2);       
    }
	
	byte convertDecimalToBinary(int num){
		return Byte.parseByte(Integer.toBinaryString(num));
	}
	
}
