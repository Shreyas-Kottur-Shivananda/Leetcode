package leetCode;

public class StringtoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "-91283472332";
		
		int result=0;
		int sign = 1;
		int signcheck = 0;
		
		
		for (int i = 0; i < s.length();i++) {
			
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
			}
			else if (Character.isDigit(s.charAt(i))) {
				
				if (result > Integer.MAX_VALUE / 10 ||
	                    (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
	                result = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	                break;
				}
				result = result * 10 + (s.charAt(i) - '0');
			}
			else if ((Character.toString(s.charAt(i)).equals("+") || Character.toString(s.charAt(i)).equals("-")) ) {
				sign = s.charAt(i) == '-'?-1:1;
				signcheck++;
				continue;
			}	 
				 else
					  break;
			}
		
		if (result == 0) {
			System.out.println("zero");
		}
		
		else if (result == Integer.MIN_VALUE || result == Integer.MAX_VALUE) {
			System.out.println(result);
			
		}
		
		else {
			result = result * sign;
			System.out.println(result);
			
		}
		
		}

	
	

}
