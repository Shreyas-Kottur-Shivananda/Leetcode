package leetCode;

public class PallindromeEx {
	
	public static void main(String[] args) {
		
		int x = -121;
		int result = 0;
		
		int original = x;
		
		while(x != 0) {
			int r = x % 10;
			if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 ))
			{
				System.out.println(false);
			}
			result = (result  * 10) + r;
			x = x/ 10;
		
			
		}
	
		if (original == result && result >= 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
	}

}
