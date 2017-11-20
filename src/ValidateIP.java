
public class ValidateIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateIP ip = new ValidateIP();
		System.out.println(ip.validIPAddress("1e1.4.5.6"));
		System.out.println(ip.validIPAddress("172.16.254.1"));
		System.out.println(ip.validIPAddress("172.16.254.01"));
		System.out.println(ip.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
		System.out.println(ip.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
		System.out.println(ip.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
		System.out.println(ip.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
	}

	public String validIPAddress(String IP) {
		String result = "Neither";
		if(IP.endsWith(".") || IP.endsWith(":"))
			return result;
		if(!IP.equals(""))
			if(IP.contains(".")) {
				result = checkForIPv4(IP);
			}else if(IP.contains(":")) {
				result = checkForIPv6(IP);
			}

		return result;
	}

	String checkForIPv4(String IP) {
		String result = "IPv4";
		String str[] = IP.split("\\.");
		if(str.length!=4)
			return "Neither";
		for(String s:str) {
			if((s.startsWith("0") && !s.equals("0")) || !s.matches("^[0-9]+$")) {
				result = "Neither";
				break;
			}else {
				try {
					if(Integer.parseInt(s)>255) {
						result = "Neither";
						break;
					}
				}catch(NumberFormatException e) {
					result = "Neither";
					break;
				}
			}
		}
		return result;
	}

	String checkForIPv6(String IP) {
		String result = "IPv6";
		String str[] = IP.split(":");
		if(str.length!=8)
			return "Neither";
		for(String s:str) {
			if(s.length()>4 || !s.matches("^[a-fA-F0-9]*$") || s.equals("")) {
				result = "Neither";
				break;
			}
		}
		return result;
	}

}
